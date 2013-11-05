/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOKarte;
import DTO.objecte.DTOKarteBestellen;
import DTO.objecte.DTOKarteReservieren;
import DTO.objecte.DTOKategorieInformation;
import DTO.objecte.DTOKategorieKarte;
import DTO.objecte.DTOKategorienAuswaehlen;
import DTO.objecte.DTOKundenDaten;
import DTO.objecte.DTOVeranstaltung;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungInformation;
import DTO.objecte.DTOVeranstaltungSuchen;
import Hibernate.objecte.Benutzer;
import Hibernate.objecte.Karte;
import Hibernate.objecte.Kategorie;
import Hibernate.objecte.Kuenstler;
import Hibernate.objecte.Kunde;
import Hibernate.objecte.Veranstaltung;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * Bürgi • Dietrich • Fedorova • Shabanova
 */
public class RMIController extends UnicastRemoteObject implements RMIControllerInterface {

    private UseCaseControllerBestellungErstellen ucb;
    private UseCaseControllerSearch ucs;
    private DataManager<Object> dm;
    private Benutzer benutzer; // TODO

     public RMIController() throws RemoteException {
        super();
        ucb = new UseCaseControllerBestellungErstellen();
        ucs = new UseCaseControllerSearch();
        dm = new DataManager<>();
        benutzer = ucb.getBenutzerByID(2); // TODO
    }

    @Override
    public ArrayList<DTOVeranstaltungInformation> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler) throws RemoteException{
        ArrayList<DTOVeranstaltungInformation> veranstaltungDTOList = new ArrayList<DTOVeranstaltungInformation>();
        if( d == null){
            d = new Date();
        }
         Kuenstler k;
        if(kuenstler != null){
             k = dm.getKuenstlerNachName(kuenstler); 
        } else {
            k = null;
        }

        List<Veranstaltung> veranstaltungList = ucs.searchFilter(ort, d, k);
        for ( Veranstaltung v: veranstaltungList){
            Object[] ku = v.getKuenstlers().toArray();
            
            String  kuenstlerList = "";
            
            for(int i = 0; i< ku.length; i++  ){
                Kuenstler kk =(Kuenstler) ku[i];
                kuenstlerList+= kk.getName() +" "; 
           }
            
            veranstaltungDTOList.add(new DTOVeranstaltungInformation(v.getDatumUhrzeit(), v.getVeranstaltungsort().getAdresse(), kuenstlerList, v.getVeranstaltungId(),v.getName()));
        }
        
        return veranstaltungDTOList;
    }

    @Override
    public ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v) throws RemoteException {
        ArrayList<DTOKategorieInformation> kategorieDTOList = new ArrayList<>();
        Veranstaltung veranstaltung = ucb.getVeranstaltungByID(v.getId());
        Kategorie[] kat = (Kategorie[]) veranstaltung.getKategories().toArray();

        for (int i = 0; i < kat.length; i++) {
            Kategorie k = kat[i];
            int ermaessigung = k.getVeranstaltung().getErmaessigung();
            int frei = dm.anzahlFreiePlatzeNachKategorie(k);
            kategorieDTOList.add(new DTOKategorieInformation(k.getKategorieId(), k.getName(), k.getPreis(), ermaessigung, frei));
        }
        return kategorieDTOList;
    }

    @Override
    public DTOKategorieInformation getKategorieInfo(int id) throws RemoteException {
        Kategorie kat = ucb.getKategorieByID(id);
        int ermaessigung = kat.getVeranstaltung().getErmaessigung();
        int frei = dm.anzahlFreiePlatzeNachKategorie(kat);
        return new DTOKategorieInformation(kat.getKategorieId(), kat.getName(), kat.getPreis(), ermaessigung, frei);
    }

    @Override
    public DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat) throws RemoteException {
        Kategorie k = ucb.getKategorieByID(kat.getId());
        List<DTOKarte> kartenDTOList = new ArrayList<>();
        List<Karte> karten = ucb.getFreieKartenNachKategorie(k);
        for (Karte karte : karten) {
            kartenDTOList.add(new DTOKarte(karte.getKartenId(), karte.getReihe(), karte.getSitzplatz()));
        }
        return new DTOKategorieKarte(kartenDTOList);
    }

    @Override
    public ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname) throws RemoteException, Exception {
        ArrayList<Kunde> kundenlist = ucb.kundeSuchen(nachname);
        ArrayList<DTOKundenDaten> kundenDTOlist = new ArrayList<>();
        if (kundenlist == null || kundenlist.size() == 0) {
            throw new Exception("Kein Kunde gefunden");
        } else {
            for (Kunde k : kundenlist) {
                kundenDTOlist.add(new DTOKundenDaten(k.getKundenId(), k.getVorname(), k.getNachname(), k.getGeburtsdatum()));
            }
        }
        return kundenDTOlist;
    }

    @Override
    public DTOKundenDaten getKundendatenNachID(int id) throws Exception, RemoteException {
        Kunde k = ucb.getKundeByID(id);
        if (k == null) {
            throw new Exception("Kein Kunde gefunden");
        }

        return new DTOKundenDaten(k.getKundenId(), k.getVorname(), k.getNachname(), k.getGeburtsdatum());
    }

    @Override
    public void verkaufSpeichern(List<DTOKarteBestellen> karten) throws Exception, RemoteException {
        Set<Karte> bestellteKartenSet = new HashSet<>();
        int kundenId = karten.get(0).getKundenID();
        Kunde kunde = null;
        if (kundenId != -1) {
            kunde = ucb.getKundeByID(kundenId);
        }

        for (DTOKarteBestellen b : karten) {
            Karte k = ucb.getKarteByID(b.getKartenID());
            ucb.karteKaufen(k, b.isErmaessigt());
            bestellteKartenSet.add(k);
        }

        ucb.verkaufSpeichern(benutzer, kunde, bestellteKartenSet);
    }

    @Override
    public void reservierungSpeichern(List<DTOKarteReservieren> karten) throws Exception, RemoteException {
        Set<Karte> bestellteKartenSet = new HashSet<>();
        int kundenId = karten.get(0).getKundenID();
        Kunde kunde = null;
        if (kundenId != -1) {
            kunde = ucb.getKundeByID(kundenId);
        }
        for (DTOKarteReservieren b : karten) {
            Karte k = ucb.getKarteByID(b.getKartenID());
            ucb.karteReservieren(k);
            bestellteKartenSet.add(k);
        }

        ucb.reservierungSpeichern(benutzer, kunde, bestellteKartenSet);
    }

    @Override
    public void karteKaufen(DTOKarteBestellen karteDTO) throws RemoteException{
        Karte karte = ucb.getKarteByID(karteDTO.getKartenID());
        ucb.karteKaufen(karte, karteDTO.isErmaessigt());
    }
    
    @Override
    public DTOVeranstaltung getVeranstaltungByID(int Vid) {
        Veranstaltung v = ucb.getVeranstaltungByID(Vid);
        String Vname = v.getName();
        String VOrt = v.getVeranstaltungsort().getAdresse();
        Date date = v.getDatumUhrzeit();
       
        boolean ermaessigt = (v.getErmaessigung()==0);
        return DTOVeranstaltung(Vid, Vname, VOrt, date, ermaessigt);
    }

    private DTOVeranstaltung DTOVeranstaltung(int Vid, String Vname, String VOrt, Date date, boolean ermaessigt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
