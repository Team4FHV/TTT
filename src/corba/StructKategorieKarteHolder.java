package corba;

/**
* TicTakTicket/corba/StructKategorieKarteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 15:21 Uhr MEZ
*/

public final class StructKategorieKarteHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.StructKategorieKarte value = null;

  public StructKategorieKarteHolder ()
  {
  }

  public StructKategorieKarteHolder (corba.StructKategorieKarte initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.StructKategorieKarteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.StructKategorieKarteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.StructKategorieKarteHelper.type ();
  }

}