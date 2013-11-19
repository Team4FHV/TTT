/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CorbaGUI;


import CorbaGUICtrl.CorbaVeranstaltungKategorieCtrl;
import DTO.objecte.DTOVeranstaltung;
import javax.swing.JFrame;

/**
 *
 * @author Stefan Dietrich
 */
public class CorbaVeranstaltungKategorie extends javax.swing.JFrame {

    private CorbaVeranstaltungKategorieCtrl _ctrl;

    /**
     * Creates new form CorbaVeranstaltungKategorie
     */
    public CorbaVeranstaltungKategorie(CorbaVeranstaltungKategorieCtrl ctrl) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        _lblVeranstaltungsname = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        _lblVeranstaltungsdatum = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        _lblVeranstaltungsort = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tblKategorien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        _btnKategorieAuswaehlen = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        _btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        jPanel6.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setText("Veranstaltungsinformationen:");
        jPanel6.add(jLabel1);

        jPanel4.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(3, 1));

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jPanel11.setLayout(new java.awt.GridLayout(1, 1));

        jLabel2.setText("Veranstaltungsname:");
        jPanel11.add(jLabel2);

        jPanel8.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(1, 1));

        _lblVeranstaltungsname.setText("jLabel3");
        jPanel12.add(_lblVeranstaltungsname);

        jPanel8.add(jPanel12);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        jPanel13.setLayout(new java.awt.GridLayout(1, 1));

        jLabel4.setText("Datum:");
        jPanel13.add(jLabel4);

        jPanel9.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(1, 1));

        _lblVeranstaltungsdatum.setText("jLabel5");
        jPanel14.add(_lblVeranstaltungsdatum);

        jPanel9.add(jPanel14);

        jPanel7.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 2));

        jPanel15.setLayout(new java.awt.GridLayout(1, 1));

        jLabel6.setText("Veranstaltungsort:");
        jPanel15.add(jLabel6);

        jPanel10.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 1));

        _lblVeranstaltungsort.setText("jLabel7");
        jPanel16.add(_lblVeranstaltungsort);

        jPanel10.add(jPanel16);

        jPanel7.add(jPanel10);

        jPanel4.add(jPanel7);

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        _tblKategorien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "KategorieID", "Kategoriename", "Kategoriepreis", "Freie Sitzplätze"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        _tblKategorien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(_tblKategorien);
        _tblKategorien.getColumnModel().getColumn(0).setResizable(false);
        _tblKategorien.getColumnModel().getColumn(1).setResizable(false);
        _tblKategorien.getColumnModel().getColumn(2).setResizable(false);
        _tblKategorien.getColumnModel().getColumn(3).setResizable(false);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout(1, 2));

        jPanel20.setLayout(new java.awt.GridLayout(1, 1));

        _btnKategorieAuswaehlen.setText("Kategorie auswählen");
        _btnKategorieAuswaehlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnKategorieAuswaehlenActionPerformed(evt);
            }
        });
        jPanel20.add(_btnKategorieAuswaehlen);

        jPanel19.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(1, 1));

        _btnCancel.setText("Cancel");
        _btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnCancelActionPerformed(evt);
            }
        });
        jPanel21.add(_btnCancel);

        jPanel19.add(jPanel21);

        jPanel3.add(jPanel19);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnCancelActionPerformed
        btnCancelClicked();
    }//GEN-LAST:event__btnCancelActionPerformed

    private void _btnKategorieAuswaehlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnKategorieAuswaehlenActionPerformed
        btnKategorieWaehlenClicked();
    }//GEN-LAST:event__btnKategorieAuswaehlenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        btnCancelClicked();
    }//GEN-LAST:event_formWindowClosing
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnCancel;
    private javax.swing.JButton _btnKategorieAuswaehlen;
    private javax.swing.JLabel _lblVeranstaltungsdatum;
    private javax.swing.JLabel _lblVeranstaltungsname;
    private javax.swing.JLabel _lblVeranstaltungsort;
    private javax.swing.JTable _tblKategorien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadComponents() {
        fillVeranstaltungsInformation();
        setTableModel();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void fillVeranstaltungsInformation() {
        DTOVeranstaltung veranstaltung = _ctrl.getVeranstaltung();
        _lblVeranstaltungsname.setText(veranstaltung.getVname());
        _lblVeranstaltungsdatum.setText(veranstaltung.getDate().toString());
        _lblVeranstaltungsort.setText(veranstaltung.getVOrt());
    }

    private void setTableModel() {
        _tblKategorien.setModel(_ctrl.getKategorieInfoModel());
    }

    private void btnCancelClicked() {
        _ctrl.cancelButton();
    }

    private void btnKategorieWaehlenClicked() {
        int selectedRow[] = _tblKategorien.getSelectedRows();
        if (selectedRow.length != 0) {
            int id = (int) _tblKategorien.getValueAt(selectedRow[0], 0);
            System.out.println("selected kategorie " + id);
            _ctrl.selectKategorie(id);
        }
    }

    public void Quit() {
        this.dispose();
    }
}
