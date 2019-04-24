/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.profil_customer;
import view.animalCare_customer;

/**
 *
 * @author MaulanaKevinPradana
 */
public class customer {

    private final profil_customer viewProfil;
    private final animalCare_customer viewAnimalCare;

    public customer() {
        viewProfil = new profil_customer();
        viewProfil.profilListener(new profilListener());
        viewProfil.animalCareListener(new animalCareLisener());
        viewProfil.updateListener(new updateListener());
        viewProfil.logoutListener(new logout(viewProfil));

        viewAnimalCare = new animalCare_customer();
        viewAnimalCare.setVisible(true);
        viewAnimalCare.profilListener(new profilListener());
        viewAnimalCare.animalCareListener(new animalCareLisener());
        viewAnimalCare.logoutListener(new logout(viewAnimalCare));
    }

    //<editor-fold defaultstate="collapse" desc="Profil">
    private class profilListener implements ActionListener {

        public profilListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewProfil.setVisible(true);
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
    
    private class animalCareLisener implements ActionListener {

        public animalCareLisener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewAnimalCare.setVisible(true);
            viewProfil.setVisible(false);
        }
    }
}
