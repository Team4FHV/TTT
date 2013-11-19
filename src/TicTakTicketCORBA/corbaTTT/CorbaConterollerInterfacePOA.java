package TicTakTicketCORBA.corbaTTT;


/**
* TicTakTicketCORBA/corbaTTT/CorbaConterollerInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corbaTTT.idl
* Dienstag, 19. November 2013 11:44 Uhr MEZ
*/

public abstract class CorbaConterollerInterfacePOA extends org.omg.PortableServer.Servant
 implements TicTakTicketCORBA.corbaTTT.CorbaConterollerInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sucheVeranstaltungNachKriterien", new java.lang.Integer (0));
    _methods.put ("getKategorieVonVernastaltung", new java.lang.Integer (1));
    _methods.put ("getAlleFeieKartenNachKategorie", new java.lang.Integer (2));
    _methods.put ("verkaufSpeichern", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  //falls null nicht geht einzelne Methoden mit jedem Parameter machen
       case 0:  // TicTakTicketCORBA/corbaTTT/CorbaConterollerInterface/sucheVeranstaltungNachKriterien
       {
         String datum = in.read_string ();
         String ort = in.read_string ();
         String kuenstler = in.read_string ();
         TicTakTicketCORBA.corbaTTT.StructVernastaltung $result[] = null;
         $result = this.sucheVeranstaltungNachKriterien (datum, ort, kuenstler);
         out = $rh.createReply();
         TicTakTicketCORBA.corbaTTT.CorbaConterollerInterfacePackage.veranstaltungListHelper.write (out, $result);
         break;
       }

       case 1:  // TicTakTicketCORBA/corbaTTT/CorbaConterollerInterface/getKategorieVonVernastaltung
       {
         int vid = in.read_long ();
         TicTakTicketCORBA.corbaTTT.StructKategorie $result[] = null;
         $result = this.getKategorieVonVernastaltung (vid);
         out = $rh.createReply();
         TicTakTicketCORBA.corbaTTT.CorbaConterollerInterfacePackage.kategorieListHelper.write (out, $result);
         break;
       }

       case 2:  // TicTakTicketCORBA/corbaTTT/CorbaConterollerInterface/getAlleFeieKartenNachKategorie
       {
         int katid = in.read_long ();
         TicTakTicketCORBA.corbaTTT.StructKarte $result[] = null;
         $result = this.getAlleFeieKartenNachKategorie (katid);
         out = $rh.createReply();
         TicTakTicketCORBA.corbaTTT.CorbaConterollerInterfacePackage.karteListHelper.write (out, $result);
         break;
       }

       case 3:  // TicTakTicketCORBA/corbaTTT/CorbaConterollerInterface/verkaufSpeichern
       {
         TicTakTicketCORBA.corbaTTT.StructKarte listkarten[] = TicTakTicketCORBA.corbaTTT.CorbaConterollerInterfacePackage.karteListHelper.read (in);
         this.verkaufSpeichern (listkarten);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:TicTakTicketCORBA/corbaTTT/CorbaConterollerInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CorbaConterollerInterface _this() 
  {
    return CorbaConterollerInterfaceHelper.narrow(
    super._this_object());
  }

  public CorbaConterollerInterface _this(org.omg.CORBA.ORB orb) 
  {
    return CorbaConterollerInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class CorbaConterollerInterfacePOA
