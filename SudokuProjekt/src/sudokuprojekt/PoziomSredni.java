/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuprojekt;

import java.awt.Color;

/**
 *
 * @author user
 */
public class PoziomSredni extends javax.swing.JFrame {

    /**
     * Creates new form PoziomLatwy
     */
    public PoziomSredni() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(623, 402));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText("Poziom   Sredni");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 140, 240, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SredniPoziom.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 470, 140);

        jButton1.setText("System binarny");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed_Binarny(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 200, 140, 23);

        jButton2.setText("System Heksadycemalny");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed_Heksadecymalny(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 260, 180, 23);

        jButton3.setText("System Dziesiętny");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed_Dziesietny(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 200, 140, 23);

        jMenu1.setText("File");

        jMenuItem1.setText("Wybór Poziomu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Wyloguj się");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed_Dziesietny(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed_Dziesietny
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed_Dziesietny

    private void jButton2ActionPerformed_Heksadecymalny(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed_Heksadecymalny
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed_Heksadecymalny

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       WyborPoziomu frame2=new WyborPoziomu();
       frame2.setVisible(true);
       frame2.getContentPane().setBackground(new Color(219, 215, 217));
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       OknoLogowania frame2=new OknoLogowania();
       frame2.setVisible(true);
       frame2.getContentPane().setBackground(new Color(219, 215, 217));
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed_Binarny(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed_Binarny
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed_Binarny

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
            java.util.logging.Logger.getLogger(PoziomSredni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoziomSredni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoziomSredni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoziomSredni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoziomSredni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
