/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.objecte;

import java.util.Date;

/**
 *
 * @author Monika
 */
public class DTOMessage {
    private String _title;
    private String _text;
    private Date _date;
    private int _id;
    private String _topic; 

    public DTOMessage() {        
    }
    
    public DTOMessage(String title, String text, Date date, int id) {
        _title = title;
        _text = text;
        _date = date;
        _id = id;
    }

    public String getTopic() {
        return _topic;
    }

    public void setTopic(String topic) {
        this._topic = topic;
    }
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getText() {
        return _text;
    }

    public void setText(String text) {
        this._text = text;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        this._date = date;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
    
    
    
}
