/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.recordingAnimal_admin;
import view.calculator;
import view.login;
import view.account_admin;
import model.m_recordingAnimal;
import model.M_user;

/**
 *
 * @author ASUS
 */
public class admin {

    private login viewLogin;
    private recordingAnimal_admin viewRecordingAnimal;
    private calculator viewCalculator;
    private m_recordingAnimal modelAnimal;
    private  M_user modelUsers;
    private account_admin viewAccount;

    public admin() {
        viewRecordingAnimal = new recordingAnimal_admin();
        viewRecordingAnimal.setVisible(true);
        viewRecordingAnimal.rAnimalListener(new rAnimalListener());
        viewRecordingAnimal.accountListener(new accountListener());
        viewRecordingAnimal.tAnimalListener(new tAnimalListener());
        viewRecordingAnimal.calculatorListener(new calculatorListener());
        viewRecordingAnimal.logoutListener(new logoutListener());
        viewRecordingAnimal.addListener(new addListener());
        viewRecordingAnimal.deleteListener(new deleteListener());
        viewRecordingAnimal.updateListener(new updateListener());
        viewRecordingAnimal.refreshListener(new refreshListener());

        viewCalculator = new calculator();
        viewCalculator.rAnimalListener(new rAnimalListener());        
        viewCalculator.accountListener(new accountListener());
        viewCalculator.tAnimalListener(new tAnimalListener());
        viewCalculator.calculatorListener(new calculatorListener());
        viewCalculator.logoutListener(new logoutListener());
        viewCalculator.hitungListener(new hitungListener());
        
        viewAccount = new account_admin();
        viewAccount.rAnimalListener(new rAnimalListener());
        viewAccount.accountListener(new accountListener());
        viewAccount.tAnimalListener(new tAnimalListener());
        viewAccount.calculatorListener(new calculatorListener());
        viewAccount.logoutListener(new logoutListener());
        viewAccount.addListener(new addListener());
        viewAccount.deleteListener(new deleteListener());
        viewAccount.updateListener(new updateListener());
        viewAccount.refreshListener(new refreshListener());

        modelAnimal = new m_recordingAnimal();
        bacaTabelRecord();
        
        modelUsers = new M_user();
        readTableUsers();
    }

    private void bacaTabelRecord() {
        viewRecordingAnimal.setTabel(modelAnimal.bacaTabel());
    }

    private void readTableUsers() {
        viewAccount.setTabel(modelUsers.readTableUsers());
    }

    private class addListener implements ActionListener {

        public addListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menambahkan data");
//            if (model.record(
//                    
//            )) {
//                JOptionPane.showMessageDialog(viewRecordingAnimal, "Data Berhasil ditambahkan");
//                viewRecordingAnimal.setVisible(true);
//
//            } else {
//                JOptionPane.showMessageDialog(viewRecordingAnimal, "Gagal Menambahkan Data");
//            }
        }
    }

    private class deleteListener implements ActionListener {

        public deleteListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menghapus data");
        }
    }

    private class updateListener implements ActionListener {

        public updateListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk memperbarui data");
        }
    }

    private class refreshListener implements ActionListener {

        public refreshListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk merefresh data");
        }
    }

    private class hitungListener implements ActionListener {

        public hitungListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (viewCalculator.getPB().equals("") || viewCalculator.getLD().equals("")
                    || viewCalculator.getUsia().equals("") || viewCalculator.getJenisKelamin().equals("")) {
                viewCalculator.setPesan("LENGKAPI DATA!!!");
                viewCalculator.setTxtJudulHasil("");
                viewCalculator.setTxtBB("");
                viewCalculator.setTxtHarga("");
            } else {
                viewCalculator.setPesan("");
                viewCalculator.setTxtJudulHasil("HASIL");

                float hasil = (2 * Float.parseFloat(viewCalculator.getLD()) * Float.parseFloat(viewCalculator.getPB())) / 104;
                viewCalculator.setTxtBB("Berat Badan = " + String.valueOf(hasil));

                int harga;
                if (viewCalculator.getJenisKelamin().equals("Jantan")) {
                    harga = (int) (hasil * 30000) + 200000;
                    viewCalculator.setTxtHarga("Harga = Rp. " + harga);
                } else {
                    harga = (int) (hasil * 30000);
                    viewCalculator.setTxtHarga("Harga = Rp. " + harga);
                }

            }
        }
    }

    private class accountListener implements ActionListener {

        public accountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(true);
        }
    }

    private class rAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(true);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(false);
        }
    }

    private class tAnimalListener implements ActionListener {

        public tAnimalListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    private class calculatorListener implements ActionListener {

        public calculatorListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(true);
            viewAccount.setVisible(false);
        }
    }

    private class logoutListener implements ActionListener {

        public logoutListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Program Berhenti");
            System.exit(0);
        }
    }
}
