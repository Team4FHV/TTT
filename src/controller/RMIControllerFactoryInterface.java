/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author media
 */
public interface RMIControllerFactoryInterface extends Remote{
    
    public RMIControllerInterface createRMIController() throws RemoteException;
    
}
