/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author media
 */
public class RMIControllerFactory extends UnicastRemoteObject implements RMIControllerFactoryInterface{
    
     public RMIControllerFactory() throws RemoteException {
        super();
    }
    
     @Override
    public RMIControllerInterface createRMIController() throws RemoteException{
        return new RMIController();
    }
    
}
