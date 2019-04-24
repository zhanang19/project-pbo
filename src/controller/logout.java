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
import view.registration;
import view.login;
import view.forgot_password;

/**
 *
 * @author MaulanaKevinPradana
 */
    public class logout implements ActionListener {

        private final JFrame view;

        public logout(JFrame v) {
            view = v;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int pilihan = JOptionPane.showConfirmDialog(view, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (pilihan == JOptionPane.YES_OPTION) {
                login viewLogin = new login();
                M_user model = new M_user();
                users user = new users(new login(), new registration(), new forgot_password(),new M_user());
                view.dispose();
            } else {
                //empty
            }
        }
    }