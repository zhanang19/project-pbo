/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.v_profil_nurse;
import view.v_recordingAnimal_nurse;
import view.v_animalCare_nurse;
import model.m_animal_care;
import model.m_recording_animal;
import view.v_calculator;

/**
 *
 * @author MaulanaKevinPradana
 */
public class nurse {

    private final v_profil_nurse viewProfil;
    private final v_animalCare_nurse viewAnimalCare;
    private final v_recordingAnimal_nurse viewRecordingAnimal;
    private final v_calculator viewCalculator;
    private final m_recording_animal modelAnimal;
    private final m_animal_care modelAnimalCare;

    public nurse() {
        viewProfil = new v_profil_nurse();
        viewProfil.profilListener(new profilListener());
        viewProfil.rAnimalListener(new rAnimalListener());
        viewProfil.animalCareListener(new animalCareListener());
        viewProfil.calculatorListener(new calculatorListener());
        viewProfil.updateListener(new updateListener());
        viewProfil.logoutListener(new logout(viewProfil));

        viewAnimalCare = new v_animalCare_nurse();
        viewAnimalCare.setVisible(true);
        viewAnimalCare.profilListener(new profilListener());
        viewAnimalCare.rAnimalListener(new rAnimalListener());
        viewAnimalCare.animalCareListener(new animalCareListener());
        viewAnimalCare.calculatorListener(new calculatorListener());
        viewAnimalCare.logoutListener(new logout(viewAnimalCare));

        viewRecordingAnimal = new v_recordingAnimal_nurse();
        viewRecordingAnimal.profilListener(new profilListener());
        viewRecordingAnimal.rAnimalListener(new rAnimalListener());
        viewRecordingAnimal.animalCareListener(new animalCareListener());
        viewRecordingAnimal.calculatorListener(new calculatorListener());
        viewRecordingAnimal.logoutListener(new logout(viewRecordingAnimal));
        viewRecordingAnimal.addListener(new addRecordListener());
        viewRecordingAnimal.deleteListener(new deleteRecordListener());
        viewRecordingAnimal.updateListener(new updateRecordListener());
        viewRecordingAnimal.refreshListener(new refreshRecordListener());
        
        
        viewCalculator = new v_calculator();
        viewCalculator.rAnimalListener(new rAnimalListener());
        viewCalculator.profilListener(new profilListener());
        viewCalculator.animalCareListener(new animalCareListener());
        viewCalculator.calculatorListener(new calculatorListener());
        viewCalculator.logoutListener(new logout(viewCalculator));
        viewCalculator.countListener(new countListener());

        modelAnimal = new m_recording_animal();
        readTableRecordingAnimal();
        
        modelAnimalCare = new m_animal_care();
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
            viewCalculator.setVisible(false);
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
            viewCalculator.setVisible(false);
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
    private class animalCareListener implements ActionListener {

        public animalCareListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(false);
            viewRecordingAnimal.setVisible(false);
            viewAnimalCare.setVisible(true);
            viewCalculator.setVisible(false);
        }
    }

    private void readTablAnimalCare() {
        viewAnimalCare.setTabel(modelAnimalCare.readTable_animalCare());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapse" desc="Calculator">
    private class calculatorListener implements ActionListener {

        public calculatorListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(false);
            viewRecordingAnimal.setVisible(false);
            viewAnimalCare.setVisible(false);
            viewCalculator.setVisible(true);
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
}
