/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.objecte.DTOMessage;
import RSSParser.Feed;
import RSSParser.FeedMessage;
import RSSParser.RSSFeedParser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author media
 */
public class MessageController {
    
private static MessageController _instance = null;
private  List<DTOMessage> messageList;
private String[] topicNames = {"topic1", "topic2"};



    private MessageController() {
        
    }
      
    public static MessageController getInstance() {
		if (_instance == null) {
			_instance = new MessageController();
		}
		return _instance;
	}

    public List<DTOMessage> loadMessages(){
    RSSFeedParser parser = new RSSFeedParser("http://www.festivalticker.de/rss-festivalfeed/festivalkalender.xml");
    Feed feed = parser.readFeed();
    return feed.getMessages();
    }

    public String[] getTopicNames() {
        return topicNames;
    }
    
    public void publishMessage(DTOMessage message){
        
    }
    
     public void addMessageToClient(DTOMessage m) {
         
     }
     
     public void getTopicsVonBenutzer(int BenutzerId){
         
     }
}
