/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MaulanaKevinPradana
 */
public class animal_type extends javax.swing.JFrame {

    /**
     * Creates new form type_pet
     */
    public animal_type() {
        initComponents();
        menu.setBackground(new Color(0, 0, 0, 40));
        button_typePet.setBackground(new Color(0, 0, 0, 40));
        form_typePet.setBackground(new Color(0, 0, 0, 40));
        button_animalType.setBackground(new Color(0, 0, 0, 40));
        form_animalType.setBackground(new Color(0, 0, 0, 40));
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

    public void addTypePetListener(ActionListener a) {
        btnAdd_typePet.addActionListener(a);
    }

    public void deleteTypePetListener(ActionListener a) {
        btnDelete_typePet.addActionListener(a);
    }

    public void updateTypePetListener(ActionListener a) {
        btnUpdate_typePet.addActionListener(a);
    }

    public void refreshTypePetListener(ActionListener a) {
        btnRefresh_typePet.addActionListener(a);
    }

    public void addAnimalTypeListener(ActionListener a) {
        btnAdd_animalType.addActionListener(a);
    }

    public void deleteAnimalTypeListener(ActionListener a) {
        btnDelete_animalType.addActionListener(a);
    }

    public void updateAnimalTypeListener(ActionListener a) {
        btnUpdate_animalType.addActionListener(a);
    }

    public void refreshAnimalTypeListener(ActionListener a) {
        btnRefresh_animalType.addActionListener(a);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="Tabel">
    public void setTabelTypePet(DefaultTableModel t) {
        tabelTypePet.setModel(t);
    }

    public void tabelTypePetListener(MouseListener m) {
        tabelTypePet.addMouseListener(m);
    }

    public int getBarisTerpilihTypePet() {
        return tabelTypePet.getSelectedRow();
    }
    public void setTabelAnimalType(DefaultTableModel t) {
        tabelAnimalType.setModel(t);
    }

    public void tabelAnimalTypeListener(MouseListener m) {
        tabelAnimalType.addMouseListener(m);
    }

    public int getBarisTerpilihAnimalType() {
        return tabelAnimalType.getSelectedRow();
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
        title = new javax.swing.JLabel();
        btnAccount = new javax.swing.JButton();
        btnRAnimal = new javax.swing.JButton();
        btnTAnimal = new javax.swing.JButton();
        btnCalculator = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd_typePet = new javax.swing.JButton();
        btnDelete_typePet = new javax.swing.JButton();
        btnUpdate_typePet = new javax.swing.JButton();
        btnRefresh_typePet = new javax.swing.JButton();
        button_typePet = new javax.swing.JPanel();
        btnAdd_animalType = new javax.swing.JButton();
        btnDelete_animalType = new javax.swing.JButton();
        btnUpdate_animalType = new javax.swing.JButton();
        btnRefresh_animalType = new javax.swing.JButton();
        button_animalType = new javax.swing.JPanel();
        scrollAnimalType = new javax.swing.JScrollPane();
        tabelAnimalType = new javax.swing.JTable();
        scrollTipePet = new javax.swing.JScrollPane();
        tabelTypePet = new javax.swing.JTable();
        menu = new javax.swing.JPanel();
        tipePet = new javax.swing.JLabel();
        txtTypePet = new javax.swing.JTextField();
        txtAnimalType = new javax.swing.JTextField();
        form_typePet = new javax.swing.JPanel();
        form_animalType = new javax.swing.JPanel();
        animalType = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("gombing.id");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 10, -1, -1));

        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_crowd_50px.png"))); // NOI18N
        btnAccount.setText("Akun");
        btnAccount.setContentAreaFilled(false);
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 155, 80));

        btnRAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnRAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px.png"))); // NOI18N
        btnRAnimal.setText("Rekam Hewan");
        btnRAnimal.setContentAreaFilled(false);
        btnRAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnRAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 155, 80));

        btnTAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnTAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_Pet_Commands_Summon_50px_1.png"))); // NOI18N
        btnTAnimal.setText("Tipe Hewan");
        btnTAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnTAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 155, 80));

        btnCalculator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalculator.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_calculator_48px_1.png"))); // NOI18N
        btnCalculator.setText("Kalkulator");
        btnCalculator.setContentAreaFilled(false);
        btnCalculator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 155, 80));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/icons8_exit_32px_1.png"))); // NOI18N
        btnLogout.setText("Keluar");
        btnLogout.setContentAreaFilled(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 155, 60));

        btnAdd_typePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd_typePet.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_typePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/tambah.png"))); // NOI18N
        btnAdd_typePet.setContentAreaFilled(false);
        jPanel1.add(btnAdd_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, -1));

        btnDelete_typePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete_typePet.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_typePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/hapus.png"))); // NOI18N
        btnDelete_typePet.setContentAreaFilled(false);
        jPanel1.add(btnDelete_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 50, -1));

        btnUpdate_typePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate_typePet.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate_typePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUpdate_typePet.setContentAreaFilled(false);
        jPanel1.add(btnUpdate_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 50, -1));

        btnRefresh_typePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh_typePet.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh_typePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/refresh.png"))); // NOI18N
        btnRefresh_typePet.setContentAreaFilled(false);
        jPanel1.add(btnRefresh_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, -1));

        button_typePet.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout button_typePetLayout = new javax.swing.GroupLayout(button_typePet);
        button_typePet.setLayout(button_typePetLayout);
        button_typePetLayout.setHorizontalGroup(
            button_typePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        button_typePetLayout.setVerticalGroup(
            button_typePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(button_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 200, 38));

        btnAdd_animalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd_animalType.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_animalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/tambah.png"))); // NOI18N
        btnAdd_animalType.setContentAreaFilled(false);
        jPanel1.add(btnAdd_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 50, -1));

        btnDelete_animalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete_animalType.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_animalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/hapus.png"))); // NOI18N
        btnDelete_animalType.setContentAreaFilled(false);
        jPanel1.add(btnDelete_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 50, -1));

        btnUpdate_animalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate_animalType.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate_animalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/edit.png"))); // NOI18N
        btnUpdate_animalType.setContentAreaFilled(false);
        jPanel1.add(btnUpdate_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 50, -1));

        btnRefresh_animalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh_animalType.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh_animalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/refresh.png"))); // NOI18N
        btnRefresh_animalType.setContentAreaFilled(false);
        jPanel1.add(btnRefresh_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 50, -1));

        button_animalType.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout button_animalTypeLayout = new javax.swing.GroupLayout(button_animalType);
        button_animalType.setLayout(button_animalTypeLayout);
        button_animalTypeLayout.setHorizontalGroup(
            button_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        button_animalTypeLayout.setVerticalGroup(
            button_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(button_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 200, 38));

        scrollAnimalType.setAutoscrolls(true);

        tabelAnimalType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Tipe Hewan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelAnimalType.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrollAnimalType.setViewportView(tabelAnimalType);

        jPanel1.add(scrollAnimalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 190, 380));

        scrollTipePet.setAutoscrolls(true);

        tabelTypePet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Tipe Gen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelTypePet.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrollTipePet.setViewportView(tabelTypePet);

        jPanel1.add(scrollTipePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 190, 380));

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

        tipePet.setForeground(new java.awt.Color(255, 255, 255));
        tipePet.setText("Tipe Gen");
        tipePet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(tipePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 70, -1, -1));

        txtTypePet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTypePet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtTypePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 160, -1));

        txtAnimalType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAnimalType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtAnimalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 160, -1));

        form_typePet.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout form_typePetLayout = new javax.swing.GroupLayout(form_typePet);
        form_typePet.setLayout(form_typePetLayout);
        form_typePetLayout.setHorizontalGroup(
            form_typePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        form_typePetLayout.setVerticalGroup(
            form_typePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(form_typePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 240, 40));

        form_animalType.setBackground(new java.awt.Color(153, 153, 153));

        animalType.setForeground(new java.awt.Color(255, 255, 255));
        animalType.setText("Tipe Hewan");
        animalType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout form_animalTypeLayout = new javax.swing.GroupLayout(form_animalType);
        form_animalType.setLayout(form_animalTypeLayout);
        form_animalTypeLayout.setHorizontalGroup(
            form_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_animalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        form_animalTypeLayout.setVerticalGroup(
            form_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_animalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalType)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(form_animalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 270, 40));

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
            java.util.logging.Logger.getLogger(animal_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(animal_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(animal_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(animal_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animal_type().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animalType;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAdd_animalType;
    private javax.swing.JButton btnAdd_typePet;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnDelete_animalType;
    private javax.swing.JButton btnDelete_typePet;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRAnimal;
    private javax.swing.JButton btnRefresh_animalType;
    private javax.swing.JButton btnRefresh_typePet;
    private javax.swing.JButton btnTAnimal;
    private javax.swing.JButton btnUpdate_animalType;
    private javax.swing.JButton btnUpdate_typePet;
    private javax.swing.JPanel button_animalType;
    private javax.swing.JPanel button_typePet;
    private javax.swing.JPanel form_animalType;
    private javax.swing.JPanel form_typePet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JScrollPane scrollAnimalType;
    private javax.swing.JScrollPane scrollTipePet;
    private javax.swing.JTable tabelAnimalType;
    private javax.swing.JTable tabelTypePet;
    private javax.swing.JLabel tipePet;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAnimalType;
    private javax.swing.JTextField txtTypePet;
    // End of variables declaration//GEN-END:variables
}
