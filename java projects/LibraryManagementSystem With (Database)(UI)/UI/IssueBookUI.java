package com.test.librarymanagementsystem.UI;

import com.test.librarymanagementsystem.dao.IssueToSudentDao;
import com.test.librarymanagementsystem.daoImpl.IssueToStudentDAOImpl;
import com.test.librarymanagementsystem.model.IssueToSudent;
import javax.swing.JOptionPane;


public class IssueBookUI extends javax.swing.JFrame {

       private void loadIssuedBooksIntoTable() {
    IssueToSudentDao issueDao = new IssueToStudentDAOImpl();
    java.util.List<IssueToSudent> issuedList = issueDao.getAllIssuedBook();

    String[] columnNames = {"Student ID", "Name", "Roll Number", "Book ISBN"};
    Object[][] rowData = new Object[issuedList.size()][4];

    for (int i = 0; i < issuedList.size(); i++) {
        IssueToSudent issue = issuedList.get(i);
        rowData[i][0] = issue.getStudentId();
        rowData[i][1] = issue.getStudentName();
        rowData[i][2] = issue.getRollNumber();
        rowData[i][3] = issue.getBookIsbn();
    }

    issueBookTable.setModel(new javax.swing.table.DefaultTableModel(
        rowData,
        columnNames
    ));
}
  
    public IssueBookUI() {
        initComponents();
        loadIssuedBooksIntoTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        studentIdLabel = new javax.swing.JLabel();
        studentNameLabel = new javax.swing.JLabel();
        studentRollNumberLabel = new javax.swing.JLabel();
        studentBookIsbanLabel = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        studentNameTextField = new javax.swing.JTextField();
        studentRollNumberTextField = new javax.swing.JTextField();
        bookIsbanTextField = new javax.swing.JTextField();
        issueBookButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueBookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headingLabel.setText("Issue Book To Student");

        studentIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentIdLabel.setText("Student I\"d");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentNameLabel.setText("Student Name");

        studentRollNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentRollNumberLabel.setText("Student Roll number");

        studentBookIsbanLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentBookIsbanLabel.setText("Book Isban");

        bookIsbanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIsbanTextFieldActionPerformed(evt);
            }
        });

        issueBookButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        issueBookButton.setText("Issue Book");
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        issueBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BookI'd", "Book Name", "Book ISBAN", "Book Author", "Book Quantity"
            }
        ));
        jScrollPane1.setViewportView(issueBookTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel)
                            .addComponent(studentIdLabel)
                            .addComponent(studentRollNumberLabel)
                            .addComponent(studentBookIsbanLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(studentNameTextField)
                            .addComponent(studentRollNumberTextField)
                            .addComponent(bookIsbanTextField))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headingLabel)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(issueBookButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(headingLabel)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdLabel)
                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentRollNumberLabel)
                    .addComponent(studentRollNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIsbanTextField)
                    .addComponent(studentBookIsbanLabel))
                .addGap(18, 18, 18)
                .addComponent(issueBookButton)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
       int id = Integer.parseInt(studentIdTextField.getText());
        String name = studentNameTextField.getText();
        String rollnumer = studentRollNumberTextField.getText();
        String iban = bookIsbanTextField.getText();
        

        IssueToSudentDao issueToSudentDao = new IssueToStudentDAOImpl();
        IssueToSudent issueToSudent = new IssueToSudent(id, name, rollnumer, iban);
        issueToSudentDao.issueBook(issueToSudent);
        studentIdTextField.setText("");
        studentNameTextField.setText("");
        studentRollNumberTextField.setText("");
        bookIsbanTextField.setText("");
        JOptionPane.showMessageDialog(this, "Book Issued successfully!");
    }//GEN-LAST:event_issueBookButtonActionPerformed

    private void bookIsbanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIsbanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIsbanTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIsbanTextField;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JTable issueBookTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel studentBookIsbanLabel;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JLabel studentRollNumberLabel;
    private javax.swing.JTextField studentRollNumberTextField;
    // End of variables declaration//GEN-END:variables
}
