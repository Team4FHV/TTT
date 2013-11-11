/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.objecte;

/**
 *
 * @author media
 */
public class DTOLoginDaten {
    private String username;
    private String passwort;
    
    public DTOLoginDaten(){
        
    }  
    
    public DTOLoginDaten(String username, String passwort){
        this.username = username;
        this.passwort = passwort;
    }  

    public String getUsername() {
        return username;
    }

    public String getPasswort() {
        return passwort;
    }
}
