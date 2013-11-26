/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIController;

import DTO.objecte.DTOMessage;
import DTO.objecte.DTOTopicData;
import DTO.objecte.DTOTopicList;
import client.Client;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Monika
 */
public class MessageSchreibenCtrl {

    private Client _client;
    private ArrayList<DTOTopicData> _topics = new ArrayList<>();

    public MessageSchreibenCtrl(Client client) {
        this._client = client;
        _topics = _client.getTopics();
    }

    public ListModel getTopicModel() {
        DefaultListModel<String> list = new DefaultListModel<>();
        if (!_topics.isEmpty()) {
            for (int i = 0; i < _topics.size(); i++) {
                list.add(i, _topics.get(i).getName());
            }
        } else {
            list.add(0, "Keine Topics verfügbar");
        }
        return list;
    }

    public void createMessage(String title, String text, String topic) {
        Date date = new Date();
        DTOMessage message = new DTOMessage(title, text, date, topic);
        _client.publishMessage(message);
        CancelButtonClicked();
    }

    public void CancelButtonClicked() {
        MainGuiCtrl.MessageSchreibenCancel();
    }
}
