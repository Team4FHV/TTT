/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Domain.DAOFabrik;
import Exceptions.SaveFailedException;
import corba.StructKarteBestellen;
import corba.StructKategorieAuswaehlen;
import corba.StructKategorieInformation;
import corba.StructKategorieKarte;

/**
 *
 * @author media
 */
public class TESTKartenEinfuegen {
    public static void main(String[] args) throws SaveFailedException {
            
           // DAOFabrik.getInstance().getKarteDAO().saveORupdate(null);
        CorbaController c = new CorbaController();
      StructKategorieKarte jjj =  c.getAlleFreieKartenNachKategorie(new StructKategorieAuswaehlen(3));
        System.err.println("karten " + jjj.kartenList.length);
       corba.StructVeranstaltung[] v = c.sucheVeranstaltungNachKriterien("12.12.2014", null, "JonnyRonny");
        System.err.println("vernst " + v.length);
       StructKategorieInformation kkk = c.getKategorieInfo(15);
        System.err.println("kategorie freie pl " + kkk.freiePlaetze + " preis " + kkk.katPreis + "name" + kkk.katName);
        
        StructKarteBestellen[] kk = new StructKarteBestellen[1];
        kk[0] = new StructKarteBestellen(64, 1, true);
        c.verkaufSpeichern(kk);
        
    }
    
}
