/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import JMS.Publisher;
import DTO.objecte.DTOMessage;
import JMS.Subscriber;
import client.Client;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.naming.NamingException;

/**
 *
 * @author media
 */
public class TEST {
     public static void main(String[] args) throws RemoteException, MalformedURLException, NamingException {
        
     
    Publisher p = new Publisher();
    p.publish(new DTOMessage("hallo", "text", null, "topicRock"));
    
  
    
    }
     
}
