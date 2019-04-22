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
public class recordingAnimal_admin extends javax.swing.JFrame {

    /**
     * Creates new form beranda
     */
    public recordingAnimal_admin() {
        initComponents();

        menu.setBackground(new Color(0, 0, 0, 40));
        button.setBackground(new Color(0, 0, 0, 40));
        form.setBackground(new Color(0, 0, 0, 40));
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

    public void addListener(ActionListener a) {
        btnAdd.addActionListener(a);
    }

    public void deleteListener(ActionListener a) {
        btnDelete.addActionListener(a);
    }

    public void updateListener(ActionListener a) {
        btnUpdate.addActionListener(a);
    }

    public void refreshListener(ActionListener a) {
        btnRefresh.addActionListener(a);
    }
    //</editor-fold>

    
    //<editor-fold defaultstate="collapse" desc="Tabel">
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
        btnAccount = new javax.swing.JButton();
        btnRAnimal = new javax.swing.JButton();
        btnTAnimal = new javax.swing.JButton();
        btnCalculator = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabelRecord = new javax.swing.JTable();
        button = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        animalType = new javax.swing.JLabel();
        cmbAnimalType = new javax.swing.JComboBox<>();
        gender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        birthdate = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        skinColor = new javax.swing.JLabel();
        txtSkinColor = new javax.swing.JTextField();
        earType = new javax.swing.JLabel();
        cmbEarType = new javax.swing.JComboBox<>();
        typePet = new javax.swing.JLabel();
        cmbTypePet = new javax.swing.JComboBox<>();
        form = new javax.swing.JPanel();
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

        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_crowd_50px.png"))); // NOI18N
        btnAccount.setText("Account");
        btnAccount.setContentAreaFilled(false);
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 80));

        btnRAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnRAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px.png"))); // NOI18N
        btnRAnimal.setText("Recording Animal");
        btnRAnimal.setContentAreaFilled(false);
        btnRAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnRAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 155, 80));

        btnTAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnTAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px_1.png"))); // NOI18N
        btnTAnimal.setText("Type Animal");
        btnTAnimal.setContentAreaFilled(false);
        btnTAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnTAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 155, 80));

        btnCalculator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalculator.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_calculator_48px_1.png"))); // NOI18N
        btnCalculator.setText("Calculator");
        btnCalculator.setContentAreaFilled(false);
        btnCalculator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 155, 80));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_exit_32px_1.png"))); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.setContentAreaFilled(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 155, 60));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/tambah.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setContentAreaFilled(false);
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 615, 120, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/hapus.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setContentAreaFilled(false);
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 615, 120, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setContentAreaFilled(false);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 615, 120, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setContentAreaFilled(false);
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 615, 120, -1));

        scroll.setAutoscrolls(true);

        tabelRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Animal Name", "Animal Type", "Gender", "Birthdate", "User", "Skin Color", "Ear Type", "Type Pet", "Updated at", "Created at"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelRecord.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabelRecord);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 970, 380));

        button.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 615, 480, 38));

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
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 210, -1));

        animalType.setForeground(new java.awt.Color(255, 255, 255));
        animalType.setText("Animal Type");
        animalType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        cmbAnimalType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Goat", "Cow" }));
        cmbAnimalType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cmbAnimalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 210, -1));

        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Male", "Female" }));
        cmbGender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 210, -1));

        birthdate.setForeground(new java.awt.Color(255, 255, 255));
        birthdate.setText("Birthdate");
        birthdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        txtBirthdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBirthdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 210, -1));

        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User");
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 210, -1));

        skinColor.setForeground(new java.awt.Color(255, 255, 255));
        skinColor.setText("Skin Color");
        skinColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(skinColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        txtSkinColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSkinColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtSkinColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 210, -1));

        earType.setForeground(new java.awt.Color(255, 255, 255));
        earType.setText("Ear Type");
        earType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(earType, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, -1));

        cmbEarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Big", "Small" }));
        cmbEarType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cmbEarType, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 210, -1));

        typePet.setForeground(new java.awt.Color(255, 255, 255));
        typePet.setText("Type Pet");
        typePet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        cmbTypePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Boer", "Etawa" }));
        cmbTypePet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cmbTypePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 210, -1));

        form.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 770, 160));

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
            java.util.logging.Logger.getLogger(recordingAnimal_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordingAnimal_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordingAnimal_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordingAnimal_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new recordingAnimal_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animalType;
    private javax.swing.JLabel background;
    private javax.swing.JLabel birthdate;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRAnimal;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTAnimal;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel button;
    private javax.swing.JComboBox<String> cmbAnimalType;
    private javax.swing.JComboBox<String> cmbEarType;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbTypePet;
    private javax.swing.JLabel earType;
    private javax.swing.JPanel form;
    private javax.swing.JLabel gender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel name;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel skinColor;
    private javax.swing.JTable tabelRecord;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSkinColor;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel typePet;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
