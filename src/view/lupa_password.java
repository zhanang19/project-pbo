/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author MaulanaKevinPradana
 */
public class lupa_password extends javax.swing.JFrame {

    /**
     * Creates new form lupa_password
     */
    public lupa_password() {
        initComponents();
        form.setBackground(new Color(0, 0, 0, 40));
    }

    // <editor-fold defaultstate="collapsed" desc="Action Listener">
    public void sendListener(ActionListener a) {
        btnSend.addActionListener(a);
    }

    public void exitListener(ActionListener a) {
        btnExit.addActionListener(a);
    }
    
    public void backListener(ActionListener a) {
        btnBack.addActionListener(a);
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
        title = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel.setBackground(new java.awt.Color(102, 102, 102));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("gombing.id");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        form.setBackground(new java.awt.Color(102, 102, 102));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("E-Mail");
        form.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        form.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 209, 27));

        btnSend.setText("Kirim");
        btnSend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        form.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 209, -1));

        jPanel.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 190));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_close_window_30px.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_back_64px.png"))); // NOI18N
        btnBack.setContentAreaFilled(false);
        jPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/bg-login.jpg"))); // NOI18N
        jPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 320));

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
            java.util.logging.Logger.getLogger(lupa_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lupa_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lupa_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lupa_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lupa_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSend;
    private javax.swing.JPanel form;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
