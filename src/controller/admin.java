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
import view.login;
import view.account_admin;
import view.recordingAnimal_admin;
import view.animal_type;
import view.calculator;
import model.M_recording_animal;
import model.M_user;
import model.M_animal_type;
import model.M_type_pet;
import view.daftar;
import view.lupa_password;

/**
 *
 * @author ASUS
 */
public class admin {

    private login viewLogin;
    private recordingAnimal_admin viewRecordingAnimal;
    private calculator viewCalculator;
    private M_recording_animal modelAnimal;
    private M_user modelUsers;
    private account_admin viewAccount;
    private animal_type viewAnimalType;
    private M_animal_type modelAnimalType;
    private M_type_pet modelTypePet;

    public admin() {
        viewRecordingAnimal = new recordingAnimal_admin();
        viewRecordingAnimal.setVisible(true);
        viewRecordingAnimal.rAnimalListener(new rAnimalListener());
        viewRecordingAnimal.accountListener(new accountListener());
        viewRecordingAnimal.tAnimalListener(new tAnimalListener());
        viewRecordingAnimal.calculatorListener(new calculatorListener());
        viewRecordingAnimal.logoutListener(new logout(viewRecordingAnimal));
        viewRecordingAnimal.addListener(new addRecordListener());
        viewRecordingAnimal.deleteListener(new deleteRecordListener());
        viewRecordingAnimal.updateListener(new updateRecordListener());
        viewRecordingAnimal.refreshListener(new refreshRecordListener());

        viewCalculator = new calculator();
        viewCalculator.rAnimalListener(new rAnimalListener());
        viewCalculator.accountListener(new accountListener());
        viewCalculator.tAnimalListener(new tAnimalListener());
        viewCalculator.calculatorListener(new calculatorListener());
        viewCalculator.logoutListener(new logout(viewCalculator));
        viewCalculator.countListener(new countListener());

        viewAccount = new account_admin();
        viewAccount.rAnimalListener(new rAnimalListener());
        viewAccount.accountListener(new accountListener());
        viewAccount.tAnimalListener(new tAnimalListener());
        viewAccount.calculatorListener(new calculatorListener());
        viewAccount.logoutListener(new logout(viewAccount));
        viewAccount.addListener(new addAccountListener());
        viewAccount.deleteListener(new deleteAccountListener());
        viewAccount.updateListener(new updateAccountListener());
        viewAccount.refreshListener(new refreshAccountListener());

        viewAnimalType = new animal_type();
        viewAnimalType.rAnimalListener(new rAnimalListener());
        viewAnimalType.accountListener(new accountListener());
        viewAnimalType.tAnimalListener(new tAnimalListener());
        viewAnimalType.calculatorListener(new calculatorListener());
        viewAnimalType.logoutListener(new logout(viewAnimalType));
        viewAnimalType.addTypePetListener(new addTypePetListener());
        viewAnimalType.deleteTypePetListener(new deleteTypePetListener());
        viewAnimalType.updateTypePetListener(new updateTypePetListener());
        viewAnimalType.refreshTypePetListener(new refreshTypePetListener());
        viewAnimalType.addAnimalTypeListener(new addAnimalTypeListener());
        viewAnimalType.deleteAnimalTypeListener(new deleteAnimalTypeListener());
        viewAnimalType.updateAnimalTypeListener(new updateAnimalTypeListener());
        viewAnimalType.refreshAnimalTypeListener(new refreshAnimalTypeListener());

        modelAnimal = new M_recording_animal();
        readTableRecordingAnimal();

        modelUsers = new M_user();
        readTableUsers();
        
        modelAnimalType = new M_animal_type();
        readTableAnimalType();
        
        modelTypePet = new M_type_pet();
        readTableTypePet();
        
    }

    //<editor-fold defaultstate="collapse" desc="Account">
    private class accountListener implements ActionListener {

        public accountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(true);
            viewAnimalType.setVisible(false);
        }
    }

    private void readTableUsers() {
        viewAccount.setTabel(modelUsers.readTableUsers());
    }

    private class addAccountListener implements ActionListener {

        public addAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menambahkan data");
        }
    }

    private class deleteAccountListener implements ActionListener {

        public deleteAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menghapus data");
        }
    }

    private class updateAccountListener implements ActionListener {

        public updateAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk mengubah data");
        }
    }

    private class refreshAccountListener implements ActionListener {

        public refreshAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk merefresh data");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Recording Animal">
    private class rAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(true);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(false);
        }
    }

    private void readTableRecordingAnimal() {
        viewRecordingAnimal.setTabel(modelAnimal.readTable_RecordingAnimal());
    }

    private class addRecordListener implements ActionListener {

        public addRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menambahkan data");
        }
    }

    private class deleteRecordListener implements ActionListener {

        public deleteRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk menghapus data");
        }
    }

    private class updateRecordListener implements ActionListener {

        public updateRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk memperbarui data");
        }
    }

    private class refreshRecordListener implements ActionListener {

        public refreshRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "System belum diprogram untuk merefresh data");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Type Animal">
    private class tAnimalListener implements ActionListener {

        public tAnimalListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(true);
        }
    }
    
    private void readTableAnimalType() {
        viewAnimalType.setTabelAnimalType(modelAnimalType.readTable_animalType());
    }
    
    private void readTableTypePet() {
        viewAnimalType.setTabelTypePet(modelTypePet.readTable_typePet());
    }

    private class addTypePetListener implements ActionListener {

        public addTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk menambahkan data");
        }
    }

    private class deleteTypePetListener implements ActionListener {

        public deleteTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk menghapus data");
        }
    }

    private class updateTypePetListener implements ActionListener {

        public updateTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk mengubah data");
        }
    }

    private class refreshTypePetListener implements ActionListener {

        public refreshTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk merefresh data");
        }
    }

    private class addAnimalTypeListener implements ActionListener {

        public addAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk menambahkan data");
        }
    }

    private class deleteAnimalTypeListener implements ActionListener {

        public deleteAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk menghapus data");
        }
    }

    private class updateAnimalTypeListener implements ActionListener {

        public updateAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk mengubah data");
        }
    }

    private class refreshAnimalTypeListener implements ActionListener {

        public refreshAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "System belum diprogram untuk merefresh data");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Calculator">
    private class calculatorListener implements ActionListener {

        public calculatorListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewCalculator.setVisible(true);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(false);
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
    //</editor-fold>

    public class logout implements ActionListener {

        private final JFrame view;

        public logout(JFrame v) {
            view = v;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int pilihan = JOptionPane.showConfirmDialog(view, "Yakin Ingin Logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (pilihan == JOptionPane.YES_OPTION) {
                login viewLogin = new login();
                M_user model = new M_user();
                user user = new user(new login(), new daftar(), new lupa_password(),new M_user());
                view.dispose();
            } else {
                //empty
            }
        }
    }
}
