/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ConstantContent.KonstantBenutzer;
import ConstantContent.KonstantKartenStatus;
import ConstantContent.KonstantKunde;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
import Hibernate.objecte.Benutzer;
import Hibernate.objecte.Karte;
import Hibernate.objecte.Kategorie;
import Hibernate.objecte.Kuenstler;
import Hibernate.objecte.Kunde;
import Hibernate.objecte.Veranstaltung;
import corba.CorbaConterollerInterfacePOA;
import corba.StructKarteBestellen;
import corba.StructKategorieAuswaehlen;
import corba.StructKategorieInformation;
import corba.StructKategorieKarte;
import corba.StructVeranstaltungAnzeigen;
import java.text.SimpleDateFormat;
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
    public corba.StructVeranstaltung[] sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {

        Kuenstler k = dm.getKuenstlerNachName(kuenstler);
       
         Date date = null;
        try {
            SimpleDateFormat sdfToDate = new SimpleDateFormat("dd.MM.yyyy");
            date = sdfToDate.parse(datum);
        } catch (Exception e) {
        }
        List<Veranstaltung> list = ucs.searchFilter(ort, date, k);
        corba.StructVeranstaltung[] veranstaltungsList = new corba.StructVeranstaltung[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Veranstaltung v = list.get(i);
            boolean erm = (v.getErmaessigung() == 1);
            veranstaltungsList[i] = new corba.StructVeranstaltung(v.getVeranstaltungId(), v.getDatumUhrzeit().toString(),
                    v.getName(), v.getVeranstaltungsort().getAdresse(), kuenstler, erm);
        }
        return veranstaltungsList;
    }

    @Override
    public StructKategorieInformation[] getKategorieInfoVonVeranstaltung(StructVeranstaltungAnzeigen veranstaltung) {

        Veranstaltung v = ucb.getVeranstaltungByID(veranstaltung.id);

        Object[] kat = v.getKategories().toArray();
        corba.StructKategorieInformation[] result = new corba.StructKategorieInformation[kat.length];

        for (int i = 0; i < kat.length; i++) {
            Kategorie k = (Kategorie) kat[i];
            int ermaessigung = k.getVeranstaltung().getErmaessigung();
            int frei = dm.anzahlFreiePlatzeNachKategorie(k);
            double preis = k.getPreis().doubleValue();
            result[i] = new corba.StructKategorieInformation(k.getKategorieId(), k.getName(), preis, frei, ermaessigung);
        }
        return result;
    }

    @Override
    public StructKategorieKarte getAlleFreieKartenNachKategorie(StructKategorieAuswaehlen kategorie) {

        Kategorie k = ucb.getKategorieByID(kategorie.id);
        List<Karte> karten = ucb.getFreieKartenNachKategorie(k);

        corba.StructKarte[] freieKarten = new corba.StructKarte[karten.size()];

        for (int i = 0; i < karten.size(); i++) {
            Karte karte = karten.get(i);
            freieKarten[i] = new corba.StructKarte(karte.getKartenId(), karte.getReihe(), karte.getSitzplatz());
        }

        return new StructKategorieKarte(freieKarten);
    }

    @Override
    public void verkaufSpeichern(StructKarteBestellen[] karten) {
        try {
            Set<Karte> bestellteKartenSet = new HashSet<>();
            int statusFREI = KonstantKartenStatus.FREI.getKartenstatusId();

            Kunde kunde = KonstantKunde.ANONYMOUS;

            for (int i = 0; i < karten.length; i++) {
                boolean erm = karten[i].ermaessigt;
                Karte k = ucb.getKarteByID(karten[i].kartenId);
               if (dm.getKartenStatusId(k.getKartenId()) == statusFREI) {
                        ucb.karteKaufen(k, erm);
                        bestellteKartenSet.add(k);
                    } else {
                        ucb.kartenFreiGeben(bestellteKartenSet);
                        throw new KarteNichtVerfuegbarException(k.getKartenId());
                    }
            }
                ucb.verkaufSpeichern(benutzer, kunde, bestellteKartenSet);
        } catch (Exception ex) {
            Logger.getLogger(CorbaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public StructKategorieInformation getKategorieInfo(int id) {
        Kategorie kat = ucb.getKategorieByID(id);
        int ermaessigung = kat.getVeranstaltung().getErmaessigung();
        int frei = dm.anzahlFreiePlatzeNachKategorie(kat);
        double preis = kat.getPreis().doubleValue();
        return new StructKategorieInformation(kat.getKategorieId(), kat.getName(), preis, frei, ermaessigung);

    }
}
