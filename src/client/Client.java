/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import DTO.objecte.DTOKarteBestellen;
import DTO.objecte.DTOKarteReservieren;
import DTO.objecte.DTOKategorieInformation;
import DTO.objecte.DTOKategorieKarte;
import DTO.objecte.DTOKategorienAuswaehlen;
import DTO.objecte.DTOKundenDaten;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungSuchen;
import controller.RMIControllerInterface;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    RMIControllerInterface stub;

    public Client() {
        startClient();
    }

    public void startClient() {

        try {
            stub = (RMIControllerInterface) Naming.lookup("rmi://localhost/RMIControllerObject");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat) {
        DTOKategorieKarte x = null;
        try {
            x = stub.getAlleFreieKartenNachKategorie(kat);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v) {
        ArrayList<DTOKategorieInformation> x = null;
        try {
            x = stub.getKategorieInfoVonVeranstaltung(v);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname) throws Exception {
        ArrayList<DTOKundenDaten> x = null;
        try {
            x = stub.getKundenListNachNachname(nachname);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    DTOKundenDaten getKundendatenNachID(int id) throws Exception {
        DTOKundenDaten x = null;
        try {
            x = stub.getKundendatenNachID(id);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    void karteKaufen(DTOKarteBestellen karteDTO) {
        try {
            stub.karteKaufen(karteDTO);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

    }

    void reservierungSpeichern(List<DTOKarteReservieren> karten) throws Exception {
        try {
            stub.reservierungSpeichern(karten);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    ArrayList<DTOVeranstaltungSuchen> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler) {
        ArrayList<DTOVeranstaltungSuchen> x = null;
        try {
            //x = stub.sucheVeranstaltungenNachKrieterien(d, ort, kuenstler);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    void verkaufSpeichern(List<DTOKarteBestellen> karten) throws Exception {
        stub.verkaufSpeichern(karten);
    }

    public DTOKategorieInformation getKategorieInfo(int id) {
        DTOKategorieInformation x = null;
        try {
            x = stub.getKategorieInfo(id);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;

    }
}
