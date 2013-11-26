/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUIController.SelectionCtrl;
import java.util.List;

/**
 *
 * @author Monika
 */
public class Selection extends javax.swing.JFrame {
    
    private SelectionCtrl _ctrl;

    /**
     * Creates new form Selection
     */
    public Selection(SelectionCtrl ctrl) {
        _ctrl = ctrl;
        initComponents();
        loadComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelScreen = new javax.swing.JPanel();
        jPanelScreenTitle = new javax.swing.JPanel();
        jLabelScreenTitle = new javax.swing.JLabel();
        jPanelSelection = new javax.swing.JPanel();
        jButtonVsuchen = new javax.swing.JButton();
        jButtonKreservieren = new javax.swing.JButton();
        jButtonKverkaufen = new javax.swing.JButton();
        jButtonKuVerwalten = new javax.swing.JButton();
        jButtonMessages = new javax.swing.JButton();
        jPanelInfoMessage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanelScreen.setLayout(new java.awt.GridLayout(3, 1));

        jPanelScreenTitle.setLayout(new java.awt.GridLayout(1, 0));

        jLabelScreenTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScreenTitle.setText("Wählen Sie aus Ihren Arbeitsbereichen");
        jPanelScreenTitle.add(jLabelScreenTitle);

        jPanelScreen.add(jPanelScreenTitle);

        jPanelSelection.setLayout(new java.awt.GridLayout(5, 2));

        jButtonVsuchen.setText("Veranstaltung suchen");
        jButtonVsuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVsuchenActionPerformed(evt);
            }
        });
        jPanelSelection.add(jButtonVsuchen);

        jButtonKreservieren.setText("Karten reservieren");
        jButtonKreservieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreservierenActionPerformed(evt);
            }
        });
        jPanelSelection.add(jButtonKreservieren);

        jButtonKverkaufen.setText("Karten verkaufen");
        jButtonKverkaufen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKverkaufenActionPerformed(evt);
            }
        });
        jPanelSelection.add(jButtonKverkaufen);

        jButtonKuVerwalten.setText("Kunden verwalten");
        jButtonKuVerwalten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKuVerwaltenActionPerformed(evt);
            }
        });
        jPanelSelection.add(jButtonKuVerwalten);

        jButtonMessages.setText("Messages schreiben");
        jButtonMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMessagesActionPerformed(evt);
            }
        });
        jPanelSelection.add(jButtonMessages);

        jPanelScreen.add(jPanelSelection);

        jPanelInfoMessage.setLayout(new java.awt.GridLayout(1, 0));
        jPanelScreen.add(jPanelInfoMessage);

        getContentPane().add(jPanelScreen);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVsuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVsuchenActionPerformed
        VeranstaltungSuchenClicked();
    }//GEN-LAST:event_jButtonVsuchenActionPerformed
    
    private void jButtonKreservierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreservierenActionPerformed
        KarteReservierenClicked();
    }//GEN-LAST:event_jButtonKreservierenActionPerformed
    
    private void jButtonKverkaufenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKverkaufenActionPerformed
        KarteKaufenClicked();
    }//GEN-LAST:event_jButtonKverkaufenActionPerformed
    
    private void jButtonKuVerwaltenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKuVerwaltenActionPerformed
        KundenVerwaltenClicked();
    }//GEN-LAST:event_jButtonKuVerwaltenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CloseWindow();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMessagesActionPerformed
       MessageSchreibenClicked();
    }//GEN-LAST:event_jButtonMessagesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKreservieren;
    private javax.swing.JButton jButtonKuVerwalten;
    private javax.swing.JButton jButtonKverkaufen;
    private javax.swing.JButton jButtonMessages;
    private javax.swing.JButton jButtonVsuchen;
    private javax.swing.JLabel jLabelScreenTitle;
    private javax.swing.JPanel jPanelInfoMessage;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JPanel jPanelScreenTitle;
    private javax.swing.JPanel jPanelSelection;
    // End of variables declaration//GEN-END:variables

    private void VeranstaltungSuchenClicked() {
        _ctrl.veranstaltungSuchen();
    }
    
    private void KarteReservierenClicked() {
        _ctrl.KarteReservieren();
    }
    
    private void KundenVerwaltenClicked() {
        _ctrl.KundenVerwalten();
    }
    
    private void KarteKaufenClicked() {
        _ctrl.KarteKaufen();
    }
    
    public void Quit() {
        this.dispose();
    }
    
    public void CloseWindow()
    {
        _ctrl.closeWindow();
    }
    
    private void loadComponents() {
        List<String> roles = _ctrl.loadRoles();
        jButtonKreservieren.setEnabled(false);
        jButtonKuVerwalten.setEnabled(false);
        jButtonKverkaufen.setEnabled(false);
        jButtonVsuchen.setEnabled(false);
        for (String s : roles) {
            if (s.equals("Datenpflege")) {
                jButtonKuVerwalten.setEnabled(true);
            } else if (s.equals("Verkauf")) {
                jButtonKreservieren.setEnabled(true);
                jButtonKverkaufen.setEnabled(true);
                jButtonVsuchen.setEnabled(true);
            }
        }
    }

    private void MessageSchreibenClicked() {
        _ctrl.MessageSchreiben();
    }
}
