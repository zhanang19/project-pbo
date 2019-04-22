/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public calculator() {
        initComponents();
                        
        menu.setBackground(new Color(0, 0, 0, 40));
        kalkulator.setBackground(new Color(0, 0, 0, 40));
        hasil.setBackground(new Color(0, 0, 0, 40));
    }

    //<editor-fold defaultstate="collapse" desc="ACTION LISTENER">
    public void accountListener(ActionListener a) {
        btnAccount.addActionListener(a);
    }

    public void rAnimalListener(ActionListener a) {
        btnRAnimal.addActionListener(a);
    }

    public void tAnimalListener(ActionListener a) {
        btnTAnimal.addActionListener(a);
    }

    public void calculatorListener(ActionListener a) {
        btnCalculator.addActionListener(a);
    }

    public void logoutListener(ActionListener a) {
        btnLogout.addActionListener(a);
    }
        public void hitungListener(ActionListener a){
        btnHitung.addActionListener(a);
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapse" desc="GET">
    public String getJenisKelamin(){
        return cmbJK.getSelectedItem().toString();
    }
    
    public String getUsia(){
        return txtUsia.getText();
    }
    
    public String getLD(){
        return txtLD.getText();
    }
    
    public String getPB(){
        return txtPB.getText();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapse" desc="SET">    
    public void setPesan(String pesan) {
        this.pesan.setText(pesan);
    }

    public void setTxtHarga(String txtHarga) {
        this.txtHarga.setText(txtHarga);
    }

    public void setTxtJudulHasil(String txtJudulHasil) {
        this.txtJudulHasil.setText(txtJudulHasil);
    }

    public void setTxtBB(String txtLD) {
        this.txtBB.setText(txtLD);
    }
    
    public void setBgJudulHasil(Color a){        
        this.txtJudulHasil.setBackground(a);
    }
    
    public void setBgBB(Color a){        
        this.txtBB.setBackground(a);
    }
    
    public void setBgHarga(Color a){        
        this.txtHarga.setBackground(a);
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

        jPanel = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        kalkulator = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbJK = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLD = new javax.swing.JFormattedTextField();
        txtPB = new javax.swing.JFormattedTextField();
        txtUsia = new javax.swing.JFormattedTextField();
        btnHitung = new javax.swing.JButton();
        pesan = new javax.swing.JLabel();
        hasil = new javax.swing.JPanel();
        txtJudulHasil = new javax.swing.JLabel();
        txtBB = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();
        btnAccount = new javax.swing.JButton();
        btnRAnimal = new javax.swing.JButton();
        btnTAnimal = new javax.swing.JButton();
        btnCalculator = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("SISTEM INFORMASI PENITIPAN HEWAN TERNAK");
        judul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        kalkulator.setBackground(new java.awt.Color(153, 153, 153));
        kalkulator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lingkar Dada");
        kalkulator.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("cm");
        kalkulator.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 10));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tahun");
        kalkulator.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 10));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usia");
        kalkulator.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cm");
        kalkulator.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 10));

        cmbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Jantan", "Betina" }));
        kalkulator.add(cmbJK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jenis Kelamin");
        kalkulator.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Panjang Badan");
        kalkulator.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        kalkulator.add(txtLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 39, -1));
        kalkulator.add(txtPB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 37, -1));
        kalkulator.add(txtUsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 38, -1));

        btnHitung.setText("Hitung");
        kalkulator.add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 190, 200, -1));

        jPanel.add(kalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 260, 250));

        pesan.setForeground(new java.awt.Color(204, 0, 0));
        jPanel.add(pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 230, 20));

        hasil.setBackground(new java.awt.Color(153, 153, 153));

        txtJudulHasil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtJudulHasil.setForeground(new java.awt.Color(255, 255, 255));
        txtJudulHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtBB.setForeground(new java.awt.Color(255, 255, 255));

        txtHarga.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout hasilLayout = new javax.swing.GroupLayout(hasil);
        hasil.setLayout(hasilLayout);
        hasilLayout.setHorizontalGroup(
            hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hasilLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtJudulHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(hasilLayout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hasilLayout.setVerticalGroup(
            hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hasilLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtJudulHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(txtBB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 460, 150));

        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_crowd_50px.png"))); // NOI18N
        btnAccount.setText("Account");
        btnAccount.setContentAreaFilled(false);
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 80));

        btnRAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnRAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px.png"))); // NOI18N
        btnRAnimal.setText("Recording Animal");
        btnRAnimal.setContentAreaFilled(false);
        btnRAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnRAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 155, 80));

        btnTAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnTAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px_1.png"))); // NOI18N
        btnTAnimal.setText("Type Animal");
        btnTAnimal.setContentAreaFilled(false);
        btnTAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnTAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 155, 80));

        btnCalculator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalculator.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_calculator_48px_1.png"))); // NOI18N
        btnCalculator.setText("Calculator");
        btnCalculator.setContentAreaFilled(false);
        btnCalculator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 155, 80));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_exit_32px_1.png"))); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.setContentAreaFilled(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 155, 60));

        menu.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 380));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/assets/background.jpg"))); // NOI18N
        jPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRAnimal;
    private javax.swing.JButton btnTAnimal;
    private javax.swing.JComboBox<String> cmbJK;
    private javax.swing.JPanel hasil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel kalkulator;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel pesan;
    private javax.swing.JLabel txtBB;
    private javax.swing.JLabel txtHarga;
    private javax.swing.JLabel txtJudulHasil;
    private javax.swing.JFormattedTextField txtLD;
    private javax.swing.JFormattedTextField txtPB;
    private javax.swing.JFormattedTextField txtUsia;
    // End of variables declaration//GEN-END:variables
}