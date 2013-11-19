/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Exceptions.BenutzerNichtInDBException;
import Exceptions.FalschesPasswordExeption;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
import controller.RMIControllerFactoryInterface;
import controller.RMIControllerInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorbaClient {

    String host;

    public CorbaClient() {
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
        // create and initialize the ORB
        ORB orb = ORB.init(args, null);
        // get the root naming context
        org.omg.CORBA.Object objRef;
        objRef = orb.resolve_initial_references("NameService");
        // Use NamingContextExt instead of NamingContext. This is
        // part of the Interoperable naming Service
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
        _cookieserverStub stub = (_cookieserverStub) cookieserverHelper
                .narrow(ncRef.resolve_str("TicTakTicketObject"));
        System.out.println("CORBA Client: stub erstellt");
        /*
        try {
            stub = (RMIControllerFactoryInterface) Naming.lookup("rmi://" + host + "/RMIControllerFactoryObject");
            try {
                rmi = stub.createRMIController();

            } catch (Exception e) {
                System.out.println("Exception create rmi : " + e.getMessage());

            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        */
    }
    
    public ArrayList<StructVeranstaltung> sucheVeranstaltungNachKriterien(String datum, string ort, string kuenstler) {
        varray[] = stub.sucheVeranstaltungNachKriterien(datum,ort,kuenstler);
        ArrayList<StructVeranstaltung> veranstaltungen = new ArrayList<StructVeranstaltung>(Arrays.asList(varray));
    } 
    
    public DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat) throws RemoteException {
        DTOKategorieKarte x = null;
        x = rmi.getAlleFreieKartenNachKategorie(kat);
        return x;
    }

    public ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v) throws RemoteException {
        ArrayList<DTOKategorieInformation> x = null;
        x = rmi.getKategorieInfoVonVeranstaltung(v);
        return x;
    }

    

    public void verkaufSpeichern(List<DTOKarteBestellen> karten) throws RemoteException, SaveFailedException, Exception, KarteNichtVerfuegbarException {
        rmi.verkaufSpeichern(karten);
    }

    public DTOKategorieInformation getKategorieInfo(int id) throws RemoteException {
        DTOKategorieInformation x = null;
        x = rmi.getKategorieInfo(id);
        return x;

    }

    public DTOVeranstaltung getVeranstaltungById(int veranstaltungID) throws RemoteException {
        DTOVeranstaltung x = null;
        x = rmi.getVeranstaltungById(veranstaltungID);
        return x;
    }
}
