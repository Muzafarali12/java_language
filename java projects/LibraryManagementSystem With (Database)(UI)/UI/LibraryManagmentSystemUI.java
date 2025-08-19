package com.test.librarymanagementsystem.UI;

public class LibraryManagmentSystemUI extends javax.swing.JFrame {
 
    public LibraryManagmentSystemUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        callAddMethodButton = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        callIssueMethodButton = new javax.swing.JButton();
        callReturnMethodButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        callAddMethodButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        callAddMethodButton.setText("Add Book Into Library");
        callAddMethodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAddMethodButtonActionPerformed(evt);
            }
        });

        headingLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headingLabel.setText("Welcome To Library ManagmentSystem");

        callIssueMethodButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        callIssueMethodButton.setText("Issue Book To Student");
        callIssueMethodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callIssueMethodButtonActionPerformed(evt);
            }
        });

        callReturnMethodButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        callReturnMethodButton.setText("Return Book From Student");
        callReturnMethodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callReturnMethodButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(headingLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(callReturnMethodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(callAddMethodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(callIssueMethodButton)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(callAddMethodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(callIssueMethodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(callReturnMethodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void callAddMethodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAddMethodButtonActionPerformed
        new AddBookIntoLibraryUI().setVisible(true);
    }//GEN-LAST:event_callAddMethodButtonActionPerformed

    private void callIssueMethodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callIssueMethodButtonActionPerformed
        new IssueBookUI().setVisible(true);
    }//GEN-LAST:event_callIssueMethodButtonActionPerformed

    private void callReturnMethodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callReturnMethodButtonActionPerformed
        new ReturnBookUI().setVisible(true);
    }//GEN-LAST:event_callReturnMethodButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryManagmentSystemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton callAddMethodButton;
    private javax.swing.JButton callIssueMethodButton;
    private javax.swing.JButton callReturnMethodButton;
    private javax.swing.JLabel headingLabel;
    // End of variables declaration//GEN-END:variables
}
