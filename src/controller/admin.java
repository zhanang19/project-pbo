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
import javax.swing.JOptionPane;
import view.v_account_admin;
import view.v_recordingAnimal_admin;
import view.v_animal_type;
import model.m_recording_animal;
import model.m_user;
import model.m_animal_type;
import model.m_type_pet;

/**
 *
 * @author ASUS
 */
public class admin {

    private final v_recordingAnimal_admin viewRecordingAnimal;
    private final m_recording_animal modelAnimal;
    private final m_user modelUsers;
    private final v_account_admin viewAccount;
    private final v_animal_type viewAnimalType;
    private final m_animal_type modelAnimalType;
    private final m_type_pet modelTypePet;

    private int idTypePet;
    private int idAnimalType;

    public admin() {
        viewRecordingAnimal = new v_recordingAnimal_admin();
        viewRecordingAnimal.setVisible(true);
        viewRecordingAnimal.rAnimalListener(new rAnimalListener());
        viewRecordingAnimal.accountListener(new accountListener());
        viewRecordingAnimal.tAnimalListener(new tAnimalListener());
        viewRecordingAnimal.logoutListener(new logout(viewRecordingAnimal));
        viewRecordingAnimal.addListener(new addRecordListener());
        viewRecordingAnimal.deleteListener(new deleteRecordListener());
        viewRecordingAnimal.updateListener(new updateRecordListener());
        viewRecordingAnimal.refreshListener(new refreshRecordListener());

        viewAccount = new v_account_admin();
        viewAccount.rAnimalListener(new rAnimalListener());
        viewAccount.accountListener(new accountListener());
        viewAccount.tAnimalListener(new tAnimalListener());
        viewAccount.logoutListener(new logout(viewAccount));
        viewAccount.addListener(new addAccountListener());
        viewAccount.deleteListener(new deleteAccountListener());
        viewAccount.updateListener(new updateAccountListener());
        viewAccount.refreshListener(new refreshAccountListener());

        viewAnimalType = new v_animal_type();
        viewAnimalType.rAnimalListener(new rAnimalListener());
        viewAnimalType.accountListener(new accountListener());
        viewAnimalType.tAnimalListener(new tAnimalListener());
        viewAnimalType.logoutListener(new logout(viewAnimalType));
        viewAnimalType.tabelTypePetListener(new tabelTypePetListener());
        viewAnimalType.addTypePetListener(new addTypePetListener());
        viewAnimalType.deleteTypePetListener(new deleteTypePetListener());
        viewAnimalType.updateTypePetListener(new updateTypePetListener());
        viewAnimalType.refreshTypePetListener(new refreshTypePetListener());
        viewAnimalType.tabelAnimalTypeListener(new tabelAnimalTypeListener());
        viewAnimalType.addAnimalTypeListener(new addAnimalTypeListener());
        viewAnimalType.deleteAnimalTypeListener(new deleteAnimalTypeListener());
        viewAnimalType.updateAnimalTypeListener(new updateAnimalTypeListener());
        viewAnimalType.refreshAnimalTypeListener(new refreshAnimalTypeListener());

        modelAnimal = new m_recording_animal();
        readTableRecordingAnimal();

        modelUsers = new m_user();

        modelAnimalType = new m_animal_type();

        modelTypePet = new m_type_pet();

    }

    //<editor-fold defaultstate="collapse" desc="Account">
    private class accountListener implements ActionListener {

        public accountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewAccount.setVisible(true);
            viewAnimalType.setVisible(false);
            readTableUsers();
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
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to add data");
        }
    }

    private class deleteAccountListener implements ActionListener {

        public deleteAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to delete data");
        }
    }

    private class updateAccountListener implements ActionListener {

        public updateAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to update data");
        }
    }

    private class refreshAccountListener implements ActionListener {

        public refreshAccountListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to refresh data");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Recording Animal">
    private class rAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(true);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(false);
            readTableRecordingAnimal();
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
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to add data");
        }
    }

    private class deleteRecordListener implements ActionListener {

        public deleteRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to delete data");
        }
    }

    private class updateRecordListener implements ActionListener {

        public updateRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to update data");
        }
    }

    private class refreshRecordListener implements ActionListener {

        public refreshRecordListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewRecordingAnimal, "The system has not been programmed to refresh data");
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
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(true);
            readTableTypePet();
            readTableAnimalType();
        }
    }

    private void readTableAnimalType() {
        viewAnimalType.setTabelAnimalType(modelAnimalType.readTable_animalType());
    }

    private void readTableTypePet() {
        viewAnimalType.setTabelTypePet(modelTypePet.readTable_typePet());
    }

    private class tabelTypePetListener implements MouseListener {

        public tabelTypePetListener() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            idTypePet = viewAnimalType.getIdTypePet(viewAnimalType.getSelectedRowTypePet());
        }

        //<editor-fold defaultstate="collapse" desc="Unused">
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
        //</editor-fold>
    }

    private class addTypePetListener implements ActionListener {

        public addTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String type_pet = viewAnimalType.getTxtTypePet();
            if (modelTypePet.create_TypePet(type_pet)) {
                JOptionPane.showMessageDialog(viewAnimalType, "Type pet added");
                viewRecordingAnimal.setVisible(false);
                viewAccount.setVisible(false);
                viewAnimalType.setVisible(true);
                readTableTypePet();
            } else {
                JOptionPane.showMessageDialog(viewAnimalType, "The type of pet failed to add");
            }
        }
    }

    private class deleteTypePetListener implements ActionListener {

        public deleteTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "The system has not been programmed to delete data");
        }
    }

    private class updateTypePetListener implements ActionListener {

        public updateTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String type_pet = viewAnimalType.getTxtTypePet();
            if (modelTypePet.update_TypePet(type_pet, idTypePet)) {
                JOptionPane.showMessageDialog(viewAnimalType, "Type pet has changed");
                viewRecordingAnimal.setVisible(false);
                viewAccount.setVisible(false);
                viewAnimalType.setVisible(true);
                readTableTypePet();                
            } else {
                JOptionPane.showMessageDialog(viewAnimalType, "Type pet failed to change");
            }
        }
    }

    private class refreshTypePetListener implements ActionListener {

        public refreshTypePetListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(true);
            readTableTypePet();
        }
    }

    private class tabelAnimalTypeListener implements MouseListener {

        public tabelAnimalTypeListener() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            idAnimalType = viewAnimalType.getIdAnimalType(viewAnimalType.getSelectedRowAnimalType());
        }

        //<editor-fold defaultstate="collapse" desc="Unused">
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
        //</editor-fold>
    }

    private class addAnimalTypeListener implements ActionListener {

        public addAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String animal_type = viewAnimalType.getTxtAnimalType();
            if (modelAnimalType.create_AnimalType(animal_type)) {
                JOptionPane.showMessageDialog(viewAnimalType, "Animal Type added");
                viewRecordingAnimal.setVisible(false);
                viewAccount.setVisible(false);
                viewAnimalType.setVisible(true);
                readTableAnimalType();
            } else {
                JOptionPane.showMessageDialog(viewAnimalType, "The type of animal failed to add");
            }
        }
    }

    private class deleteAnimalTypeListener implements ActionListener {

        public deleteAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewAnimalType, "The system has not been programmed to delete data");
        }
    }

    private class updateAnimalTypeListener implements ActionListener {

        public updateAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String animal_type = viewAnimalType.getTxtAnimalType();
            if (modelAnimalType.update_AnimalType(animal_type, idAnimalType)) {
                JOptionPane.showMessageDialog(viewAnimalType, "Animal type has changed");
                viewRecordingAnimal.setVisible(false);
                viewAccount.setVisible(false);
                viewAnimalType.setVisible(true);
                readTableAnimalType();                
            } else {
                JOptionPane.showMessageDialog(viewAnimalType, "Animal type failed to change");
            }
        }
    }

    private class refreshAnimalTypeListener implements ActionListener {

        public refreshAnimalTypeListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingAnimal.setVisible(false);
            viewAccount.setVisible(false);
            viewAnimalType.setVisible(true);
            readTableAnimalType();
        }
    }
    //</editor-fold>

}
