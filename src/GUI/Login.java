/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUIController.LoginCtrl;
import javax.swing.JOptionPane;

/**
 *
 * @author Monika
 */
public class Login extends javax.swing.JFrame {
    private LoginCtrl ctrl;
    private String username;
    private String password;
    /**
     * Creates new form Login
     */
    public Login(LoginCtrl controller) {
        ctrl = controller;
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanelScreen = new javax.swing.JPanel();
        jPanelScreenTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelLoginData = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jpwfPassword = new javax.swing.JPasswordField();
        jLabelEmptyLogin = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jPanelInfoMessages = new javax.swing.JPanel();
        jPanelMessage = new javax.swing.JPanel();
        jPanelLoginError = new javax.swing.JPanel();
        jLabelLoginErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanelScreen.setLayout(new java.awt.GridLayout(3, 1));

        jPanelScreenTitle.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTakTicket");
        jPanelScreenTitle.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanelScreenTitle.add(jLabel2);

        jPanelScreen.add(jPanelScreenTitle);

        jPanelLoginData.setLayout(new java.awt.GridLayout(3, 0));

        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("Benutzername");
        jPanelLoginData.add(jLabelUsername);
        jPanelLoginData.add(jTextFieldUsername);

        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("Password");
        jLabelPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTextField(), org.jdesktop.beansbinding.ObjectProperty.create(), jLabelPassword, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        jPanelLoginData.add(jLabelPassword);
        jPanelLoginData.add(jpwfPassword);
        jPanelLoginData.add(jLabelEmptyLogin);

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelLoginData.add(jButtonLogin);

        jPanelScreen.add(jPanelLoginData);

        jPanelInfoMessages.setLayout(new java.awt.GridLayout(1, 2));

        jPanelMessage.setLayout(new java.awt.GridLayout(1, 0));
        jPanelInfoMessages.add(jPanelMessage);

        jPanelLoginError.setLayout(new java.awt.GridLayout(1, 0));

        jLabelLoginErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelLoginError.add(jLabelLoginErrorMessage);

        jPanelInfoMessages.add(jPanelLoginError);

        jPanelScreen.add(jPanelInfoMessages);

        getContentPane().add(jPanelScreen);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        btnLoginClicked();
    }//GEN-LAST:event_jButtonLoginActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmptyLogin;
    private javax.swing.JLabel jLabelLoginErrorMessage;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelInfoMessages;
    private javax.swing.JPanel jPanelLoginData;
    private javax.swing.JPanel jPanelLoginError;
    private javax.swing.JPanel jPanelMessage;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JPanel jPanelScreenTitle;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JPasswordField jpwfPassword;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void btnLoginClicked() {
        username = jTextFieldUsername.getText();
        char[] pw = jpwfPassword.getPassword();
        password = String.valueOf(pw);
        System.out.println(password);
        String message = "";
        if (!username.isEmpty() || !password.isEmpty()) {
            message = ctrl.checkLogin(username, password);
            if (!"".equals(message)) {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            jLabelLoginErrorMessage.setText("Bitte geben Sie Benutzername und Passwort ein.");
        }
    }    
        
    public void Quit() {
        this.dispose();
    }    
}
