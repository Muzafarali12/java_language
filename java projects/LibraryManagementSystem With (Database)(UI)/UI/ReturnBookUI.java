package com.test.librarymanagementsystem.UI;

import javax.swing.JOptionPane;

public class ReturnBookUI extends javax.swing.JFrame {

    private void loadIssuedBooksToTable() {
    com.test.librarymanagementsystem.dao.IssueToSudentDao dao = new com.test.librarymanagementsystem.daoImpl.IssueToStudentDAOImpl();
    java.util.List<com.test.librarymanagementsystem.model.IssueToSudent> list = dao.getAllIssuedBook();

    String[] columnNames = {"Student ID", "Name", "Roll Number", "Book ISBN"};
    Object[][] data = new Object[list.size()][4];

    for (int i = 0; i < list.size(); i++) {
        com.test.librarymanagementsystem.model.IssueToSudent issued = list.get(i);
        data[i][0] = issued.getStudentId();
        data[i][1] = issued.getStudentName();
        data[i][2] = issued.getRollNumber();
        data[i][3] = issued.getBookIsbn();
    }

    totalBookTable.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
}
    public ReturnBookUI() {
        initComponents();
        loadIssuedBooksToTable();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        headingLabel = new javax.swing.JLabel();
        studentIdLabel = new javax.swing.JLabel();
        bookIsbanLabel = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        bookIsbanTextField = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalBookTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headingLabel.setText("Return Book From Student");

        studentIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentIdLabel.setText("Student Id");

        bookIsbanLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookIsbanLabel.setText("Book Isban");

        returnButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        returnButton.setText("Return Book");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        totalBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student I'd", "Student Name", "Student Roll Number", "Book ISBAN"
            }
        ));
        jScrollPane3.setViewportView(totalBookTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(returnButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentIdLabel)
                                    .addComponent(bookIsbanLabel))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookIsbanTextField)
                                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(364, 364, 364))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(headingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(headingLabel)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIdLabel)
                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookIsbanLabel)
                    .addComponent(bookIsbanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(returnButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
try {
        int studentId = Integer.parseInt(studentIdTextField.getText().trim());
        String bookIsbn = bookIsbanTextField.getText().trim();

        if (bookIsbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book ISBN is required.");
            return;
        }

        com.test.librarymanagementsystem.model.ReturnBookInLibrary returnBook =
                new com.test.librarymanagementsystem.model.ReturnBookInLibrary(studentId, bookIsbn);

        com.test.librarymanagementsystem.dao.ReturnBookDAO returnBookDAO =
                new com.test.librarymanagementsystem.daoImpl.ReturnBookDAOImpl();
        returnBookDAO.returnBook(returnBook);

        JOptionPane.showMessageDialog(this, "Book returned successfully!");

        // ✅ Refresh the JTable after return
        loadIssuedBooksToTable();

        // ✅ Clear text fields
        studentIdTextField.setText("");
        bookIsbanTextField.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Student ID. Please enter a number.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookIsbanLabel;
    private javax.swing.JTextField bookIsbanTextField;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JTable totalBookTable;
    // End of variables declaration//GEN-END:variables
}
