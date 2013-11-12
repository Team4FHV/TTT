/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Exceptions.SaveFailedException;
import GUIController.KundeAnlegenCtrl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefan Dietrich
 */
public class KundeAnlegen extends javax.swing.JFrame {
     KundeAnlegenCtrl _ctrl;

    /**
     * Creates new form KundeAnlegen
     */
    public KundeAnlegen(KundeAnlegenCtrl ctrl) {
        _ctrl = ctrl;
        initComponents();
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        _txtVorname = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        _lblVorname = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        _txtNachname = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        _lblNachname = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        _txtGeburtsdatum = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        _lblGeburstdatum = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        _txtAnrede = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        _lblAnrede = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        _txtFirmenname = new javax.swing.JTextField();
        jPanel51 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        _txtLand = new javax.swing.JTextField();
        jPanel52 = new javax.swing.JPanel();
        _lblLand = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        _txtPostleitzahl = new javax.swing.JTextField();
        jPanel54 = new javax.swing.JPanel();
        _lblPostleitzahl = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        _txtOrt = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        _lblOrt = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        _txtStrasse = new javax.swing.JTextField();
        jPanel55 = new javax.swing.JPanel();
        _lblStrasse = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        _txtHausnummer = new javax.swing.JTextField();
        jPanel56 = new javax.swing.JPanel();
        _lblHausnummer = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        _txtTelefonnummer = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        _txtEMail = new javax.swing.JTextField();
        jPanel58 = new javax.swing.JPanel();
        _lblEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        _btnKundeAnlegen = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        _btnCancel = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel2.setLayout(new java.awt.GridLayout(12, 2));

        jPanel11.setLayout(new java.awt.GridLayout(1, 3));

        jPanel23.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setText("Vorname: (*)");
        jPanel23.add(jLabel1);

        jPanel11.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridLayout(1, 1));
        jPanel24.add(_txtVorname);

        jPanel11.add(jPanel24);

        jPanel47.setLayout(new java.awt.GridLayout(1, 1));

        _lblVorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblVorname.setForeground(new java.awt.Color(255, 0, 0));
        jPanel47.add(_lblVorname);

        jPanel11.add(jPanel47);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(1, 3));

        jPanel25.setLayout(new java.awt.GridLayout(1, 1));

        jLabel2.setText("Nachname: (*)");
        jPanel25.add(jLabel2);

        jPanel12.add(jPanel25);

        jPanel26.setLayout(new java.awt.GridLayout(1, 1));
        jPanel26.add(_txtNachname);

        jPanel12.add(jPanel26);

        jPanel48.setLayout(new java.awt.GridLayout(1, 1));

        _lblNachname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblNachname.setForeground(new java.awt.Color(255, 0, 0));
        jPanel48.add(_lblNachname);

        jPanel12.add(jPanel48);

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(1, 3));

        jPanel27.setLayout(new java.awt.GridLayout(1, 1));

        jLabel3.setText("Geburtsdatum: (*)");
        jPanel27.add(jLabel3);

        jPanel13.add(jPanel27);

        jPanel28.setLayout(new java.awt.GridLayout(1, 1));
        jPanel28.add(_txtGeburtsdatum);

        jPanel13.add(jPanel28);

        jPanel49.setLayout(new java.awt.GridLayout(1, 1));

        _lblGeburstdatum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblGeburstdatum.setForeground(new java.awt.Color(255, 0, 0));
        jPanel49.add(_lblGeburstdatum);

        jPanel13.add(jPanel49);

        jPanel2.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(1, 3));

        jPanel29.setLayout(new java.awt.GridLayout(1, 1));

        jLabel4.setText("Anrede: (*)");
        jPanel29.add(jLabel4);

        jPanel14.add(jPanel29);

        jPanel30.setLayout(new java.awt.GridLayout(1, 1));
        jPanel30.add(_txtAnrede);

        jPanel14.add(jPanel30);

        jPanel50.setLayout(new java.awt.GridLayout(1, 1));

        _lblAnrede.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblAnrede.setForeground(new java.awt.Color(255, 0, 0));
        jPanel50.add(_lblAnrede);

        jPanel14.add(jPanel50);

        jPanel2.add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout(1, 3));

        jPanel31.setLayout(new java.awt.GridLayout(1, 1));

        jLabel5.setText("Firmenname:");
        jPanel31.add(jLabel5);

        jPanel15.add(jPanel31);

        jPanel32.setLayout(new java.awt.GridLayout(1, 1));
        jPanel32.add(_txtFirmenname);

        jPanel15.add(jPanel32);

        jPanel51.setLayout(new java.awt.GridLayout(1, 1));
        jPanel15.add(jPanel51);

        jPanel2.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 3));

        jPanel33.setLayout(new java.awt.GridLayout(1, 1));

        jLabel6.setText("Land: (*)");
        jPanel33.add(jLabel6);

        jPanel16.add(jPanel33);

        jPanel34.setLayout(new java.awt.GridLayout(1, 1));
        jPanel34.add(_txtLand);

        jPanel16.add(jPanel34);

        jPanel52.setLayout(new java.awt.GridLayout(1, 1));

        _lblLand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblLand.setForeground(new java.awt.Color(255, 0, 0));
        jPanel52.add(_lblLand);

        jPanel16.add(jPanel52);

        jPanel2.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 3));

        jPanel35.setLayout(new java.awt.GridLayout(1, 1));

        jLabel7.setText("Postleitzahl: (*)");
        jPanel35.add(jLabel7);

        jPanel17.add(jPanel35);

        jPanel36.setLayout(new java.awt.GridLayout(1, 1));
        jPanel36.add(_txtPostleitzahl);

        jPanel17.add(jPanel36);

        jPanel54.setLayout(new java.awt.GridLayout(1, 1));

        _lblPostleitzahl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblPostleitzahl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel54.add(_lblPostleitzahl);

        jPanel17.add(jPanel54);

        jPanel2.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout(1, 3));

        jPanel37.setLayout(new java.awt.GridLayout(1, 1));

        jLabel8.setText("Ort: (*)");
        jPanel37.add(jLabel8);

        jPanel18.add(jPanel37);

        jPanel38.setLayout(new java.awt.GridLayout(1, 1));
        jPanel38.add(_txtOrt);

        jPanel18.add(jPanel38);

        jPanel53.setLayout(new java.awt.GridLayout(1, 1));

        _lblOrt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblOrt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel53.add(_lblOrt);

        jPanel18.add(jPanel53);

        jPanel2.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout(1, 3));

        jPanel39.setLayout(new java.awt.GridLayout(1, 1));

        jLabel9.setText("Straße: (*)");
        jPanel39.add(jLabel9);

        jPanel19.add(jPanel39);

        jPanel40.setLayout(new java.awt.GridLayout(1, 1));
        jPanel40.add(_txtStrasse);

        jPanel19.add(jPanel40);

        jPanel55.setLayout(new java.awt.GridLayout(1, 1));

        _lblStrasse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblStrasse.setForeground(new java.awt.Color(255, 0, 0));
        jPanel55.add(_lblStrasse);

        jPanel19.add(jPanel55);

        jPanel2.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(1, 3));

        jPanel41.setLayout(new java.awt.GridLayout(1, 1));

        jLabel10.setText("Hausnummer: (*)");
        jPanel41.add(jLabel10);

        jPanel20.add(jPanel41);

        jPanel42.setLayout(new java.awt.GridLayout(1, 1));
        jPanel42.add(_txtHausnummer);

        jPanel20.add(jPanel42);

        jPanel56.setLayout(new java.awt.GridLayout(1, 1));

        _lblHausnummer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblHausnummer.setForeground(new java.awt.Color(255, 0, 0));
        jPanel56.add(_lblHausnummer);

        jPanel20.add(jPanel56);

        jPanel2.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(1, 3));

        jPanel43.setLayout(new java.awt.GridLayout(1, 1));

        jLabel11.setText("Telefonnummer:");
        jPanel43.add(jLabel11);

        jPanel21.add(jPanel43);

        jPanel44.setLayout(new java.awt.GridLayout(1, 1));
        jPanel44.add(_txtTelefonnummer);

        jPanel21.add(jPanel44);

        jPanel57.setLayout(new java.awt.GridLayout(1, 1));
        jPanel21.add(jPanel57);

        jPanel2.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridLayout(1, 3));

        jPanel45.setLayout(new java.awt.GridLayout(1, 1));

        jLabel12.setText("E-Mail: (*)");
        jPanel45.add(jLabel12);

        jPanel22.add(jPanel45);

        jPanel46.setLayout(new java.awt.GridLayout(1, 1));
        jPanel46.add(_txtEMail);

        jPanel22.add(jPanel46);

        jPanel58.setLayout(new java.awt.GridLayout(1, 1));

        _lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _lblEmail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel58.add(_lblEmail);

        jPanel22.add(jPanel58);

        jPanel2.add(jPanel22);

        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jPanel9.setLayout(new java.awt.GridLayout(1, 1));

        _btnKundeAnlegen.setText("Benutzer anlegen");
        _btnKundeAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnKundeAnlegenActionPerformed(evt);
            }
        });
        jPanel9.add(_btnKundeAnlegen);

        jPanel7.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 1));

        _btnCancel.setText("Cancel");
        _btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnCancelActionPerformed(evt);
            }
        });
        jPanel10.add(_btnCancel);

        jPanel7.add(jPanel10);

        jPanel6.add(jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8);

        jPanel3.add(jPanel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btnKundeAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnKundeAnlegenActionPerformed
         try {
             kundeAnlegenClicked();
         } catch (SaveFailedException ex) {
             Logger.getLogger(KundeAnlegen.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(this,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE); 
         }
    }//GEN-LAST:event__btnKundeAnlegenActionPerformed

    private void _btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnCancelActionPerformed
        cancelClicked();
    }//GEN-LAST:event__btnCancelActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnCancel;
    private javax.swing.JButton _btnKundeAnlegen;
    private javax.swing.JLabel _lblAnrede;
    private javax.swing.JLabel _lblEmail;
    private javax.swing.JLabel _lblGeburstdatum;
    private javax.swing.JLabel _lblHausnummer;
    private javax.swing.JLabel _lblLand;
    private javax.swing.JLabel _lblNachname;
    private javax.swing.JLabel _lblOrt;
    private javax.swing.JLabel _lblPostleitzahl;
    private javax.swing.JLabel _lblStrasse;
    private javax.swing.JLabel _lblVorname;
    private javax.swing.JTextField _txtAnrede;
    private javax.swing.JTextField _txtEMail;
    private javax.swing.JTextField _txtFirmenname;
    private javax.swing.JTextField _txtGeburtsdatum;
    private javax.swing.JTextField _txtHausnummer;
    private javax.swing.JTextField _txtLand;
    private javax.swing.JTextField _txtNachname;
    private javax.swing.JTextField _txtOrt;
    private javax.swing.JTextField _txtPostleitzahl;
    private javax.swing.JTextField _txtStrasse;
    private javax.swing.JTextField _txtTelefonnummer;
    private javax.swing.JTextField _txtVorname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

    private void kundeAnlegenClicked() throws SaveFailedException {
        if (checkFields()) {
            if(_ctrl.neuenKundeAnlegen(_txtVorname.getText(), _txtNachname.getText(), _txtGeburtsdatum.getText(), _txtAnrede.getText(), _txtFirmenname.getText(), _txtLand.getText(), _txtPostleitzahl.getText(), _txtOrt.getText(), _txtStrasse.getText(), _txtHausnummer.getText(), _txtTelefonnummer.getText(), _txtEMail.getText()))
            {
                JOptionPane.showMessageDialog(null, "Kunde wurde angelegt", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kunde konnte nicht angelegt werden", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bitte füllen Sie alle benötigten Felder aus", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelClicked() {
       _ctrl.cancelClicked();
    }

    private boolean checkFields() {
        boolean vorname = false;
        boolean nachname = false;
        boolean geburtsdatum = false;
        boolean anrede = false;
        boolean land = false;
        boolean postleitzahl = false;
        boolean ort = false;
        boolean strasse = false;
        boolean hausnummer = false;
        boolean email = false;
        
        if (!_txtVorname.getText().equals("")) {
            vorname = true;
            _lblVorname.setVisible(false);
        } else {
            vorname = false;
            _lblVorname.setText("Vorname fehlt");
            _lblVorname.setVisible(true);
        }
        if (!_txtNachname.getText().equals("")) {
            nachname = true;
            _lblNachname.setVisible(false);
        } else {
            nachname = false;
            _lblNachname.setText("Nachname fehlt");
            _lblNachname.setVisible(true);
        }
        if (!_txtGeburtsdatum.getText().equals("")) {
            if (checkDate(_txtGeburtsdatum.getText())) {
                geburtsdatum = true;
                _lblGeburstdatum.setVisible(false);
            } else {
                geburtsdatum = false;
                _lblGeburstdatum.setText("Kein korrektes Datum angegeben.");
                _lblGeburstdatum.setVisible(true);
            }
        } else {
            geburtsdatum = false;
            _lblGeburstdatum.setText("Geburtsdatum fehlt");
            _lblGeburstdatum.setVisible(true);
        }
        if (!_txtAnrede.getText().equals("")) {
            anrede = true;
            _lblAnrede.setVisible(false);
        } else {
            anrede = false;
            _lblAnrede.setText("Anrede fehlt");
            _lblAnrede.setVisible(true);
        }
        if (!_txtLand.getText().equals("")) {
            land = true;
            _lblLand.setVisible(false);
        } else {
            land = false;
            _lblLand.setText("Land fehlt");
            _lblLand.setVisible(true);
        }
        if (!_txtPostleitzahl.getText().equals("")) {
            postleitzahl = true;
            _lblPostleitzahl.setVisible(false);
        } else {
            postleitzahl = false;
            _lblPostleitzahl.setText("Postleitzahl fehlt");
            _lblPostleitzahl.setVisible(true);
        }
        if (!_txtOrt.getText().equals("")) {
            ort = true;
            _lblOrt.setVisible(false);
        } else {
            ort = false;
            _lblOrt.setText("Ort fehlt");
            _lblOrt.setVisible(true);
        }
        if (!_txtStrasse.getText().equals("")) {
            strasse = true;
            _lblStrasse.setVisible(false);
        } else {
            strasse = false;
            _lblStrasse.setText("Straße fehlt");
            _lblStrasse.setVisible(true);
        }
        if (!_txtHausnummer.getText().equals("")) {
            hausnummer = true;
            _lblHausnummer.setVisible(false);
        } else {
            hausnummer = false;
            _lblHausnummer.setText("Hausnummer fehlt");
            _lblHausnummer.setVisible(true);
        }
        if (!_txtEMail.getText().equals("")) {
            email = true;
            _lblEmail.setVisible(false);
        } else {
            email = false;
            _lblEmail.setText("E-Mail fehlt");
            _lblEmail.setVisible(true);
        }

        if ((vorname) && (nachname) && (geburtsdatum) && (anrede) && (land) && (postleitzahl) && (ort) && (strasse) && (hausnummer) && (email)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkDate(String text) {
        try {
            SimpleDateFormat sdfToDate = new SimpleDateFormat("dd.MM.yyyy");
            Date d = sdfToDate.parse(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void Quit()
    {
        this.dispose();
    }
}
