/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GooGol;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author umarazif
 */
public class Googol_IO extends javax.swing.JFrame {

    ArrayList<Character> movement = new ArrayList<>();

    /**
     * Creates new form NewJFrame
     */
    public Googol_IO() {
        initComponents();
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        
        jTextArea1.setBorder(null);
        jTextArea1.setBackground(new java.awt.Color(0,0,0,0));
        
        jLabel3.setIcon(new javax.swing.ImageIcon("Googol IO Background.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -160, 750, 370);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));
        setMinimumSize(new java.awt.Dimension(749, 228));
        getContentPane().setLayout(null);

        jButton1.setText("0");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 172, 39, 21);

        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 172, 39, 21);

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("(000_111)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 96, 197, 70);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Product Sans", 0, 13)); // NOI18N
        jTextArea1.setForeground(java.awt.Color.white);
        jTextArea1.setRows(5);
        jTextArea1.setText("==========WELCOME TO GOOGOL.IO GAME==========\nTo win this game, YOU HAVE TO MOVE ALL THE ZERO TO THE 1 POSITION AND ALL THE 1 TO THE ZERO'S POSITION\nzero only can jump over a 1, and 1 only can jump over a zero. GOODLUCK!");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 6, 735, 113);

        jButton3.setText("New Game");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(94, 172, 83, 21);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -160, 750, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Button O
        try {
            int j = 0;
            int i;
            String current = jLabel1.getText();
            char[] space = new char[9];
            for (int k = 0; k < current.length(); k++) {
                space[k] = current.charAt(k);
            }
            while (j < space.length) {
                if (space[j] == '0') {
                    if (space[j + 1] == '0' || space[j + 1] == ')') {
                        j++;
                        movement.add('0');
                        continue;
                    } else if (space[j + 1] == '_') {
                        space[j] = '_';
                        space[j + 1] = '0';
                        movement.clear();
                        for (i = 0; i < space.length; i++) {
                            jLabel1.setText(jLabel1.getText() + Character.toString(space[i]));
                        }
                    } else if (space[j + 1] == '1') {
                        if (space[j + 2] == '1' || space[j + 2] == '0' || space[j + 2] == ')') {
                            j++;
                            movement.add('0');
                            continue;
                        } else if (space[j + 2] == '_') {
                            space[j + 2] = '0';
                            space[j] = '_';
                            movement.clear();
                            for (i = 0; i < space.length; i++) {
                                jLabel1.setText(jLabel1.getText() + space[i]);
                            }
                        }
                    }
                }
                j++;
            }
            String next = (jLabel1.getText());
            String disp = "";
            for (int k = 9; k < 18; k++) {
                disp = disp + next.charAt(k);
            }
            jLabel1.setText(disp);
            if (disp.equals("(111_000)")) {
                JOptionPane.showMessageDialog(rootPane, "You Win!");
                jButton3.doClick();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "You lost, start a new game");
            jButton3.doClick();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Button X
        try {
            int i;
            int j = 8;
            String current = jLabel1.getText();
            char[] space = new char[9];
            for (int k = 0; k < current.length(); k++) {
                space[k] = current.charAt(k);
            }
            while (j >= 0) {
                if (space[j] == '1') {
                    if (space[j - 1] == '1' || space[j - 1] == '(') {
                        j--;
                        movement.add('1');
                        continue;
                    } else if (space[j - 1] == '_') {
                        space[j] = '_';
                        space[j - 1] = '1';
                        movement.clear();
                        for (i = 0; i < space.length; i++) {
                            jLabel1.setText(jLabel1.getText() + space[i]);
                        }
                        System.out.println();
                    } else if (space[j - 1] == '0') {
                        if (space[j - 2] == '1' || space[j - 2] == '0' || space[j - 2] == '(') {
                            j--;
                            movement.add('1');
                            continue;
                        } else if (space[j - 2] == '_') {
                            space[j - 2] = '1';
                            space[j] = '_';
                            movement.clear();
                            for (i = 0; i < space.length; i++) {
                                jLabel1.setText(jLabel1.getText() + space[i]);
                            }
                            System.out.println();
                        }
                    }
                }
                j--;
            }
            String next = (jLabel1.getText());
            String disp = "";
            for (int k = 9; k < 18; k++) {
                disp = disp + next.charAt(k);
            }
            jLabel1.setText(disp);
            if (disp.equals("(111_000)")) {
                JOptionPane.showMessageDialog(rootPane, "You Win!");
                jButton3.doClick();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "You lost, start a new game");
            jButton3.doClick();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Button New Game
        jLabel1.setText("");
        char[] space = new char[9];
        int i;
        for (i = 0; i < 4; i++) {
            if (i == 0) {
                space[i] = '(';
                jLabel1.setText(jLabel1.getText() + "(");
            } else {
                space[i] = '0';
                jLabel1.setText(jLabel1.getText() + "0");
            }
        }
        space[4] = '_';
        jLabel1.setText(jLabel1.getText() + "_");
        i = i + 1;
        for (i = 5; i < 9; i++) {
            if (i == 8) {
                space[i] = ')';
                jLabel1.setText(jLabel1.getText() + ")");
            } else {
                space[i] = '1';
                jLabel1.setText(jLabel1.getText() + "1");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Googol_IO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Googol_IO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Googol_IO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Googol_IO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Googol_IO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
