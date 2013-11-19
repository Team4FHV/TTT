/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CorbaGUICtrl;

import corba.*;
import client.CorbaClient;
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

    private  StructVeranstaltung _veranstaltung;
    private StructKategorieInformation _kategorie;
    private StructKategorieKarte _Kategoriekarten;
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

    public StructVeranstaltung getVeranstaltung() {
        return _veranstaltung;
    }

    public StructKategorieInformation getKategorie() {
        return _kategorie;
    }

    public TableModel getKartenInfoModel() {
        Object[][] ob = new Object[_Kategoriekarten.kartenList.length][5];
        for (int i = 0; i < _Kategoriekarten.kartenList.length; i++) {
            StructKarte k = _Kategoriekarten.kartenList[i];
            ob[i][0] = false;
            ob[i][1] = k.kartenId;
            ob[i][2] = k.reihe;
            ob[i][3] = k.platz;
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
        List<StructKarteBestellen> karten = new LinkedList<>();
        int kundenID = 0;
        for (Object[] o : bestellteKarten) {

            karten.add(new StructKarteBestellen((int) o[1], kundenID, (boolean) o[4]));
        }
        _client.verkaufSpeichern(karten); //Muss In Client geändert werden

        updateController();
    }

    private void updateController() {
        try {
            _kategorie = _client.getKategorieInfo(_kategorie.kategId);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new StructKategorieAuswaehlen(_kategorie.kategId));
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelClicked() {
        CorbaMainGuiCtrl.KarteCancel(_veranstaltung.vid);
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
            _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new StructKategorieAuswaehlen(_kategorie.kategId);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadKarten() throws RemoteException {
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(new StructKategorieAuswaehlen(_kategorie.kategId));
    }
}