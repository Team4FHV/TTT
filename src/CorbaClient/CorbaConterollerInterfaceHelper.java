package CorbaClient;


/**
* TicTakTicket/corba/CorbaConterollerInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Stefan Dietrich/Dropbox/team4/Corba/TicTakTicket.idl
* Dienstag, 19. November 2013 11:59 Uhr MEZ
*/

abstract public class CorbaConterollerInterfaceHelper
{
  private static String  _id = "IDL:TicTakTicket/corba/CorbaConterollerInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, CorbaConterollerInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CorbaConterollerInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CorbaConterollerInterfaceHelper.id (), "CorbaConterollerInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CorbaConterollerInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CorbaConterollerInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CorbaConterollerInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CorbaConterollerInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaConterollerInterface)
      return (CorbaConterollerInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CorbaConterollerInterfaceStub stub = new _CorbaConterollerInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CorbaConterollerInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaConterollerInterface)
      return (CorbaConterollerInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CorbaConterollerInterfaceStub stub = new _CorbaConterollerInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
