/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.profil_manager;
import view.animalCare_manager;
import view.recordingAnimal_manager;
import model.M_recording_animal;
import model.M_animal_care;

/**
 *
 * @author MaulanaKevinPradana
 */
public class manager {

    private final profil_manager viewProfil;
    private final animalCare_manager viewAnimalCare;
    private final recordingAnimal_manager viewRecordingAnimal;
    private final M_recording_animal modelAnimal;
    private final M_animal_care modelAnimalCare;

    public manager() {
        viewProfil = new profil_manager();
        viewProfil.profilListener(new profilListener());
        viewProfil.rAnimalListener(new rAnimalListener());
        viewProfil.animalCareListener(new animalCareLisener());
        viewProfil.updateListener(new updateListener());
        viewProfil.logoutListener(new logout(viewProfil));

        viewAnimalCare = new animalCare_manager();
        viewAnimalCare.setVisible(true);
        viewAnimalCare.profilListener(new profilListener());
        viewAnimalCare.rAnimalListener(new rAnimalListener());
        viewAnimalCare.animalCareListener(new animalCareLisener());
        viewAnimalCare.logoutListener(new logout(viewAnimalCare));

        viewRecordingAnimal = new recordingAnimal_manager();
        viewRecordingAnimal.profilListener(new profilListener());
        viewRecordingAnimal.rAnimalListener(new rAnimalListener());
        viewRecordingAnimal.animalCareListener(new animalCareLisener());
        viewRecordingAnimal.logoutListener(new logout(viewRecordingAnimal));

        modelAnimal = new M_recording_animal();
        readTableRecordingAnimal();        
        
        modelAnimalCare = new M_animal_care();
        readTablAnimalCare();
    }
    
    //<editor-fold defaultstate="collapse" desc="Profil">
    private class profilListener implements ActionListener {

        public profilListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(true);
            viewRecordingAnimal.setVisible(false);
            viewAnimalCare.setVisible(false);
        }
    }

    private static class updateListener implements ActionListener {

        public updateListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapse" desc="Recording Animal">
    private class rAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(false);
            viewRecordingAnimal.setVisible(true);
            viewAnimalCare.setVisible(false);
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
    
    //<editor-fold defaultstate="collapse" desc="Animal Care">
    private class animalCareLisener implements ActionListener {

        public animalCareLisener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(false);
            viewRecordingAnimal.setVisible(false);
            viewAnimalCare.setVisible(true);
        }
    }
    
    private void readTablAnimalCare() {
        viewAnimalCare.setTabel(modelAnimalCare.readTable_animalCare());
    }
    //</editor-fold>
}
