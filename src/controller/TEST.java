/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOMessage;
import client.Client;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author media
 */
public class TEST {
     public static void main(String[] args) throws RemoteException {
         
         
         MessageController c  = MessageController.getInstance();
         List<DTOMessage> l = c.loadMessages();
         for (DTOMessage m : l){
             System.out.println("message" + m.getTitle());
         }
     }
          
}
