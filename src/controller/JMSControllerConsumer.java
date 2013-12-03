/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOMessage;
import client.Client;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Stefan Dietrich
 */
public class JMSControllerConsumer {

    private Client _client;
    private List<DTOMessage> _messages = new LinkedList();

    public JMSControllerConsumer(Client client) {
        _client = client;
    }
    
    public void addMessage(DTOMessage m)
    {
        _client.addMessageToClient(m);
    }

}
