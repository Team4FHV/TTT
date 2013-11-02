package server;

import controller.RMIController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Iryna
 */
public class Server {

    public static void main(String[] args) {
            System.out.println("Hallo");

        try {
             System.setProperty("java.rmi.server.codebase", Server.class
            .getProtectionDomain().getCodeSource().getLocation().toString());
    
            RMIController rmiController = new RMIController();
            // Bind this object instance to the name "SquareNumberObject"
            
            Naming.rebind("rmi://localhost:1099/RMIControllerObject", rmiController);
           
            System.out.println("SquareNumberObject bound in registry");

        } catch (RemoteException | MalformedURLException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
