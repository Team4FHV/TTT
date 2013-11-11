/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIController;

import DTO.objecte.DTOLoginDaten;
import DTO.objecte.DTORollenList;
import Exceptions.BenutzerNichtInDBException;
import Exceptions.FalschesPasswordExeption;
import client.Client;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;


/**
 *
 * @author Monika
 */
public class LoginCtrl {
    
    private Client _client;

    public LoginCtrl(Client _client) {
        this._client = _client;
    }
    
    public boolean checkLogin(String benName, String pw) {
         DTOLoginDaten logindat= new DTOLoginDaten(benName, pw);
        try {           
            DTORollenList rolList = _client.login(logindat);
            MainGuiCtrl.Login(rolList);
        } catch (Exception ex) {
            String message = "";
            if (ex instanceof FalschesPasswordExeption) {
                message = "Falsches passwort";
            }
            if (ex instanceof RemoteException) {
                message = "Server probleme";
            }
            if (ex instanceof BenutzerNichtInDBException) {
                message = "Benutzer nicht in DB";               
            }           
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
         return true;
    }
}
