package CorbaServer;


/**
* TicTakTicket/corba/CorbaConterollerInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 12:24 Uhr MEZ
*/

public interface CorbaConterollerInterfaceOperations 
{

  //falls null nicht geht einzelne Methoden mit jedem Parameter machen
  StructVeranstaltung[] sucheVeranstaltungNachKriterien (String datum, String ort, String kuenstler);
  StructKategorie[] getKategorieVonVeranstaltung (int vid);
  StructKarte[] getAlleFeieKartenNachKategorie (int katid);
  void verkaufSpeichern (StructKarte[] listkarten);
} // interface CorbaConterollerInterfaceOperations
