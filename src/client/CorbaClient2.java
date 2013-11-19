/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import corba.CorbaConterollerInterface;
import corba.CorbaConterollerInterfaceHelper;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/**
 *
 * @author media
 */
public class CorbaClient2 {

    public static void main(String[] args) {
        try {

//             System.out.println("Bitte geben Sie eine Port ein");
//               Scanner sc = new Scanner (System.in);
//               String host = sc.next ();//TODO
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "2050");
            props.put("org.omg.CORBA.ORBInitialHost", "localhost");
            ORB orb = ORB.init(args, props);

            //            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef;
            objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            CorbaConterollerInterface Stub = CorbaConterollerInterfaceHelper.narrow(ncRef.resolve_str("ControllerObject"));
            System.out.println("Obtained a handle on server object: CookieObject");



        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
