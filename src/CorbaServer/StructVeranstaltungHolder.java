package CorbaServer;

/**
* TicTakTicket/corba/StructVeranstaltungHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 12:24 Uhr MEZ
*/

public final class StructVeranstaltungHolder implements org.omg.CORBA.portable.Streamable
{
  public StructVeranstaltung value = null;

  public StructVeranstaltungHolder ()
  {
  }

  public StructVeranstaltungHolder (StructVeranstaltung initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StructVeranstaltungHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StructVeranstaltungHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StructVeranstaltungHelper.type ();
  }

}
