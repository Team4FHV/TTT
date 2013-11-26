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
import DTO.objecte.DTOKundeNeuSpeichern;
import DTO.objecte.DTOKundenDaten;
import DTO.objecte.DTOLoginDaten;
import DTO.objecte.DTOMessage;
import DTO.objecte.DTORollenList;
import DTO.objecte.DTOTopicData;
import DTO.objecte.DTOVeranstaltung;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungInformation;
import Exceptions.BenutzerNichtInDBException;
import Exceptions.FalschesPasswordExeption;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
import GUIController.MainGuiCtrl;
import controller.RMIControllerFactoryInterface;
import controller.RMIControllerInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Client {

    RMIControllerFactoryInterface stub;
    RMIControllerInterface rmi;
    String host;
    DTORollenList _userRollen;
    List<DTOMessage> messages = new LinkedList<>();

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
            stub = (RMIControllerFactoryInterface) Naming.lookup("rmi://" + host + "/RMIControllerFactoryObject");
            try {
                rmi = stub.createRMIController();

            } catch (Exception e) {
                System.out.println("Exception create rmi : " + e.getMessage());

            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
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

    public ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname) throws RemoteException, Exception {
        ArrayList<DTOKundenDaten> x = null;
        x = rmi.getKundenListNachNachname(nachname);
        return x;
    }

    public DTOKundenDaten getKundendatenNachID(int id) throws RemoteException, Exception {
        DTOKundenDaten x = null;
        x = rmi.getKundendatenNachID(id);
        return x;
    }

    public void reservierungSpeichern(List<DTOKarteReservieren> karten) throws RemoteException, SaveFailedException, Exception, KarteNichtVerfuegbarException {
        rmi.reservierungSpeichern(karten);
    }

    public ArrayList<DTOVeranstaltungInformation> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler) throws RemoteException {
        ArrayList<DTOVeranstaltungInformation> x = null;
        x = rmi.sucheVeranstaltungenNachKrieterien(d, ort, kuenstler);
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

    public void neuenKundeSpeichern(DTOKundeNeuSpeichern kunde) throws RemoteException, SaveFailedException {
        rmi.neuenKundenSpeichern(kunde);
    }

    public DTORollenList login(DTOLoginDaten l) throws RemoteException,
            BenutzerNichtInDBException, FalschesPasswordExeption {
        _userRollen = rmi.login(l);
        return _userRollen;
    }

    public DTORollenList getUserRollen() {
        return _userRollen;
    }

    public void clearRoles() {
        _userRollen = null;
    }

    public DTOMessage getFirstMessage() {
        if (messages.size() > 0) {
            return messages.get(0);
        }
        return null;
    }

    public void addMessageToClient(DTOMessage m) {
        messages.add(m);
        if(MainGuiCtrl.getVeranstaltungSuchenView() != null)
        {
            MainGuiCtrl.getVeranstaltungSuchenView().checkMessages();
        }
    }

    public void removeFirstMessage() {
        if (messages.size() > 0) {
            messages.remove(0);
        }
    }

    public ArrayList<DTOTopicData> getTopics() {
        //return rmi.getTopics();

        //Test
        ArrayList<DTOTopicData> rv = new ArrayList<>();
        DTOTopicData test = new DTOTopicData("test");
        rv.add(test);
        return rv;
    }

    public void publishMessage(DTOMessage message) {
        //rmi.publishMessage(message);

        //Test
        messages.add(message);//Muss wieder entfernt werden
    }

    public List<DTOMessage> loadUnpublishedMessages() {
        //return rmi.loadUnpubplishedMessages();

        //Test
        List<DTOMessage> rv = new LinkedList<>();
        DTOMessage m1 = new DTOMessage("Testmessage", "testtext", null, "");
        DTOMessage m2 = new DTOMessage("Test2", "test", null, "");
        rv.add(m1);
        rv.add(m2);
        return rv;
    }
}
