/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIController;

import DTO.objecte.DTOLoginDaten;
import DTO.objecte.DTORollenList;
import Exceptions.BenutzerNichtInDBException;
import Exceptions.FalschesPasswordExeption;
import client.Client;
import controller.RMIController;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author media
 */
public class TESTLogin {

    static JFrame f = new JFrame();
    static RMIController rmi;
    static DTORollenList list;
    static Client c = new Client();

    public static void main(String[] args) throws RemoteException, Exception {
        rmi = new RMIController();
        f.setBounds(0, 0, 600, 600);
        f.setLayout(new BorderLayout());
        f.setVisible(true);
        Button b = new Button("try");
        f.add(b, BorderLayout.CENTER);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               

                try {
                    list = c.login(new DTOLoginDaten("ife7261", "eprdlepan"));


                    for (int i = 0; i < list.getRollen().size(); i++) {
                        String s = list.getRollen().get(i);
                        System.out.println("ALLE ROLLEN  " + s);
                    }

                } catch (Exception ex) {
                    String message = "";
                    if (ex instanceof FalschesPasswordExeption) {
                        message = "Falsches passwort";
                    }
                    if (ex instanceof RemoteException) {
                        message = "Server probleme";
                    }
                    if (ex instanceof BenutzerNichtInDBException) {
                        message = "Benutzer nicht in DB";
                    }

                    JOptionPane.showMessageDialog(f, message, "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }
}
