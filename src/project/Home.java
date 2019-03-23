/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author User
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sapi = new javax.swing.JLabel();
        Kambing = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Hewan Ternak");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sapi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sapi.setForeground(new java.awt.Color(255, 255, 255));
        Sapi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sapi.setText("Sapi");
        Sapi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Sapi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SapiMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SapiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SapiMouseExited(evt);
            }
        });
        jPanel1.add(Sapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 0, 90, 200));

        Kambing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kambing.setForeground(new java.awt.Color(255, 255, 255));
        Kambing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kambing.setText("Kambing");
        Kambing.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Kambing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KambingMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KambingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KambingMouseExited(evt);
            }
        });
        jPanel1.add(Kambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/farm-animals.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(344, 256));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KambingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KambingMouseEntered
        // TODO add your handling code here:
        Kambing.setForeground(new Color(0, 70, 70));
        Kambing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_KambingMouseEntered

    private void KambingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KambingMouseExited
        // TODO add your handling code here:
        Kambing.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_KambingMouseExited

    private void KambingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KambingMousePressed
        // TODO add your handling code here:
        Kambing.setForeground(new Color(200, 200, 200));
        this.dispose();
        Kambing k = new Kambing();
        k.setVisible(true);
    }//GEN-LAST:event_KambingMousePressed

    private void SapiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SapiMouseEntered
        // TODO add your handling code here:
        Sapi.setForeground(new Color(0, 70, 70));
        Sapi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SapiMouseEntered

    private void SapiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SapiMouseExited
        // TODO add your handling code here:
        Sapi.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_SapiMouseExited

    private void SapiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SapiMousePressed
        // TODO add your handling code here:
        Sapi.setForeground(new Color(200, 200, 200));
        this.dispose();
        Sapi s = new Sapi();
        s.setVisible(true);
    }//GEN-LAST:event_SapiMousePressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kambing;
    private javax.swing.JLabel Sapi;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
