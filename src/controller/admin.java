/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.recordingKambing;
import view.kalkulator;
import view.bantuan;
import view.tambah;
import view.login;
import model.m_recordingKambing;
import model.M_user;


/**
 *
 * @author ASUS
 */
public class admin {
    private login viewLogin;
    private recordingKambing viewRecordingKambing;
    private kalkulator viewKalkulator;
    private bantuan viewBantuan;
    private tambah viewTambah;
    private m_recordingKambing model;
    
    public admin() {        
        viewRecordingKambing = new recordingKambing();
        viewRecordingKambing.setVisible(true);
        viewRecordingKambing.rKambingListener(new rKambingListener());
        viewRecordingKambing.kalkulatorListener(new kalkulatorListener());
        viewRecordingKambing.bantuanListener(new bantuanListener());
        viewRecordingKambing.keluarListener(new keluarListener());
        viewRecordingKambing.tambahListener(new tambahListener());

        viewKalkulator = new kalkulator();
        viewKalkulator.rKambingListener(new rKambingListener());
        viewKalkulator.kalkulatorListener(new kalkulatorListener());
        viewKalkulator.bantuanListener(new bantuanListener());
        viewKalkulator.keluarListener(new keluarListener());
        viewKalkulator.tambahListener(new tambahListener());
        viewKalkulator.hitungListener(new hitungListener());

        viewBantuan = new bantuan();
        viewBantuan.rKambingListener(new rKambingListener());
        viewBantuan.kalkulatorListener(new kalkulatorListener());
        viewBantuan.bantuanListener(new bantuanListener());
        viewBantuan.keluarListener(new keluarListener());
        viewBantuan.tambahListener(new tambahListener());

        viewTambah = new tambah();
        viewTambah.rKambingListener(new rKambingListener());
        viewTambah.kalkulatorListener(new kalkulatorListener());
        viewTambah.bantuanListener(new bantuanListener());
        viewTambah.keluarListener(new keluarListener());
        viewTambah.tambahListener(new tambahListener());
        viewTambah.simpanListener(new simpanListener());
        
        model = new m_recordingKambing();
        bacaTabelRecord();
    }

    private void bacaTabelRecord() {
        viewRecordingKambing.setTabel(model.bacaTabel());
    }

    private class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (model.record(
                    viewTambah.getNama(),
                    viewTambah.getJenisKelamin(),
                    viewTambah.getTanggalLahir(),
                    viewTambah.getJenisKambing(),
                    viewTambah.getUsia(),
                    viewTambah.getJenisTelinga(),
                    viewTambah.getWarnaKepala(),
                    viewTambah.getWarnaBadan(),
                    viewTambah.getPanjangTelinga(),
                    viewTambah.getPanjangBadan(),
                    viewTambah.getLingkarDada(),
                    viewTambah.getTinggi(),
                    viewTambah.getBobot(),
                    viewTambah.getLokasiKandang(),
                    viewTambah.getPenyakit(),
                    viewTambah.getKeterangan(),
                    viewTambah.getTanggalKawin(),
                    viewTambah.getPerkiraanLahir(),
                    viewTambah.getLaktasiKe(),
                    viewTambah.getProduksiSusu(),
                    viewTambah.getStatus(),
                    viewTambah.getPejantan(),
                    viewTambah.getIndukan()
            )) {
                JOptionPane.showMessageDialog(viewTambah, "Data Berhasil ditambahkan");
                viewRecordingKambing.setVisible(true);
                viewKalkulator.setVisible(false);
                viewBantuan.setVisible(false);
                viewTambah.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(viewTambah, "Gagal Menambahkan Data");
            }
        }
    }

    private class hitungListener implements ActionListener {

        public hitungListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (viewKalkulator.getPB().equals("") || viewKalkulator.getLD().equals("")
                    || viewKalkulator.getUsia().equals("") || viewKalkulator.getJenisKelamin().equals("")) {
                viewKalkulator.setPesan("LENGKAPI DATA!!!");
                viewKalkulator.setTxtJudulHasil("");
                viewKalkulator.setTxtBB("");
                viewKalkulator.setTxtHarga("");
            } else {
                viewKalkulator.setPesan("");
                viewKalkulator.setTxtJudulHasil("HASIL");

                float hasil = (2 * Float.parseFloat(viewKalkulator.getLD()) * Float.parseFloat(viewKalkulator.getPB())) / 104;
                viewKalkulator.setTxtBB("Berat Badan = " + String.valueOf(hasil));

                int harga;
                if (viewKalkulator.getJenisKelamin().equals("Jantan")) {
                    harga = (int) (hasil * 30000) + 200000;
                    viewKalkulator.setTxtHarga("Harga = Rp. " + harga);
                } else {
                    harga = (int) (hasil * 30000);
                    viewKalkulator.setTxtHarga("Harga = Rp. " + harga);
                }

            }
        }
    }

    private class rKambingListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingKambing.setVisible(true);
            viewKalkulator.setVisible(false);
            viewBantuan.setVisible(false);
            viewTambah.setVisible(false);
        }
    }

    private class kalkulatorListener implements ActionListener {

        public kalkulatorListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingKambing.setVisible(false);
            viewKalkulator.setVisible(true);
            viewBantuan.setVisible(false);
            viewTambah.setVisible(false);
        }
    }

    private class bantuanListener implements ActionListener {

        public bantuanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingKambing.setVisible(false);
            viewKalkulator.setVisible(false);
            viewBantuan.setVisible(true);
            viewTambah.setVisible(false);
        }
    }

    private class tambahListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewRecordingKambing.setVisible(false);
            viewKalkulator.setVisible(false);
            viewBantuan.setVisible(false);
            viewTambah.setVisible(true);
        }
    }

    private class keluarListener implements ActionListener {

        public keluarListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Program Berhenti");
            System.exit(0);
        }
    }
}
