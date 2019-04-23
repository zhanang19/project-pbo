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
import view.register;
import view.login;
import view.forgotten_password;
import view.recordingAnimal_admin;

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
                users user = new users(new login(), new register(), new forgotten_password(),new M_user());
                view.dispose();
            } else {
                //empty
            }
        }
    }