/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import corba.CobraException;
import corba.CorbaConterollerInterface;
import corba.CorbaConterollerInterfaceHelper;
import corba.StructKarteBestellen;
import corba.StructKategorieInformation;
import corba.StructVeranstaltung;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/**
 *
 * @author media
 */
public class CorbaClient {

    CorbaConterollerInterface Stub;
    String[] args;

    public CorbaClient(String[] args) {
        this.args = args;
        startClient();
    }

    private void startClient() {
        try {

            System.out.println("Bitte geben Sie eine Port ein");
            Scanner sc = new Scanner (System.in);
            String host = sc.next ();
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "2050");
            props.put("org.omg.CORBA.ORBInitialHost", host);
            ORB orb = ORB.init(args, props);

            //            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef;
            objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Stub = CorbaConterollerInterfaceHelper.narrow(ncRef.resolve_str("ControllerObject"));
            System.out.println("Obtained a handle on server object: ControllerObject ");


        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }


    }

    public corba.StructKategorieKarte getAlleFreieKartenNachKategorie(int id) {

        return Stub.getAlleFreieKartenNachKategorie(new corba.StructKategorieAuswaehlen(id));
    }

    public ArrayList<StructKategorieInformation> getKategorieInfoVonVeranstaltung(corba.StructVeranstaltungAnzeigen veranstaltung) {
        ArrayList<StructKategorieInformation> result = new ArrayList<>();
        StructKategorieInformation[] list = Stub.getKategorieInfoVonVeranstaltung(veranstaltung);
        result.addAll(Arrays.asList(list));
        return result;

    }

    public ArrayList<StructVeranstaltung> sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {
        ArrayList<StructVeranstaltung> result = new ArrayList<>();
        corba.StructVeranstaltung[] list = Stub.sucheVeranstaltungNachKriterien(datum, ort, kuenstler);
        result.addAll(Arrays.asList(list));
        return result;

    }

    public void verkaufSpeichern(List<StructKarteBestellen> list) throws CobraException {
        corba.StructKarteBestellen[] karten = new StructKarteBestellen[list.size()];
        for (int i = 0; i < list.size(); i++) {
            karten[i] = list.get(i);
        }
            Stub.verkaufSpeichern(karten);
       
    }

    public corba.StructKategorieInformation getKategorieInfo(int id) {
        return Stub.getKategorieInfo(id);
    }

    public StructVeranstaltung getVeranstaltungById(int veranstaltungID) {
        ArrayList<StructVeranstaltung> veranstaltungen = sucheVeranstaltungNachKriterien("", "", "");
        for (StructVeranstaltung v : veranstaltungen) {
            if (v.vid == veranstaltungID) {
                return v;
            }
        }
        return new StructVeranstaltung(veranstaltungID, "", "", "", "", true);
    }
}
