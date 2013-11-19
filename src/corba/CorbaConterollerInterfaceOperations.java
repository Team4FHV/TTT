package corba;


/**
* TicTakTicket/corba/CorbaConterollerInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 15:21 Uhr MEZ
*/

public interface CorbaConterollerInterfaceOperations 
{

  //falls null nicht geht einzelne Methoden mit jedem Parameter machen
  corba.StructKategorieKarte getAlleFreieKartenNachKategorie (corba.StructKategorieAuswaehlen kategorie);
  corba.StructKategorieInformation[] getKategorieInfoVonVeranstaltung (corba.StructVeranstaltungAnzeigen veranstaltung);
  corba.StructVeranstaltung[] sucheVeranstaltungNachKriterien (String datum, String ort, String kuenstler);
  void verkaufSpeichern (corba.StructKarteBestellen[] karten);
  corba.StructKategorieInformation getKategorieInfo (int id);
} // interface CorbaConterollerInterfaceOperations