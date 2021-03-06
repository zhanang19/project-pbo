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
public class v_registration extends javax.swing.JFrame {

    /**
     * Creates new form daftar
     */
    public v_registration() {
        initComponents();
        form.setBackground(new Color(0, 0, 0, 40));
    }

    // <editor-fold defaultstate="collapsed" desc="Action Listener">
    public void daftarListener(ActionListener a) {
        btnRegister.addActionListener(a);
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
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        form = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel.setBackground(new java.awt.Color(102, 102, 102));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/title.png"))); // NOI18N
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

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

        form.setBackground(new java.awt.Color(153, 153, 153));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        form.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 210, -1));

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        form.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-Mail");
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        form.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtName1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        form.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 210, -1));

        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        form.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, -1));

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        form.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnRegister.setText("Register Now");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        form.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 265, -1));

        jPanel.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 340, 170));

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
            java.util.logging.Logger.getLogger(v_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel email;
    private javax.swing.JPanel form;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    // End of variables declaration//GEN-END:variables
}
