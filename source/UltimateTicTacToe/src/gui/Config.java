/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DBUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author Anupa Amawarni
 */
public class Config extends javax.swing.JFrame {

    public static String player1Name;
    public static String player2Name;

    /**
     * Creates new form MPConfig
     */
    public Config() {
        initComponents();
    }

    private void printDBErrorAndExit(Exception ex) {
        ex.printStackTrace();

        int res = JOptionPane.showConfirmDialog(
                rootPane,
                " Something Went Wrong with Database. \n Try to Restart the Tic-Tac-Toe Ultimate.",
                "Error in Database",
                JOptionPane.OK_OPTION
        );
        if (res == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
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
        jLabel1 = new javax.swing.JLabel();
        player1NameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        player2NameTF = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Tic Tac Toe ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        player1NameTF.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        player1NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1NameTFActionPerformed(evt);
            }
        });
        jPanel1.add(player1NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Player 1  :  ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Player 2   :  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        player2NameTF.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        player2NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2NameTFActionPerformed(evt);
            }
        });
        jPanel1.add(player2NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 220, -1));

        homeBtn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        homeBtn.setText("Menu");
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 335, 170, 40));

        playBtn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        playBtn.setText("Play");
        playBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        jPanel1.add(playBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void player1NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1NameTFActionPerformed
        String name1 = player1NameTF.getText();
        boolean matches = name1.matches("[a-z A-Z 0-9]{4,12}");
        if (matches) {
            player2NameTF.requestFocus();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Something Wrong in Player 1 Name.");
            player1NameTF.requestFocus();
            player1NameTF.selectAll();
        }
    }//GEN-LAST:event_player1NameTFActionPerformed

    private void player2NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2NameTFActionPerformed
        String name2 = player2NameTF.getText();
        boolean matches = name2.matches("[a-z A-Z 0-9]{4,12}");
        if (matches) {
            playBtn.doClick();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Something Wrong in Player 2 Name.");
            player2NameTF.requestFocus();
            player2NameTF.selectAll();
        }
    }//GEN-LAST:event_player2NameTFActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Menu home = new Menu();
        home.setTitle("Tic Tac Toe Ulimate ~ Home");
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        String name1 = player1NameTF.getText();
        String name2 = player2NameTF.getText();
        boolean matches1 = name1.matches("[a-z A-Z 0-9]{4,12}");
        boolean matches2 = name2.matches("[a-z A-Z 0-9]{4,12}");

        if (matches1) {
            if (matches2) {
                this.player1Name = name1;
                this.player2Name = name2;

                try {
                    String sql = "UPDATE gbState SET state = 0 WHERE board = 'gb';";
                    DBUtil.executeUpdate(sql);
                } catch (Exception ex) {
                    printDBErrorAndExit(ex);
                }

                GamePlay mpGamePlay = new GamePlay();
                mpGamePlay.setTitle("Tic Tac Toe Ulimate ~ MultiPlayer GamePlay");
                this.setVisible(false);
                mpGamePlay.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Something Wrong in Player 2 Name.");
                player2NameTF.requestFocus();
                player2NameTF.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Something Wrong in Player 1 Name.");
            player1NameTF.requestFocus();
            player1NameTF.selectAll();
        }
    }//GEN-LAST:event_playBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playBtn;
    private javax.swing.JTextField player1NameTF;
    private javax.swing.JTextField player2NameTF;
    // End of variables declaration//GEN-END:variables
}