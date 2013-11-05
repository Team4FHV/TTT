/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOKarteBestellen;
import DTO.objecte.DTOKarteReservieren;
import DTO.objecte.DTOKategorieInformation;
import DTO.objecte.DTOKategorieKarte;
import DTO.objecte.DTOKategorienAuswaehlen;
import DTO.objecte.DTOKundenDaten;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungInformation;
import DTO.objecte.DTOVeranstaltungSuchen;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;



/**
 *
 * @author Iryna
 */
public interface RMIControllerInterface extends Remote {

    DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat)  throws RemoteException;

    ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v)  throws RemoteException;

    ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname)  throws RemoteException, Exception;

    DTOKundenDaten getKundendatenNachID(int id)  throws  Exception, RemoteException;

    void karteKaufen(DTOKarteBestellen karteDTO)  throws RemoteException;

    void reservierungSpeichern(List<DTOKarteReservieren> karten)  throws  Exception, RemoteException;;

    ArrayList<DTOVeranstaltungInformation> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler)  throws RemoteException;

    void verkaufSpeichern(List<DTOKarteBestellen> karten) throws  Exception, RemoteException;

    public DTOKategorieInformation getKategorieInfo(int id)  throws RemoteException;;
}
