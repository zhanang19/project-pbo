/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.M_user;
import view.login;
import view.daftar;
import view.lupa_password;

/**
 *
 * @author ASUS
 */
public class user {

    private M_user model;
    private login viewLogin;
    private daftar viewDaftar;
    private lupa_password viewLupaPassword;

    public user() {
        //konstruktor kosong
    }

    public user(login viewLogin, daftar viewDaftar, lupa_password viewLupaPassword, M_user model) {
        this.model = model;

        this.viewLogin = viewLogin;
        this.viewLogin.setVisible(true);
        this.viewLogin.loginListener(new loginListener());
        this.viewLogin.daftarListener(new daftarViewListener());
        this.viewLogin.lupaPasswordListener(new lupaPasswordViewLister());
        this.viewLogin.exitListener(new exitListener());

        this.viewDaftar = viewDaftar;
        this.viewDaftar.daftarListener(new daftarListener());
        this.viewDaftar.backListener(new backListener());
        this.viewDaftar.exitListener(new exitListener());

        this.viewLupaPassword = viewLupaPassword;
        this.viewLupaPassword.sendListener(new sendListener());
        this.viewLupaPassword.backListener(new backListener());
        this.viewLupaPassword.exitListener(new exitListener());

    }

    //<editor-fold defaultstate="collapse" desc="Login">
    private class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = viewLogin.getTxtUsername();
            String password = viewLogin.getTxtPassword();

            int tingkatan = model.login(username, password);
            if (tingkatan == 1) {
                admin admin = new controller.admin();
                viewLogin.dispose();
            } else {
                JOptionPane.showMessageDialog(viewLogin, "Username atau Password Salah");
            }
        }

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Daftar">
    private class daftarViewListener implements MouseListener {

        public daftarViewListener() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            viewLogin.setVisible(false);
            viewDaftar.setVisible(true);
            viewLupaPassword.setVisible(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class daftarListener implements ActionListener {

        public daftarListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Lupa Password">
    private class lupaPasswordViewLister implements MouseListener {

        public lupaPasswordViewLister() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            viewLogin.setVisible(false);
            viewDaftar.setVisible(false);
            viewLupaPassword.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private static class sendListener implements ActionListener {

        public sendListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    //</editor-fold>

    private class backListener implements ActionListener {

        public backListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewLogin.setVisible(true);
            viewDaftar.setVisible(false);
            viewLupaPassword.setVisible(false);
        }
    }

    private class exitListener implements ActionListener {

        public exitListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Program Berhenti");
            System.exit(0);
        }
    }

}
