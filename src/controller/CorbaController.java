/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ConstantContent.KonstantBenutzer;
import ConstantContent.KonstantKartenStatus;
import ConstantContent.KonstantKunde;
import CorbaServer.CorbaConterollerInterfacePOA;
import CorbaServer.StructKarte;
import CorbaServer.StructKategorie;
import CorbaServer.StructVeranstaltung;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
import Hibernate.objecte.Benutzer;
import Hibernate.objecte.Karte;
import Hibernate.objecte.Kategorie;
import Hibernate.objecte.Kuenstler;
import Hibernate.objecte.Kunde;
import Hibernate.objecte.Veranstaltung;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

/**
 *
 * Bürgi • Dietrich • Fedorova • Shabanova
 */
public class CorbaController extends CorbaConterollerInterfacePOA {

    private UseCaseControllerBestellungErstellen ucb;
    private UseCaseControllerSearch ucs;
    private DataManager<Object> dm;
    private Benutzer benutzer;
    private ORB _orb;

    public void setORB(ORB orb) {
        _orb = orb;
    }

    public CorbaController() {

        ucb = new UseCaseControllerBestellungErstellen();
        ucs = new UseCaseControllerSearch();
        dm = new DataManager<>();
        benutzer = KonstantBenutzer.EXTERN;
    }

    @Override
    public StructVeranstaltung[] sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {

        Kuenstler k = dm.getKuenstlerNachName(kuenstler);
        Date date = new Date();
        List<Veranstaltung> list = ucs.searchFilter(ort, date, k);
        StructVeranstaltung[] veranstaltungsList = new StructVeranstaltung[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Veranstaltung v = list.get(i);
            veranstaltungsList[i] = new StructVeranstaltung(v.getVeranstaltungId(), v.getDatumUhrzeit().toString(), v.getName(), v.getVeranstaltungsort().getAdresse(), kuenstler);
        }
        return veranstaltungsList;
    }

    @Override
    public StructKategorie[] getKategorieVonVeranstaltung(int vid) {

        Veranstaltung veranstaltung = ucb.getVeranstaltungByID(vid);

        Object[] kat = veranstaltung.getKategories().toArray();
        StructKategorie[] result = new StructKategorie[kat.length];

        for (int i = 0; i < kat.length; i++) {
            Kategorie k = (Kategorie) kat[i];
            int ermaessigung = k.getVeranstaltung().getErmaessigung();
            int frei = dm.anzahlFreiePlatzeNachKategorie(k);
            double preis = k.getPreis().doubleValue();
            result[i] = new StructKategorie(k.getKategorieId(), k.getName(), preis, frei, ermaessigung);
        }
        return result;
    }

    @Override
    public StructKarte[] getAlleFeieKartenNachKategorie(int katid) {

        Kategorie k = ucb.getKategorieByID(katid);
        List<Karte> karten = ucb.getFreieKartenNachKategorie(k);

        StructKarte[] freieKarten = new StructKarte[karten.size()];

        for (int i = 0; i < karten.size(); i++) {
            Karte karte = karten.get(i);
            freieKarten[i] = new StructKarte(karte.getKartenId(), karte.getReihe(), karte.getSitzplatz());
        }

        return freieKarten;
    }

    @Override
    public void verkaufSpeichern(StructKarte[] listkarten) {

        Set<Karte> bestellteKartenSet = new HashSet<>();
        int statusFREI = KonstantKartenStatus.FREI.getKartenstatusId();

        Kunde kunde = KonstantKunde.ANONYMOUS;

        for (int i = 0; i < listkarten.length; i++) {

            Karte k = ucb.getKarteByID(listkarten[i].kartenId);
            if (dm.getKartenStatusId(k.getKartenId()) == statusFREI) {
                try {
                    ucb.karteKaufen(k, false); // ermassigung TODO
                } catch (SaveFailedException ex) {
                    Logger.getLogger(CorbaController.class.getName()).log(Level.SEVERE, null, ex);
                }
                bestellteKartenSet.add(k);
            } else {
                try {
                    ucb.kartenFreiGeben(bestellteKartenSet);
                } catch (SaveFailedException ex) {
                    Logger.getLogger(CorbaController.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    throw new KarteNichtVerfuegbarException(k.getKartenId());
                } catch (KarteNichtVerfuegbarException ex) {
                    Logger.getLogger(CorbaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            ucb.verkaufSpeichern(benutzer, kunde, bestellteKartenSet);
        } catch (Exception ex) {
            Logger.getLogger(CorbaController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
