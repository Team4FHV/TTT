package CorbaClient.ControllerInterfaces;

import CorbaClient.*;


/**
* TicTakTicket/corba/CorbaConterollerInterfacePackage/kategorieListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 11:59 Uhr MEZ
*/

abstract public class kategorieListHelper
{
  private static String  _id = "IDL:TicTakTicket/corba/CorbaConterollerInterface/kategorieList:1.0";

  public static void insert (org.omg.CORBA.Any a, StructKategorie[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StructKategorie[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = StructKategorieHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (kategorieListHelper.id (), "kategorieList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StructKategorie[] read (org.omg.CORBA.portable.InputStream istream)
  {
    StructKategorie value[] = null;
    int _len0 = istream.read_long ();
    value = new StructKategorie[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = StructKategorieHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StructKategorie[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      StructKategorieHelper.write (ostream, value[_i0]);
  }

}
