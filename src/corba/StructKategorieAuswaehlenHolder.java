package corba;

/**
* TicTakTicket/corba/StructKategorieAuswaehlenHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TicTakTicket.idl
* Mittwoch, 20. November 2013 20:15 Uhr MEZ
*/

public final class StructKategorieAuswaehlenHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.StructKategorieAuswaehlen value = null;

  public StructKategorieAuswaehlenHolder ()
  {
  }

  public StructKategorieAuswaehlenHolder (corba.StructKategorieAuswaehlen initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.StructKategorieAuswaehlenHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.StructKategorieAuswaehlenHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.StructKategorieAuswaehlenHelper.type ();
  }

}
