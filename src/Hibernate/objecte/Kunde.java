package Hibernate.objecte;
// Generated 28.10.2013 11:53:03 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Kunde generated by hbm2java
 */
public class Kunde  implements java.io.Serializable {


     private Integer kundenId;
     private String vorname;
     private String nachname;
     private Date geburtsdatum;
     private String anrede;
     private String firmenname;
     private String land;
     private String postleitzahl;
     private String ort;
     private String strasse;
     private String hausnummer;
     private String telefonnummer;
     private String email;
     private boolean aktiv;
     private Set bestellungs = new HashSet(0);

    public Kunde() {
    }

	
    public Kunde(String vorname, String nachname, Date geburtsdatum, String anrede, String land, String postleitzahl, String ort, String strasse, String hausnummer, String email, boolean aktiv) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.anrede = anrede;
        this.land = land;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.email = email;
        this.aktiv = aktiv;
    }
    public Kunde(String vorname, String nachname, Date geburtsdatum, String anrede, String firmenname, String land, String postleitzahl, String ort, String strasse, String hausnummer, String telefonnummer, String email, boolean aktiv, Set bestellungs) {
       this.vorname = vorname;
       this.nachname = nachname;
       this.geburtsdatum = geburtsdatum;
       this.anrede = anrede;
       this.firmenname = firmenname;
       this.land = land;
       this.postleitzahl = postleitzahl;
       this.ort = ort;
       this.strasse = strasse;
       this.hausnummer = hausnummer;
       this.telefonnummer = telefonnummer;
       this.email = email;
       this.aktiv = aktiv;
       this.bestellungs = bestellungs;
    }
   
    public Integer getKundenId() {
        return this.kundenId;
    }
    
    public void setKundenId(Integer kundenId) {
        this.kundenId = kundenId;
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
    public Date getGeburtsdatum() {
        return this.geburtsdatum;
    }
    
    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
    public String getAnrede() {
        return this.anrede;
    }
    
    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }
    public String getFirmenname() {
        return this.firmenname;
    }
    
    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }
    public String getLand() {
        return this.land;
    }
    
    public void setLand(String land) {
        this.land = land;
    }
    public String getPostleitzahl() {
        return this.postleitzahl;
    }
    
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
    public String getOrt() {
        return this.ort;
    }
    
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public String getStrasse() {
        return this.strasse;
    }
    
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public String getHausnummer() {
        return this.hausnummer;
    }
    
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
    public String getTelefonnummer() {
        return this.telefonnummer;
    }
    
    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isAktiv() {
        return this.aktiv;
    }
    
    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    public Set getBestellungs() {
        return this.bestellungs;
    }
    
    public void setBestellungs(Set bestellungs) {
        this.bestellungs = bestellungs;
    }




}


