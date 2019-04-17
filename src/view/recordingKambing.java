/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author User
 */
public class recordingKambing extends javax.swing.JFrame {

    /**
     * Creates new form beranda
     */
    public recordingKambing() {
        initComponents();

        menu.setBackground(new Color(0, 0, 0, 40));
        button.setBackground(new Color(0, 0, 0, 40));        

    }
    //<editor-fold defaultstate="collapse" desc="ACTION LISTENER">
    public void rKambingListener(ActionListener a) {
        btnRKambing.addActionListener(a);
    }

    public void keluarListener(ActionListener a) {
        btnKeluar.addActionListener(a);
    }

    public void tambahListener(ActionListener a) {
        btnTambah.addActionListener(a);
    }

    public void kalkulatorListener(ActionListener a) {
        btnKalkulator.addActionListener(a);
    }

    public void bantuanListener(ActionListener a) {
        btnBantuan.addActionListener(a);
    }

    public void setTabel(DefaultTableModel t) {
        tabelRecord.setModel(t);
    }

    public void tabelListener(MouseListener m) {
        tabelRecord.addMouseListener(m);
    }

    public int getBarisTerpilih() {
        return tabelRecord.getSelectedRow();
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

        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnBantuan = new javax.swing.JButton();
        btnKalkulator = new javax.swing.JButton();
        btnRKambing = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabelRecord = new javax.swing.JTable();
        button = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("SISTEM INFORMASI PENITIPAN HEWAN TERNAK");
        judul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/exit.png"))); // NOI18N
        btnKeluar.setContentAreaFilled(false);
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 155, 70));

        btnBantuan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBantuan.setForeground(new java.awt.Color(255, 255, 255));
        btnBantuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/help.png"))); // NOI18N
        btnBantuan.setText("Bantuan");
        btnBantuan.setContentAreaFilled(false);
        btnBantuan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBantuan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnBantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 155, -1));

        btnKalkulator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKalkulator.setForeground(new java.awt.Color(255, 255, 255));
        btnKalkulator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/kalkulator.png"))); // NOI18N
        btnKalkulator.setText("Kalkulator");
        btnKalkulator.setContentAreaFilled(false);
        btnKalkulator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKalkulator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnKalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 155, -1));

        btnRKambing.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRKambing.setForeground(new java.awt.Color(255, 255, 255));
        btnRKambing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/kambing.png"))); // NOI18N
        btnRKambing.setText("Recording Kambing");
        btnRKambing.setContentAreaFilled(false);
        btnRKambing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRKambing.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnRKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, -1));

        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/tambah.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setContentAreaFilled(false);
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 120, -1));

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setContentAreaFilled(false);
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 120, -1));

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setContentAreaFilled(false);
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 120, -1));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/Save.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setContentAreaFilled(false);
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 120, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setContentAreaFilled(false);
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 120, -1));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/Print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setContentAreaFilled(false);
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 120, -1));

        scroll.setAutoscrolls(true);

        tabelRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Jenis Kelamin", "Tanggal Lahir", "Jenis Kambing", "Usia", "Tinggi", "Bobot", "Lokasi Kandang", "Penyakit", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelRecord.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabelRecord);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 970, 490));

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

        jPanel1.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 770, 38));

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

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 460));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/assets/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(recordingKambing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordingKambing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordingKambing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordingKambing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordingKambing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel menu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabelRecord;
    // End of variables declaration//GEN-END:variables
}
