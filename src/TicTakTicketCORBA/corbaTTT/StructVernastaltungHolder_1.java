package TicTakTicketCORBA.corbaTTT;

/**
* TicTakTicketCORBA/corbaTTT/StructVernastaltungHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corbaTTT.idl
* Dienstag, 19. November 2013 11:44 Uhr MEZ
*/

public final class StructVernastaltungHolder implements org.omg.CORBA.portable.Streamable
{
  public TicTakTicketCORBA.corbaTTT.StructVernastaltung value = null;

  public StructVernastaltungHolder ()
  {
  }

  public StructVernastaltungHolder (TicTakTicketCORBA.corbaTTT.StructVernastaltung initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TicTakTicketCORBA.corbaTTT.StructVernastaltungHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TicTakTicketCORBA.corbaTTT.StructVernastaltungHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TicTakTicketCORBA.corbaTTT.StructVernastaltungHelper.type ();
  }

}
