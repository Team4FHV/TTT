package corba.CorbaConterollerInterfacePackage;


/**
* TicTakTicket/corba/CorbaConterollerInterfacePackage/karteListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 12:24 Uhr MEZ
*/

public final class karteListHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.StructKarte value[] = null;

  public karteListHolder ()
  {
  }

  public karteListHolder (corba.StructKarte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.CorbaConterollerInterfacePackage.karteListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.CorbaConterollerInterfacePackage.karteListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.CorbaConterollerInterfacePackage.karteListHelper.type ();
  }

}
