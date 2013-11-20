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

    public DTOMessage() {        
    }
    
    public DTOMessage(String title, String text, Date date, int id) {
        _title = title;
        _text = text;
        _date = date;
        _id = id;
    }
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public String getText() {
        return _text;
    }

    public void setText(String _text) {
        this._text = _text;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date _date) {
        this._date = _date;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }
    
    
    
}
