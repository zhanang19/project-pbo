/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author MaulanaKevinPradana
 */
public class profil_user extends javax.swing.JFrame {

    /**
     * Creates new form profil_user
     */
    public profil_user() {
        initComponents();
        menu.setBackground(new Color(0, 0, 0, 40));
        form.setBackground(new Color(0, 0, 0, 40));
        button.setBackground(new Color(0, 0, 0, 40));
    }

    // <editor-fold defaultstate="collapsed" desc="Action Listener">
    public void profilListener(ActionListener a) {
        btnProfil.addActionListener(a);
    }

    public void animalCareListener(ActionListener a) {
        btnAnimalCare.addActionListener(a);
    }

    public void logoutListener(ActionListener a) {
        btnLogout.addActionListener(a);
    }
        
    public void updateListener(ActionListener a) {
        btnUpdate.addActionListener(a);
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GET">
    public String getTxtAddress() {

        return txtAddress.getText();
    }

    public String getTxtComment() {
        return txtComment.getText();
    }

    public String getTxtEmail() {
        return txtEmail.getText();
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public String getTxtNumber() {
        return txtNumber.getText();
    }
    
    public String getTxtUsername() {    
        return txtUsername.getText();
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="SET">
    public void setTxtAddress(String txtAddress) {
        this.txtAddress.setText(txtAddress);
    }

    public void setTxtComment(String txtComment) {
        this.txtComment.setText(txtComment);
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail.setText(txtEmail);
    }

    public void setTxtName(String txtName) {
        this.txtName.setText(txtName);
    }

    public void setTxtNumber(String txtNumber) {
        this.txtNumber.setText(txtNumber);
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

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnProfil = new javax.swing.JButton();
        btnAnimalCare = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        comment = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        form = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        button = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("gombing.id");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 10, -1, -1));

        btnProfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfil.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_person_male_30px.png"))); // NOI18N
        btnProfil.setText("Profil");
        btnProfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 80));

        btnAnimalCare.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAnimalCare.setForeground(new java.awt.Color(255, 255, 255));
        btnAnimalCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px.png"))); // NOI18N
        btnAnimalCare.setText("Animal Care");
        btnAnimalCare.setContentAreaFilled(false);
        btnAnimalCare.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnimalCare.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnAnimalCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 155, 80));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_exit_32px_1.png"))); // NOI18N
        btnLogout.setText("Keluar");
        btnLogout.setContentAreaFilled(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 155, 60));

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

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 380));

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 210, -1));

        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        txtUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 210, -1));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 210, -1));

        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Address");
        address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        txtAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 210, -1));

        number.setForeground(new java.awt.Color(255, 255, 255));
        number.setText("Number Phone");
        number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        txtNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 210, -1));

        comment.setForeground(new java.awt.Color(255, 255, 255));
        comment.setText("Birthdate");
        comment.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(comment, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        txtComment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtComment.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 210, -1));

        form.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 770, 140));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setContentAreaFilled(false);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 120, -1));

        button.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 120, 38));

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
            java.util.logging.Logger.getLogger(profil_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profil_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profil_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profil_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profil_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Username;
    private javax.swing.JLabel address;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAnimalCare;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel button;
    private javax.swing.JLabel comment;
    private javax.swing.JLabel email;
    private javax.swing.JPanel form;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel name;
    private javax.swing.JLabel number;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
