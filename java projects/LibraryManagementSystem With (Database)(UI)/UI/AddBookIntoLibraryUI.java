
package com.test.librarymanagementsystem.UI;

import com.test.librarymanagementsystem.dao.BookDao;
import com.test.librarymanagementsystem.daoImpl.BookDaoImpl;
import com.test.librarymanagementsystem.model.Book;
import javax.swing.JOptionPane;


public class AddBookIntoLibraryUI extends javax.swing.JFrame {
    
      private void loadBooksIntoTable() {
    BookDao bookDao = new BookDaoImpl();
    java.util.List<Book> bookList = bookDao.getAllBooks();

    // Table model with column names
    String[] columnNames = {"ID", "Name", "ISBN", "Author", "Quantity"};
    Object[][] rowData = new Object[bookList.size()][5];

    for (int i = 0; i < bookList.size(); i++) {
        Book book = bookList.get(i);
        rowData[i][0] = book.getId();
        rowData[i][1] = book.getName();
        rowData[i][2] = book.getIsbn();
        rowData[i][3] = book.getAuthor();
        rowData[i][4] = book.getQuantity();
    }
    
     bookDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
        rowData,
        columnNames
    ));
      }
      
      

    public AddBookIntoLibraryUI() {
        initComponents();
        loadBooksIntoTable();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        bookIdLabel = new javax.swing.JLabel();
        bookNameLabel = new javax.swing.JLabel();
        bookIsbanLabel = new javax.swing.JLabel();
        bookAuthorLabel = new javax.swing.JLabel();
        bookIdQuantityLabel = new javax.swing.JLabel();
        bookIdTextField = new javax.swing.JTextField();
        bookNameTextField = new javax.swing.JTextField();
        bookIsbanTextField = new javax.swing.JTextField();
        bookAuthorTextField = new javax.swing.JTextField();
        bookQuantityTextField = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookDetailsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headingLabel.setText("Enter Book Details");

        bookIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookIdLabel.setText("Book Id");

        bookNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookNameLabel.setText("Book Name");

        bookIsbanLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookIsbanLabel.setText("Book ISBAN");

        bookAuthorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookAuthorLabel.setText("Book Author");

        bookIdQuantityLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bookIdQuantityLabel.setText("Book Quantity");

        bookIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdTextFieldActionPerformed(evt);
            }
        });

        addBookButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        bookDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book Id", "Book Name", "Book ISBNAN", "Book Author", "Book Quantity"
            }
        ));
        jScrollPane1.setViewportView(bookDetailsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBookButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookIdQuantityLabel)
                                    .addComponent(bookAuthorLabel)
                                    .addComponent(bookNameLabel)
                                    .addComponent(bookIsbanLabel))
                                .addGap(158, 158, 158))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addComponent(bookIsbanTextField)
                            .addComponent(bookAuthorTextField)
                            .addComponent(bookQuantityTextField)
                            .addComponent(bookIdTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(headingLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameLabel)
                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIsbanLabel)
                    .addComponent(bookIsbanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookAuthorLabel)
                    .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdQuantityLabel)
                    .addComponent(bookQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdTextFieldActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        int id = Integer.parseInt(bookIdTextField.getText());
        String name = bookNameTextField.getText();
        String isbn = bookIsbanTextField.getText();
        String author = bookAuthorTextField.getText();
        int quantity = Integer.parseInt(bookQuantityTextField.getText());

        BookDao bookDao = new BookDaoImpl();
        Book book = new Book(id, name, isbn, author, quantity);
        bookDao.addBook(book);

        bookIdTextField.setText("");
        bookNameTextField.setText("");
        bookIsbanTextField.setText("");
        bookAuthorTextField.setText("");
        bookQuantityTextField.setText("");
        JOptionPane.showMessageDialog(this, "Book added successfully!");
    }//GEN-LAST:event_addBookButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddBookIntoLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookIntoLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookIntoLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookIntoLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookIntoLibraryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel bookAuthorLabel;
    private javax.swing.JTextField bookAuthorTextField;
    private javax.swing.JTable bookDetailsTable;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JLabel bookIdQuantityLabel;
    private javax.swing.JTextField bookIdTextField;
    private javax.swing.JLabel bookIsbanLabel;
    private javax.swing.JTextField bookIsbanTextField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JTextField bookQuantityTextField;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
