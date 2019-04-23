/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        panelFormLogin.setBackground(new Color(0, 0, 0, 40));
        panelDaftarLupaPass.setBackground(new Color(0, 0, 0, 40));
    }

    //<editor-fold defaultstate="collapsed" desc="ACTION LISTENER">
    public void loginListener(ActionListener a){
        btnLogin.addActionListener(a);
    }
    
    public void daftarListener(MouseListener a){
        txtDaftar.addMouseListener(a);
    }
    
    public void lupaPasswordListener(MouseListener a){
        txtLupaPassword.addMouseListener(a);
    }
    
    public void exitListener(ActionListener a){
        btnExit.addActionListener(a);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GET">
    public String getTxtPassword() {   
        return txtPassword.getText();
    }
    
    public String getTxtUsername() {    
        return txtUsername.getText();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SET">
    public void setTxtPassword(String txtPassword) {
        this.txtPassword.setText(txtPassword);
    }
    
    public void setTxtUsername(String txtUsername) {    
        this.txtUsername.setText(txtUsername);
    }
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtLupaPassword = new javax.swing.JLabel();
        txtDaftar = new javax.swing.JLabel();
        panelFormLogin = new javax.swing.JPanel();
        panelDaftarLupaPass = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(102, 102, 102));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("gombing.id");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        jPanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 84, -1, -1));

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 157, -1, -1));

        txtUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 104, 209, 27));

        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 180, 209, 27));

        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 230, 209, -1));

        txtLupaPassword.setForeground(new java.awt.Color(255, 255, 51));
        txtLupaPassword.setText("Lupa password?");
        txtLupaPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(txtLupaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 285, -1, -1));

        txtDaftar.setForeground(new java.awt.Color(255, 255, 51));
        txtDaftar.setText("Belum punya akun?");
        txtDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(txtDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 285, -1, -1));

        panelFormLogin.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelFormLoginLayout = new javax.swing.GroupLayout(panelFormLogin);
        panelFormLogin.setLayout(panelFormLoginLayout);
        panelFormLoginLayout.setHorizontalGroup(
            panelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelFormLoginLayout.setVerticalGroup(
            panelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel.add(panelFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 250, 200));

        panelDaftarLupaPass.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelDaftarLupaPassLayout = new javax.swing.GroupLayout(panelDaftarLupaPass);
        panelDaftarLupaPass.setLayout(panelDaftarLupaPassLayout);
        panelDaftarLupaPassLayout.setHorizontalGroup(
            panelDaftarLupaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelDaftarLupaPassLayout.setVerticalGroup(
            panelDaftarLupaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel.add(panelDaftarLupaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 25));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_close_window_30px.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 40));

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel panelDaftarLupaPass;
    private javax.swing.JPanel panelFormLogin;
    private javax.swing.JLabel password;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtDaftar;
    private javax.swing.JLabel txtLupaPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}