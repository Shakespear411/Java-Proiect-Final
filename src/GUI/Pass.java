/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Pass extends javax.swing.JFrame {

    /**
     * Creates new form Pass
     */
    public Pass() {
        initComponents();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFParola = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parola");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPFParola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFParolaActionPerformed(evt);
            }
        });
        getContentPane().add(jPFParola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, -1));

        jLabel1.setText("Parola:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPFParolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFParolaActionPerformed
        JPasswordField input = (JPasswordField) evt.getSource();
        char[] pass = input.getPassword();
        String p = new String(pass);
        if (p.equals(parola)) {
            JOptionPane.showMessageDialog(rootPane, "Corect","Parola corecta",1);
            passOK = parola;
            dispose();
           
        } else {
            JOptionPane.showMessageDialog(rootPane, "Incorect","Parola incorecta",0);
            dispose();
        }
        //System.out.println(passOK);
    }//GEN-LAST:event_jPFParolaActionPerformed

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
            java.util.logging.Logger.getLogger(Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pass().setVisible(true);
            }
        });
    }
    private String parola = "123456";
    public static String passOK;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPFParola;
    // End of variables declaration//GEN-END:variables
}
