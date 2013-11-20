/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Exceptions.SaveFailedException;
import corba.StructKarteBestellen;
import corba.StructKategorieAuswaehlen;
import corba.StructKategorieInformation;
import corba.StructKategorieKarte;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author media
 */
public class TESTKartenEinfuegen {
    public static void main(String[] args) throws SaveFailedException {
            
           // DAOFabrik.getInstance().getKarteDAO().saveORupdate(null);
        CorbaController c = new CorbaController();
      StructKategorieKarte jjj =  c.getAlleFreieKartenNachKategorie(new StructKategorieAuswaehlen(16));
        System.err.println("karten " + jjj.kartenList.length);
       corba.StructVeranstaltung[] v = c.sucheVeranstaltungNachKriterien("12.12.2014", null, "JonnyRonny");
        System.err.println("vernst " + v.length);
       StructKategorieInformation kkk = c.getKategorieInfo(16);
        System.err.println("kategorie freie pl " + kkk.freiePlaetze + " preis " + kkk.katPreis + "name" + kkk.katName);
        
//        StructKarteBestellen[] kk = new StructKarteBestellen[1];
//        kk[0] = new StructKarteBestellen(39, 1, true);
//        c.verkaufSpeichern(kk);
        
        SimpleDateFormat sdfToDate = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d = sdfToDate.parse(""); 
            System.out.println(d.toString());
        } catch (ParseException ex) {
            Logger.getLogger(TESTKartenEinfuegen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
