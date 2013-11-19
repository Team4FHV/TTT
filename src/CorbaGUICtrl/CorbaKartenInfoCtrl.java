/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CorbaGUICtrl;

import CorbaClient.CorbaClient;
import DTO.objecte.*;
import Exceptions.KarteNichtVerfuegbarException;
import Exceptions.SaveFailedException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Stefan Dietrich
 */
public class CorbaKartenInfoCtrl {

    private DTOVeranstaltung _veranstaltung;
    private DTOKategorieInformation _kategorie;
    private DTOKategorieKarte _Kategoriekarten;
    private CorbaClient _client;

    public CorbaKartenInfoCtrl(int veranstaltungID, int kategorieID, CorbaClient client) {
        _client = client;
        try {
            _veranstaltung = client.getVeranstaltungById(veranstaltungID);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            _kategorie = client.getKategorieInfo(kategorieID);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new DTOKategorienAuswaehlen(_kategorie.getId()));
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public TableModel getKartenInfo() {
        return null;
    }

    public DTOVeranstaltung getVeranstaltung() {
        return _veranstaltung;
    }

    public DTOKategorieInformation getKategorie() {
        return _kategorie;
    }

    public TableModel getKartenInfoModel() {
        Object[][] ob = new Object[_Kategoriekarten.getDTOKarten().size()][5];
        for (int i = 0; i < _Kategoriekarten.getDTOKarten().size(); i++) {
            DTOKarte k = _Kategoriekarten.getDTOKarten().get(i);
            ob[i][0] = false;
            ob[i][1] = k.getID();
            ob[i][2] = k.getReihe();
            ob[i][3] = k.getPlatz();
            ob[i][4] = false;
        }
        return (new DefaultTableModel(
                ob,
                new String[]{
            "Auswählen", "KartenID", "Reihe", "Sitzplatz", "Ermäßigt"
        }) {
            Class[] types = new Class[]{
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    public void kartenBestellen(List<Object[]> bestellteKarten) throws RemoteException, SaveFailedException, KarteNichtVerfuegbarException, Exception {
        List<DTOKarteBestellen> karten = new LinkedList<>();
        int kundenID = 0;
        for (Object[] o : bestellteKarten) {

            karten.add(new DTOKarteBestellen((int) o[1], kundenID, (boolean) o[4]));
        }
        _client.verkaufSpeichern(karten);

        updateController();
    }

    private void updateController() {
        try {
            _kategorie = _client.getKategorieInfo(_kategorie.getId());
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new DTOKategorienAuswaehlen(_kategorie.getId()));
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelClicked() {
        CorbaMainGuiCtrl.KarteCancel(_veranstaltung.getID());
    }

    void setVeranstaltung(int veranstaltungID) {
        try {
            _veranstaltung = _client.getVeranstaltungById(veranstaltungID);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void setKategorieID(int kategorieID) {
        try {
            _kategorie = _client.getKategorieInfo(kategorieID);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new DTOKategorienAuswaehlen(_kategorie.getId()));
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadKarten() throws RemoteException {
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new DTOKategorienAuswaehlen(_kategorie.getId()));
    }
}
