package corba.CorbaConterollerInterfacePackage;


/**
* TicTakTicket/corba/CorbaConterollerInterfacePackage/veranstaltungListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TicTakTicket.idl
* Mittwoch, 20. November 2013 20:15 Uhr MEZ
*/

public final class veranstaltungListHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.StructVeranstaltung value[] = null;

  public veranstaltungListHolder ()
  {
  }

  public veranstaltungListHolder (corba.StructVeranstaltung[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.CorbaConterollerInterfacePackage.veranstaltungListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.CorbaConterollerInterfacePackage.veranstaltungListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.CorbaConterollerInterfacePackage.veranstaltungListHelper.type ();
  }

}
