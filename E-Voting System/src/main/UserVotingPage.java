package main;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UserVotingPage extends javax.swing.JFrame {

    public UserVotingPage() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loid = new javax.swing.JLabel();
        josh = new javax.swing.JLabel();
        jen = new javax.swing.JLabel();
        prof1 = new javax.swing.JButton();
        vote1 = new javax.swing.JButton();
        vote2 = new javax.swing.JButton();
        prof2 = new javax.swing.JButton();
        vote3 = new javax.swing.JButton();
        prof3 = new javax.swing.JButton();
        terms = new javax.swing.JCheckBox();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loid.setFont(new java.awt.Font("Hansief", 1, 10)); // NOI18N
        jPanel1.add(loid, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 40, 40));

        josh.setFont(new java.awt.Font("Hansief", 1, 10)); // NOI18N
        jPanel1.add(josh, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        jen.setFont(new java.awt.Font("Hansief", 1, 10)); // NOI18N
        jPanel1.add(jen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 50, 50));

        prof1.setBackground(new java.awt.Color(249, 248, 181));
        prof1.setFont(new java.awt.Font("Hansief", 0, 15)); // NOI18N
        prof1.setForeground(new java.awt.Color(0, 0, 0));
        prof1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_15px.png"))); // NOI18N
        prof1.setText("PROFILE");
        prof1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof1ActionPerformed(evt);
            }
        });
        jPanel1.add(prof1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 100, 30));

        vote1.setBackground(new java.awt.Color(204, 204, 204));
        vote1.setFont(new java.awt.Font("Hansief", 1, 20)); // NOI18N
        vote1.setForeground(new java.awt.Color(255, 0, 0));
        vote1.setText("VOTE");
        vote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote1ActionPerformed(evt);
            }
        });
        jPanel1.add(vote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 120, 40));

        vote2.setBackground(new java.awt.Color(204, 204, 204));
        vote2.setFont(new java.awt.Font("Hansief", 1, 20)); // NOI18N
        vote2.setForeground(new java.awt.Color(255, 0, 0));
        vote2.setText("VOTE");
        vote2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote2ActionPerformed(evt);
            }
        });
        jPanel1.add(vote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, 40));

        prof2.setBackground(new java.awt.Color(249, 248, 181));
        prof2.setFont(new java.awt.Font("Hansief", 0, 15)); // NOI18N
        prof2.setForeground(new java.awt.Color(0, 0, 0));
        prof2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_15px.png"))); // NOI18N
        prof2.setText("PROFILE");
        prof2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof2ActionPerformed(evt);
            }
        });
        jPanel1.add(prof2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 100, 30));

        vote3.setBackground(new java.awt.Color(204, 204, 204));
        vote3.setFont(new java.awt.Font("Hansief", 1, 20)); // NOI18N
        vote3.setForeground(new java.awt.Color(255, 0, 0));
        vote3.setText("VOTE");
        vote3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote3ActionPerformed(evt);
            }
        });
        jPanel1.add(vote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 120, 40));

        prof3.setBackground(new java.awt.Color(249, 248, 181));
        prof3.setFont(new java.awt.Font("Hansief", 0, 15)); // NOI18N
        prof3.setForeground(new java.awt.Color(0, 0, 0));
        prof3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_15px.png"))); // NOI18N
        prof3.setText("PROFILE");
        prof3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof3ActionPerformed(evt);
            }
        });
        jPanel1.add(prof3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 100, 30));

        terms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        terms.setForeground(new java.awt.Color(255, 255, 255));
        terms.setText("I Agree to the Terms and Conditions");
        terms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                termsMousePressed(evt);
            }
        });
        jPanel1.add(terms, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        close.setBackground(new java.awt.Color(117, 17, 27));
        close.setFont(new java.awt.Font("Akira Expanded", 1, 10)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_cancel_20px.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 100, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ui9.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

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
int votes = 0;
    private void vote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote1ActionPerformed
        ImageIcon votecon = new ImageIcon("src/imgs/checked.png");
        
        if(terms.isSelected()){
        int click = JOptionPane.showConfirmDialog(null, "<html><b style=\" color:red; \">Do you really want to vote JOSHUA ANDREY BANUELOS as a PRESIDENT?</b></html>", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
         if(click==0){
             JOptionPane.showMessageDialog(null, "<html><b style=\" color:green; font-size:10px; \">YOUR VOTE IS COUNTED THANK YOU FOR VOTING!!", "", JOptionPane.CLOSED_OPTION, votecon);
             votes++;
             josh.setText("TOTAL: "+ votes); 
             vote1.setVisible(false);
             vote2.setVisible(false);
             vote3.setVisible(false);
             
             
         }
        } else{
            ImageIcon spam = new ImageIcon("src/imgs/spam.png");
           JOptionPane.showMessageDialog(null, "<html><b style=\" color:RED; font-size:10px; \">PLEASE CHECK THE TERMS AND CONDITIONS BOX", "", JOptionPane.CLOSED_OPTION, spam);
        }
   
    }//GEN-LAST:event_vote1ActionPerformed

    private void prof1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof1ActionPerformed
       setVisible(true);
        new Prof1().setVisible(true);
       
    }//GEN-LAST:event_prof1ActionPerformed

    private void vote2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote2ActionPerformed
      ImageIcon votecon = new ImageIcon("src/imgs/checked.png");
        if(terms.isSelected()){
        int click = JOptionPane.showConfirmDialog(null, "<html><b style=\" color:red; \">Do you really want to vote JENNIE MAE PEÑONAL as a PRESIDENT?</b></html>", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
         if(click==0){
             JOptionPane.showMessageDialog(null, "<html><b style=\" color:green; font-size:10px; \">YOUR VOTE IS COUNTED THANK YOU FOR VOTING!!", "", JOptionPane.CLOSED_OPTION, votecon);
             votes++;
             jen.setText("TOTAL: "+ votes);
             vote1.setVisible(false);
             vote2.setVisible(false);
             vote3.setVisible(false);
             
         }
        } else{
            ImageIcon spam = new ImageIcon("src/imgs/spam.png");
           JOptionPane.showMessageDialog(null, "<html><b style=\" color:RED; font-size:10px; \">PLEASE CHECK THE TERMS AND CONDITIONS BOX", "", JOptionPane.CLOSED_OPTION, spam);
        }
    }//GEN-LAST:event_vote2ActionPerformed

    private void prof2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof2ActionPerformed
        setVisible(true);
        new Prof2().setVisible(true);
    }//GEN-LAST:event_prof2ActionPerformed
int count = 0;
    private void vote3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote3ActionPerformed
      ImageIcon votecon = new ImageIcon("src/imgs/checked.png");
       
      if(terms.isSelected()){
        int click = JOptionPane.showConfirmDialog(null, "<html><b style=\" color:red; \">Do you really want to vote LOID ANDRE ARINGOY as a PRESIDENT?</b></html>", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
         
        if(click==0){
            JOptionPane.showMessageDialog(null, "<html><b style=\" color:green; font-size:10px; \">YOUR VOTE IS COUNTED THANK YOU FOR VOTING!!", "", JOptionPane.CLOSED_OPTION, votecon);
             votes++;
             loid.setText("TOTAL: "+ votes);
             vote1.setVisible(false);
             vote2.setVisible(false);
             vote3.setVisible(false);
           
         }
      
        } else{
            ImageIcon spam = new ImageIcon("src/imgs/spam.png");
           JOptionPane.showMessageDialog(null, "<html><b style=\" color:RED; font-size:10px; \">PLEASE CHECK THE TERMS AND CONDITIONS BOX", "", JOptionPane.CLOSED_OPTION, spam);
        }
    }//GEN-LAST:event_vote3ActionPerformed

    private void prof3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof3ActionPerformed
       setVisible(true);
       new Prof3().setVisible(true);
    }//GEN-LAST:event_prof3ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:red; font-size:10px;\">Do you really want to close this application?", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(response==0)
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void termsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsMousePressed
        setVisible(true);
        new TermsCondition().setVisible(true);
    }//GEN-LAST:event_termsMousePressed

  
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
            java.util.logging.Logger.getLogger(UserVotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserVotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserVotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserVotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserVotingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jen;
    private javax.swing.JLabel josh;
    private javax.swing.JLabel loid;
    private javax.swing.JButton prof1;
    private javax.swing.JButton prof2;
    private javax.swing.JButton prof3;
    private javax.swing.JCheckBox terms;
    private javax.swing.JButton vote1;
    private javax.swing.JButton vote2;
    private javax.swing.JButton vote3;
    // End of variables declaration//GEN-END:variables
}
