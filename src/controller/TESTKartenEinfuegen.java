/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Domain.DAOFabrik;
import Exceptions.SaveFailedException;

/**
 *
 * @author media
 */
public class TESTKartenEinfuegen {
    public static void main(String[] args) throws SaveFailedException {
            
            DAOFabrik.getInstance().getKarteDAO().saveORupdate(null);
    }
    
}
