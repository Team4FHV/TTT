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
import DTO.objecte.DTOVeranstaltung;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungInformation;
import controller.RMIControllerFactoryInterface;
import controller.RMIControllerInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    RMIControllerFactoryInterface stub;
    RMIControllerInterface rmi;
    String host;

    public Client() {
        startClient();
    }

    private void startClient() {
        
        System.out.println("Geben Sie Bitte HOST ein:");
        
       BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	try {
		host = console.readLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	

        try {
            stub = (RMIControllerFactoryInterface) Naming.lookup("rmi://"+host+"/RMIControllerFactoryObject");
            try {
                 rmi = stub.createRMIController();

            } catch (Exception e) {
                 System.out.println("Exception create rmi : " + e.getMessage());

            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat) {
        DTOKategorieKarte x = null;
        try {
            x = rmi.getAlleFreieKartenNachKategorie(kat);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v) {
        ArrayList<DTOKategorieInformation> x = null;
        try {
            x = rmi.getKategorieInfoVonVeranstaltung(v);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname) {
        ArrayList<DTOKundenDaten> x = null;
        try {
            x = rmi.getKundenListNachNachname(nachname);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public DTOKundenDaten getKundendatenNachID(int id) {
        DTOKundenDaten x = null;
        try {
            x = rmi.getKundendatenNachID(id);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public void karteKaufen(DTOKarteBestellen karteDTO) {
        try {
            rmi.karteKaufen(karteDTO);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

    }

    public void reservierungSpeichern(List<DTOKarteReservieren> karten) {
        try {
            rmi.reservierungSpeichern(karten);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public ArrayList<DTOVeranstaltungInformation> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler) {
        ArrayList<DTOVeranstaltungInformation> x = null;
        try {
            x = rmi.sucheVeranstaltungenNachKrieterien(d, ort, kuenstler);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;
    }

    public void verkaufSpeichern(List<DTOKarteBestellen> karten) {
        try {
            rmi.verkaufSpeichern(karten);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public DTOKategorieInformation getKategorieInfo(int id) {
        DTOKategorieInformation x = null;
        try {
            x = rmi.getKategorieInfo(id);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return x;

    }

    public DTOVeranstaltung getVeranstaltungById(int veranstaltungID) {
        DTOVeranstaltung x = null;
        try {
            x = rmi.getVeranstaltungById(veranstaltungID);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
       return x;
    }
}
