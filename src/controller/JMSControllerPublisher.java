/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOMessage;
import JMS.Publisher;
import com.sun.org.apache.xml.internal.dtm.DTMDOMException;
import javax.naming.NamingException;

/**
 *
 * @author Stefan Dietrich
 */
public class JMSControllerPublisher {

    private Publisher _publisher;

    public JMSControllerPublisher() {
        _publisher = new Publisher();
        _publisher.start();
    }

    public void publishMessage(DTOMessage message) throws NamingException, Exception {
        if (_publisher != null) {
            _publisher.publish(message);
        } else {
            throw new Exception("Publisher konnte nicht gestartet werden");
        }
    }
}
