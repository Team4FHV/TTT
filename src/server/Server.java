package server;

import controller.RMIControllerFactory;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Iryna
 */
public class Server {

    public static void main(String[] args) {
        System.out.println("Hallo");
        String _cacert = System.getProperty("java.home") + "/lib/security/cacerts";
        System.setProperty("javax.net.ssl.trustStore", _cacert);
        try { //special exception handler for registry creation
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
            //do nothing, error means registry already exists
            System.out.println("java RMI registry already exists.");
        }

        try {

            RMIControllerFactory rmiControllerFactory = new RMIControllerFactory();
            // Bind this object instance to the name "RMIControllerFactoryObject"

            Naming.rebind("rmi://localhost/RMIControllerFactoryObject", rmiControllerFactory);

            System.out.println("RMI Object bound in registry");

        } catch (RemoteException | MalformedURLException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
