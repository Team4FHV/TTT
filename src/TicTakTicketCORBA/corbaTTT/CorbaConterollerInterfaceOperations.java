package TicTakTicketCORBA.corbaTTT;


/**
* TicTakTicketCORBA/corbaTTT/CorbaConterollerInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corbaTTT.idl
* Dienstag, 19. November 2013 09:05 Uhr MEZ
*/

public interface CorbaConterollerInterfaceOperations 
{

  //falls null nicht geht einzelne Methoden mit jedem Parameter machen
  TicTakTicketCORBA.corbaTTT.StructVernastaltung[] sucheVeranstaltungNachKriterien (String datum, String ort, String kuenstler);
  TicTakTicketCORBA.corbaTTT.StructKategorie[] getKategorieVonVernastaltung (int vid);
  TicTakTicketCORBA.corbaTTT.StructKarte[] getAlleFeieKartenNachKategorie (int katid);
  void verkaufSpeichern (TicTakTicketCORBA.corbaTTT.StructKarte[] listkarten);
} // interface CorbaConterollerInterfaceOperations
