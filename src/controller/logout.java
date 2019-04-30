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
import model.m_user;
import view.v_registration;
import view.v_login;
import view.v_forgot_password;

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
                v_login viewLogin = new v_login();
                m_user model = new m_user();
                users user = new users(new v_login(), new v_registration(), new v_forgot_password(),new m_user());
                view.dispose();
            } else {
                //empty
            }
        }
    }