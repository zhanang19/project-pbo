/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.M_user;
import view.login;

/**
 *
 * @author ASUS
 */
public class user {

    private M_user model;
    private login viewLogin;

    public user() {
        //konstruktor kosong
    }

    public user(login viewLogin, M_user model) {
        this.model = model;
        this.viewLogin = viewLogin;
        this.viewLogin.setVisible(true);

        this.viewLogin.loginListener(new loginListener());
    }

    private class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = viewLogin.getTxtUsername();
            String password = viewLogin.getTxtPassword();

            int tingkatan = model.login(username, password);
            if (tingkatan == 1) {
                new controller.admin();
                viewLogin.dispose();
            } else {
                JOptionPane.showMessageDialog(viewLogin, "Username atau Password Salah");
            }
        }

    }
}
