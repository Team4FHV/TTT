package server;

import controller.RMIController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Iryna
 */
public class Server {

    public static void main(String[] args) {
            System.out.println("Hallo");
            
            try { //special exception handler for registry creation
            LocateRegistry.createRegistry(1099); 
            System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
            //do nothing, error means registry already exists
            System.out.println("java RMI registry already exists.");
        }

        try {
             System.setProperty("java.rmi.server.codebase", Server.class
            .getProtectionDomain().getCodeSource().getLocation().toString());
    
            RMIController rmiController = new RMIController();
            // Bind this object instance to the name "SquareNumberObject"
            
            Naming.rebind("rmi://localhost:1099/RMIControllerObject", rmiController);
           
            System.out.println("Object bound in registry");

        } catch (RemoteException | MalformedURLException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
