/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author User
 */
public class tambah extends javax.swing.JFrame {

    public tambah() {
        initComponents();

        menu.setBackground(new Color(0, 0, 0, 40));
        button.setBackground(new Color(0, 0, 0, 40));
        entryData.setBackground(new Color(0, 0, 0, 40));
    }

    //<editor-fold defaultstate="collapsed" desc="ACTIONLISTENER BUTTON">
    public void rKambingListener(ActionListener a) {
        btnRKambing.addActionListener(a);
    }

    public void kalkulatorListener(ActionListener a) {
        btnKalkulator.addActionListener(a);
    }

    public void bantuanListener(ActionListener a) {
        btnBantuan.addActionListener(a);
    }

    public void keluarListener(ActionListener a) {
        btnKeluar.addActionListener(a);
    }

    public void tambahListener(ActionListener a) {
        btnTambah.addActionListener(a);
    }

    public void simpanListener(ActionListener a) {
        btnSimpan.addActionListener(a);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET TEXT">
    public String getNama() {
        return txtNama.getText();
    }

    public int getJenisKelamin() {
        return cmbJenisKelamin.getSelectedIndex();
    }

    public Date getTanggalLahir() {
        return (Date) txtTanggalLahir.getValue();
    }

    public String getJenisKambing() {
        return txtJenisKambing.getText();
    }

    public String getUsia() {
        return txtUsiaKambing.getValue().toString();
    }

    public String getJenisTelinga() {
        return txtJenisTelinga.getText();
    }

    public String getWarnaKepala() {
        return txtWarnaKepala.getText();
    }

    public String getWarnaBadan() {
        return txtWarnaBadan.getText();
    }

    public Float getPanjangTelinga() {
        return (Float) txtPanjangTelinga.getValue();
    }

    public Float getPanjangBadan() {
        return (Float) txtPanjangBadan.getValue();
    }

    public Float getLingkarDada() {
        return (Float) txtLingkarDada.getValue();
    }

    public Float getTinggi() {
        return (Float) txtTinggi.getValue();
    }

    public Float getBobot() {
        return (Float) txtBobot.getValue();
    }

    public String getLokasiKandang() {
        return txtLokasiKandang.getText();
    }

    public String getPenyakit() {
        return txtPanjangBadan.getText();
    }

    public String getKeterangan() {
        return txtKeterangan.getText();
    }

    public Date getTanggalKawin() {
        return (Date) txtTanggalKawin.getValue();
    }

    public Date getPerkiraanLahir() {
        return (Date) txtPerkiraanLahir.getValue();
    }

    public String getLaktasiKe() {
        return txtLaktasi.getValue().toString();
    }

    public String getProduksiSusu() {
        return txtProduksiSusu.getText();
    }

    public String getStatus() {
        return txtStatus.getText();
    }

    public String getPejantan() {
        return txtPejantan.getText();
    }

    public String getIndukan() {
        return txtIndukan.getText();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SET TEXT">
    public void setTxtBobot(String txtBobot) {
        this.txtBobot.setText(txtBobot);
    }

    public void setTxtIndukan(String txtIndukan) {
        this.txtIndukan.setText(txtIndukan);
    }

    public void setTxtJenisKambing(String txtJenisKambing) {
        this.txtJenisKambing.setText(txtJenisKambing);
    }

    public void setTxtJenisTelinga(String txtJenisTelinga) {
        this.txtJenisTelinga.setText(txtJenisTelinga);
    }

    public void setTxtKeterangan(String txtKeterangan) {
        this.txtKeterangan.setText(txtKeterangan);
    }

    public void setTxtLaktasi(String txtLaktasi) {
        this.txtLaktasi.setText(txtLaktasi);
    }

    public void setTxtLingkarDada(String txtLingkarDada) {
        this.txtLingkarDada.setText(txtLingkarDada);
    }

    public void setTxtLokasiKandang(String txtLokasiKandang) {
        this.txtLokasiKandang.setText(txtLokasiKandang);
    }

    public void setTxtNama(String txtNama) {
        this.txtNama.setText(txtNama);
    }

    public void setTxtPanjangBadan(String txtPanjangBadan) {
        this.txtPanjangBadan.setText(txtPanjangBadan);
    }

    public void setTxtPanjangTelinga(String txtPanjangTelinga) {
        this.txtPanjangTelinga.setText(txtPanjangTelinga);
    }

    public void setTxtPejantan(String txtPejantan) {
        this.txtPejantan.setText(txtPejantan);
    }

    public void setTxtPenyakit(String txtPenyakit) {
        this.txtPenyakit.setText(txtPenyakit);
    }

    public void setTxtPerkiraanLahir(String txtPerkiraanLahir) {
        this.txtPerkiraanLahir.setText(txtPerkiraanLahir);
    }

    public void setTxtProduksiSusu(String txtProduksiSusu) {
        this.txtProduksiSusu.setText(txtProduksiSusu);
    }

    public void setTxtStatus(String txtStatus) {
        this.txtStatus.setText(txtStatus);
    }

    public void setTxtTanggalKawin(String txtTanggalKawin) {
        this.txtTanggalKawin.setText(txtTanggalKawin);
    }

    public void setTxtTanggalLahir(String txtTanggalLahir) {
        this.txtTanggalLahir.setText(txtTanggalLahir);
    }

    public void setTxtTinggi(String txtTinggi) {
        this.txtTinggi.setText(txtTinggi);
    }

    public void setTxtUsiaKambing(String txtUsiaKambing) {
        this.txtUsiaKambing.setText(txtUsiaKambing);
    }

    public void setTxtWarnaBadan(String txtWarnaBadan) {
        this.txtWarnaBadan.setText(txtWarnaBadan);
    }

    public void setTxtWarnaKepala(String txtWarnaKepala) {
        this.txtWarnaKepala.setText(txtWarnaKepala);
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alas = new javax.swing.JPanel();
        subJudul1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jenisKelamin = new javax.swing.JLabel();
        tanggalLahir = new javax.swing.JLabel();
        txtTanggalLahir = new javax.swing.JFormattedTextField();
        jenisKambing = new javax.swing.JLabel();
        txtJenisKambing = new javax.swing.JTextField();
        usiaKambing = new javax.swing.JLabel();
        txtUsiaKambing = new javax.swing.JFormattedTextField();
        jenisTelinga = new javax.swing.JLabel();
        txtJenisTelinga = new javax.swing.JTextField();
        warnaKepala = new javax.swing.JLabel();
        txtWarnaKepala = new javax.swing.JTextField();
        warnaBadan = new javax.swing.JLabel();
        txtWarnaBadan = new javax.swing.JTextField();
        panjangTelinga = new javax.swing.JLabel();
        txtPanjangTelinga = new javax.swing.JFormattedTextField();
        panjangBadan = new javax.swing.JLabel();
        txtPanjangBadan = new javax.swing.JFormattedTextField();
        lingkarDada = new javax.swing.JLabel();
        txtLingkarDada = new javax.swing.JFormattedTextField();
        tinggi = new javax.swing.JLabel();
        txtTinggi = new javax.swing.JFormattedTextField();
        bobot = new javax.swing.JLabel();
        txtBobot = new javax.swing.JFormattedTextField();
        lokasiKandang = new javax.swing.JLabel();
        txtLokasiKandang = new javax.swing.JTextField();
        penyakit = new javax.swing.JLabel();
        txtPenyakit = new javax.swing.JTextField();
        keterangan = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        subJudul2 = new javax.swing.JLabel();
        tanggalKawin = new javax.swing.JLabel();
        txtTanggalKawin = new javax.swing.JFormattedTextField();
        perkiraanLahir = new javax.swing.JLabel();
        txtPerkiraanLahir = new javax.swing.JFormattedTextField();
        laktasiKe = new javax.swing.JLabel();
        produksiSusu = new javax.swing.JLabel();
        txtProduksiSusu = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        subJudul3 = new javax.swing.JLabel();
        pejantan = new javax.swing.JLabel();
        txtPejantan = new javax.swing.JTextField();
        indukan = new javax.swing.JLabel();
        txtIndukan = new javax.swing.JTextField();
        judul = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnBantuan = new javax.swing.JButton();
        btnKalkulator = new javax.swing.JButton();
        btnRKambing = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        button = new javax.swing.JPanel();
        cmbJenisKelamin = new javax.swing.JComboBox<>();
        entryData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLaktasi = new javax.swing.JFormattedTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1170, 660));
        setResizable(false);

        alas.setPreferredSize(new java.awt.Dimension(1176, 660));
        alas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subJudul1.setBackground(new java.awt.Color(153, 153, 255));
        subJudul1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subJudul1.setForeground(new java.awt.Color(255, 255, 255));
        subJudul1.setText("Entry Data Kambing");
        subJudul1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subJudul1.setOpaque(true);
        alas.add(subJudul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 300, -1));

        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("Nama");
        nama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        txtNama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 210, -1));

        jenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
        jenisKelamin.setText("Jenis Kelamin");
        jenisKelamin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(jenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        tanggalLahir.setForeground(new java.awt.Color(255, 255, 255));
        tanggalLahir.setText("Tanggal Lahir");
        tanggalLahir.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(tanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        txtTanggalLahir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTanggalLahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtTanggalLahir.setToolTipText("");
        alas.add(txtTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 120, -1));

        jenisKambing.setForeground(new java.awt.Color(255, 255, 255));
        jenisKambing.setText("Jenis Kambing");
        jenisKambing.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(jenisKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        txtJenisKambing.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alas.add(txtJenisKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, -1));

        usiaKambing.setForeground(new java.awt.Color(255, 255, 255));
        usiaKambing.setText("Usia Kambing");
        usiaKambing.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(usiaKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        txtUsiaKambing.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsiaKambing.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtUsiaKambing.setToolTipText("");
        alas.add(txtUsiaKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, -1));

        jenisTelinga.setForeground(new java.awt.Color(255, 255, 255));
        jenisTelinga.setText("Jenis Telinga");
        jenisTelinga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(jenisTelinga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        txtJenisTelinga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtJenisTelinga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtJenisTelinga, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 210, -1));

        warnaKepala.setForeground(new java.awt.Color(255, 255, 255));
        warnaKepala.setText("Warna Kepala");
        warnaKepala.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(warnaKepala, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        txtWarnaKepala.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtWarnaKepala.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtWarnaKepala, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, -1));

        warnaBadan.setForeground(new java.awt.Color(255, 255, 255));
        warnaBadan.setText("Warna Badan");
        warnaBadan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(warnaBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        txtWarnaBadan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtWarnaBadan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtWarnaBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 210, -1));

        panjangTelinga.setForeground(new java.awt.Color(255, 255, 255));
        panjangTelinga.setText("Panjang Telinga");
        panjangTelinga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(panjangTelinga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        txtPanjangTelinga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPanjangTelinga.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        alas.add(txtPanjangTelinga, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 120, -1));

        panjangBadan.setForeground(new java.awt.Color(255, 255, 255));
        panjangBadan.setText("Panjang Badan");
        panjangBadan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(panjangBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        txtPanjangBadan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPanjangBadan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        alas.add(txtPanjangBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 110, -1));

        lingkarDada.setForeground(new java.awt.Color(255, 255, 255));
        lingkarDada.setText("Lingkar Dada");
        lingkarDada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(lingkarDada, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        txtLingkarDada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLingkarDada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        alas.add(txtLingkarDada, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 110, -1));

        tinggi.setForeground(new java.awt.Color(255, 255, 255));
        tinggi.setText("Tinggi");
        tinggi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(tinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        txtTinggi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTinggi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        alas.add(txtTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 110, -1));

        bobot.setForeground(new java.awt.Color(255, 255, 255));
        bobot.setText("Bobot");
        bobot.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(bobot, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        txtBobot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBobot.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        alas.add(txtBobot, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 110, -1));

        lokasiKandang.setForeground(new java.awt.Color(255, 255, 255));
        lokasiKandang.setText("Lokasi Kandang");
        lokasiKandang.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(lokasiKandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        txtLokasiKandang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLokasiKandang.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtLokasiKandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 210, -1));

        penyakit.setForeground(new java.awt.Color(255, 255, 255));
        penyakit.setText("Penyakit");
        penyakit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        txtPenyakit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPenyakit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 210, -1));

        keterangan.setForeground(new java.awt.Color(255, 255, 255));
        keterangan.setText("Keterangan");
        keterangan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        txtKeterangan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtKeterangan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 210, -1));

        subJudul2.setBackground(new java.awt.Color(153, 153, 255));
        subJudul2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subJudul2.setForeground(new java.awt.Color(255, 255, 255));
        subJudul2.setText("Entry Data Khusus Kambing Betina");
        subJudul2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subJudul2.setOpaque(true);
        alas.add(subJudul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, -1, -1));

        tanggalKawin.setForeground(new java.awt.Color(255, 255, 255));
        tanggalKawin.setText("Tanggal Kawin");
        tanggalKawin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(tanggalKawin, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, -1));

        txtTanggalKawin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTanggalKawin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtTanggalKawin.setToolTipText("");
        alas.add(txtTanggalKawin, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 100, 20));

        perkiraanLahir.setForeground(new java.awt.Color(255, 255, 255));
        perkiraanLahir.setText("Perkiraan Lahir");
        perkiraanLahir.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(perkiraanLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        txtPerkiraanLahir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPerkiraanLahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtPerkiraanLahir.setToolTipText("");
        alas.add(txtPerkiraanLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 100, -1));

        laktasiKe.setForeground(new java.awt.Color(255, 255, 255));
        laktasiKe.setText("Laktasi Ke");
        laktasiKe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(laktasiKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, -1, -1));

        produksiSusu.setForeground(new java.awt.Color(255, 255, 255));
        produksiSusu.setText("Produksi Susu");
        produksiSusu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(produksiSusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        txtProduksiSusu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProduksiSusu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtProduksiSusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 210, -1));

        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        txtStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 210, -1));

        subJudul3.setBackground(new java.awt.Color(153, 153, 255));
        subJudul3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subJudul3.setForeground(new java.awt.Color(255, 255, 255));
        subJudul3.setText("Silsilah Kambing");
        subJudul3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subJudul3.setOpaque(true);
        alas.add(subJudul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 300, -1));

        pejantan.setForeground(new java.awt.Color(255, 255, 255));
        pejantan.setText("Pejantan");
        pejantan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(pejantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, -1));

        txtPejantan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPejantan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtPejantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 210, -1));

        indukan.setForeground(new java.awt.Color(255, 255, 255));
        indukan.setText("Indukan");
        indukan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(indukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        txtIndukan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtIndukan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alas.add(txtIndukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 210, -1));

        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("SISTEM INFORMASI PENITIPAN HEWAN TERNAK");
        judul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alas.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/exit.png"))); // NOI18N
        btnKeluar.setContentAreaFilled(false);
        alas.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 155, 70));

        btnBantuan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBantuan.setForeground(new java.awt.Color(255, 255, 255));
        btnBantuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/help.png"))); // NOI18N
        btnBantuan.setText("Bantuan");
        btnBantuan.setContentAreaFilled(false);
        btnBantuan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBantuan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alas.add(btnBantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 155, -1));

        btnKalkulator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKalkulator.setForeground(new java.awt.Color(255, 255, 255));
        btnKalkulator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/kalkulator.png"))); // NOI18N
        btnKalkulator.setText("Kalkulator");
        btnKalkulator.setContentAreaFilled(false);
        btnKalkulator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKalkulator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alas.add(btnKalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 155, -1));

        btnRKambing.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRKambing.setForeground(new java.awt.Color(255, 255, 255));
        btnRKambing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/kambing.png"))); // NOI18N
        btnRKambing.setText("Recording Kambing");
        btnRKambing.setContentAreaFilled(false);
        btnRKambing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRKambing.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alas.add(btnRKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, -1));

        menu.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        alas.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 460));

        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/tambah.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setContentAreaFilled(false);
        alas.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 120, -1));

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setContentAreaFilled(false);
        alas.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 120, -1));

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setContentAreaFilled(false);
        alas.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 120, -1));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/Save.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setContentAreaFilled(false);
        alas.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 120, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setContentAreaFilled(false);
        alas.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 120, -1));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/Print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setContentAreaFilled(false);
        alas.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 120, -1));

        button.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        alas.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 770, 38));

        cmbJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Jantan", "Betina" }));
        cmbJenisKelamin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alas.add(cmbJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 227, -1, -1));

        entryData.setBackground(new java.awt.Color(153, 153, 153));
        entryData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("31/12/1999");
        entryData.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 115, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bulan");
        entryData.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cm");
        entryData.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 85, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cm");
        entryData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cm");
        entryData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cm");
        entryData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 115, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kg");
        entryData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 145, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("31/12/1999");
        entryData.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 85, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("31/12/1999");
        entryData.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 115, -1, -1));
        entryData.add(txtLaktasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 100, -1));

        alas.add(entryData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 980, 320));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/assets/background.jpg"))); // NOI18N
        alas.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alas;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bobot;
    private javax.swing.JButton btnBantuan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKalkulator;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRKambing;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JPanel button;
    private javax.swing.JComboBox<String> cmbJenisKelamin;
    private javax.swing.JPanel entryData;
    private javax.swing.JLabel indukan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jenisKambing;
    private javax.swing.JLabel jenisKelamin;
    private javax.swing.JLabel jenisTelinga;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel laktasiKe;
    private javax.swing.JLabel lingkarDada;
    private javax.swing.JLabel lokasiKandang;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel panjangBadan;
    private javax.swing.JLabel panjangTelinga;
    private javax.swing.JLabel pejantan;
    private javax.swing.JLabel penyakit;
    private javax.swing.JLabel perkiraanLahir;
    private javax.swing.JLabel produksiSusu;
    private javax.swing.JLabel status;
    private javax.swing.JLabel subJudul1;
    private javax.swing.JLabel subJudul2;
    private javax.swing.JLabel subJudul3;
    private javax.swing.JLabel tanggalKawin;
    private javax.swing.JLabel tanggalLahir;
    private javax.swing.JLabel tinggi;
    private javax.swing.JFormattedTextField txtBobot;
    private javax.swing.JTextField txtIndukan;
    private javax.swing.JTextField txtJenisKambing;
    private javax.swing.JTextField txtJenisTelinga;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JFormattedTextField txtLaktasi;
    private javax.swing.JFormattedTextField txtLingkarDada;
    private javax.swing.JTextField txtLokasiKandang;
    private javax.swing.JTextField txtNama;
    private javax.swing.JFormattedTextField txtPanjangBadan;
    private javax.swing.JFormattedTextField txtPanjangTelinga;
    private javax.swing.JTextField txtPejantan;
    private javax.swing.JTextField txtPenyakit;
    private javax.swing.JFormattedTextField txtPerkiraanLahir;
    private javax.swing.JTextField txtProduksiSusu;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JFormattedTextField txtTanggalKawin;
    private javax.swing.JFormattedTextField txtTanggalLahir;
    private javax.swing.JFormattedTextField txtTinggi;
    private javax.swing.JFormattedTextField txtUsiaKambing;
    private javax.swing.JTextField txtWarnaBadan;
    private javax.swing.JTextField txtWarnaKepala;
    private javax.swing.JLabel usiaKambing;
    private javax.swing.JLabel warnaBadan;
    private javax.swing.JLabel warnaKepala;
    // End of variables declaration//GEN-END:variables
}
