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
import view.animal_type;
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
    private M_user modelUsers;
    private account_admin viewAccount;
    private animal_type viewAnimalType;

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
        viewCalculator.countListener(new countListener());

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

        viewAnimalType = new animal_type();
        viewAnimalType.rAnimalListener(new rAnimalListener());
        viewAnimalType.accountListener(new accountListener());
        viewAnimalType.tAnimalListener(new tAnimalListener());
        viewAnimalType.calculatorListener(new calculatorListener());
        viewAnimalType.logoutListener(new logoutListener());
        viewAnimalType.addListener(new addListener());
        viewAnimalType.deleteListener(new deleteListener());
        viewAnimalType.updateListener(new updateListener());
        viewAnimalType.refreshListener(new refreshListener());

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

    private class countListener implements ActionListener {

        public countListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (viewCalculator.getBodyLength().equals("") || viewCalculator.getChestSize().equals("")
                    || viewCalculator.getAge().equals("") || viewCalculator.getGender().equals("")) {
                viewCalculator.setMessage("LENGKAPI DATA!!!");
                viewCalculator.setTxtTitleResult("");
                viewCalculator.setTxtWeight("");
                viewCalculator.setTxtPrice("");
            } else {
                viewCalculator.setMessage("");
                viewCalculator.setTxtTitleResult("HASIL");

                float hasil = (2 * Float.parseFloat(viewCalculator.getChestSize()) * Float.parseFloat(viewCalculator.getBodyLength())) / 104;
                viewCalculator.setTxtWeight("Berat Badan = " + String.valueOf(hasil));

                int harga;
                if (viewCalculator.getGender().equals("Jantan")) {
                    harga = (int) (hasil * 30000) + 200000;
                    viewCalculator.setTxtPrice("Harga = Rp. " + harga);
                } else {
                    harga = (int) (hasil * 30000);
                    viewCalculator.setTxtPrice("Harga = Rp. " + harga);
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
            viewAnimalType.setVisible(false);
            viewLogin.setVisible(false);
        }
    }

    private class rAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(true);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(false);
            viewLogin.setVisible(false);
        }
    }

    private class tAnimalListener implements ActionListener {

        public tAnimalListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(true);
            viewLogin.setVisible(false);
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
            viewAnimalType.setVisible(false);
            viewLogin.setVisible(false);
        }
    }

    private class logoutListener implements ActionListener {

        public logoutListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            viewRecordingAnimal.setVisible(false);
//            viewCalculator.setVisible(false);
//            viewAccount.setVisible(false);            
//            viewAnimalType.setVisible(false);    
//            viewLogin.setVisible(true);
            System.out.println("Program Berhenti");
            System.exit(0);
        }
    }
}
