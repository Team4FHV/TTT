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
import DTO.objecte.DTOKundeNeuSpeichern;
import DTO.objecte.DTOKundenDaten;
import DTO.objecte.DTOKundenDatenAendern;
import DTO.objecte.DTOLoginDaten;
import DTO.objecte.DTOMessage;
import DTO.objecte.DTORollenList;
import DTO.objecte.DTOVeranstaltung;
import DTO.objecte.DTOVeranstaltungAnzeigen;
import DTO.objecte.DTOVeranstaltungInformation;
import Exceptions.BenutzerNichtInDBException;
import Exceptions.FalschesPasswordExeption;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
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
    DTORollenList login( DTOLoginDaten l) throws RemoteException, BenutzerNichtInDBException, FalschesPasswordExeption;
    
    void neuenKundenSpeichern(DTOKundeNeuSpeichern k) throws RemoteException, SaveFailedException; 
    
    void kundenDatenAendern(DTOKundenDatenAendern k) throws RemoteException, SaveFailedException;

    DTOKategorieKarte getAlleFreieKartenNachKategorie(DTOKategorienAuswaehlen kat)  throws RemoteException;

    ArrayList<DTOKategorieInformation> getKategorieInfoVonVeranstaltung(DTOVeranstaltungAnzeigen v)  throws RemoteException;

    ArrayList<DTOKundenDaten> getKundenListNachNachname(String nachname)  throws RemoteException, Exception;

    DTOKundenDaten getKundendatenNachID(int id)  throws  Exception, RemoteException;

    void reservierungSpeichern(List<DTOKarteReservieren> karten)  throws  Exception, RemoteException, SaveFailedException, KarteNichtVerfuegbarException;

    ArrayList<DTOVeranstaltungInformation> sucheVeranstaltungenNachKrieterien(Date d, String ort, String kuenstler)  throws RemoteException;

    void verkaufSpeichern(List<DTOKarteBestellen> karten) throws  Exception, RemoteException, SaveFailedException, KarteNichtVerfuegbarException;

    public DTOKategorieInformation getKategorieInfo(int id)  throws RemoteException;
    
    public DTOVeranstaltung getVeranstaltungById(int veranstaltungID) throws RemoteException;
    
    public List<DTOMessage> loadUnpublishedMessages() throws RemoteException;
}
