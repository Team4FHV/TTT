/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JMS;

import java.util.Properties;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author media
 */
public class Subscriber implements MessageListener {
    String clientId;
    String topicname;
    String topicConnectionFactoryName = "topicConnectionFactory";
    Context jndiContext = null;
    TopicConnectionFactory topicConnectionFactory = null;
    TopicConnection topicConnection = null;
    TopicSession topicSession = null;
    Topic topic = null;

    public Subscriber() {
    }

   
    
    public Subscriber(String clientId, String topicname) {
         this.clientId =  clientId;
         this.topicname = topicname;
    }

    public void start() {

        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");//ur server ip  
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700"); //default is 3700  

        try {
            jndiContext = new InitialContext(props);
            topicConnectionFactory = (TopicConnectionFactory) jndiContext.lookup(topicConnectionFactoryName);


        } catch (NamingException e) {
            System.out.println("JNDI lookup failed: "
                    + e.toString());

        }
    }

    public void subscribe() throws NamingException {
       
        try {
            Topic topic = (Topic) jndiContext.lookup(topicname);

            topicConnection = topicConnectionFactory.createTopicConnection();

            topicConnection.setClientID(clientId);

            topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            // create a topic subscriber
            TopicSubscriber topicSubscriber = topicSession.createDurableSubscriber(topic, topicConnection.getClientID());

            // start the connection
            topicConnection.start();


            ObjectMessage msg = (ObjectMessage) topicSubscriber.receive(15000);
            if (msg == null) {
                System.out.println("Timed out waiting for msg");
            } else {
                System.out.println("Message empfangen :" + msg.toString());
            }


            // wait for messages
            System.out.print("waiting for messages\n");

            // set an asynchronous message listener
            topicSubscriber.setMessageListener(new Subscriber());

        } catch (JMSException e) {
            System.out.println("Exception occurred: " + e.toString());

        }
    }

    @Override
    public void onMessage(Message message) {
       
            System.out.println("received: " + message.toString());
       
    }

    public void stop() throws JMSException {
        topicConnection.close();

    }
}
