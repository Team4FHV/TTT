/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIController;

import DTO.objecte.DTORollenList;
import client.Client;
import java.util.List;
import sun.applet.Main;

/**
 *
 * @author Monika
 */
public class SelectionCtrl {
    private DTORollenList _rollen;

    SelectionCtrl(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRollen(DTORollenList rolList) {
        _rollen = rolList;
    }

    public void veranstaltungSuchen() {
        MainGuiCtrl.VeranstaltungSuchen();
    }

    public void KarteReservieren() {
        MainGuiCtrl.VeranstaltungSuchen();
    }

    public void KundenVerwalten() {
       MainGuiCtrl.KundenVerwalten();
    }

    public void KarteKaufen() {
        MainGuiCtrl.VeranstaltungSuchen();
    }

    public List<String> loadRoles() {
        return _rollen.getRollen();
    }
    
}
