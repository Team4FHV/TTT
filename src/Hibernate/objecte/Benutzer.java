package Hibernate.objecte;
// Generated 28.10.2013 11:53:03 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Benutzer generated by hbm2java
 */
public class Benutzer  implements java.io.Serializable {


     private Integer benutzerId;
     private String benutzername;
     private String passwort;
     private String vorname;
     private String nachname;
     private boolean aktiv;
     private Set rolles = new HashSet(0);
     private Set bestellungs = new HashSet(0);
     private String topics;

    public Benutzer() {
    }

	
    public Benutzer(String benutzername, String passwort, String vorname, String nachname, boolean aktiv) {
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.vorname = vorname;
        this.nachname = nachname;
        this.aktiv = aktiv;
    }
    public Benutzer(String benutzername, String passwort, String vorname, String nachname, boolean aktiv, Set rolles, Set bestellungs) {
       this.benutzername = benutzername;
       this.passwort = passwort;
       this.vorname = vorname;
       this.nachname = nachname;
       this.aktiv = aktiv;
       this.rolles = rolles;
       this.bestellungs = bestellungs;
    }
   
    public Integer getBenutzerId() {
        return this.benutzerId;
    }
    
    public void setBenutzerId(Integer benutzerId) {
        this.benutzerId = benutzerId;
    }
    public String getBenutzername() {
        return this.benutzername;
    }
    
    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }
    public String getPasswort() {
        return this.passwort;
    }
    
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    public String getVorname() {
        return this.vorname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return this.nachname;
    }
    
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public boolean isAktiv() {
        return this.aktiv;
    }
    
    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    public Set getRolles() {
        return this.rolles;
    }
    
    public void setRolles(Set rolles) {
        this.rolles = rolles;
    }
    public Set getBestellungs() {
        return this.bestellungs;
    }
    
    public void setBestellungs(Set bestellungs) {
        this.bestellungs = bestellungs;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }


}


