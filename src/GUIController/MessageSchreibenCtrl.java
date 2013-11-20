/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIController;

import DTO.objecte.DTOMessage;
import client.Client;
import java.util.Date;

/**
 *
 * @author Monika
 */
public class MessageSchreibenCtrl {
    private Client _client;
    
    public void sendMessage(Date date, int id, String title, String text) {
        DTOMessage message = new DTOMessage(title, text, date, id);
        //todo: _client.createMessage(message);
    }
}
