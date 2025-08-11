package ui;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class RegisterationForm extends javax.swing.JFrame {

    String [] ColumName = {"Name ","Department ","Age ","University ","Mobile ","Gender"};
    DefaultTableModel defaultTableModel = new DefaultTableModel(ColumName,0);
    
    
    public RegisterationForm() {
        initComponents();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        fillDepartmentComboField();
        studentTable.setModel(defaultTableModel);
        loadStudentsToTable();
    }

    private void fillDepartmentComboField(){
        List<String> department = new ArrayList();
        department.add("Sofware Engineering");
        department.add("Environmental Engineering");
        department.add("Chemical Engineering");
        department.add("Computer Science");
        department.forEach(dep ->{
            departmentComboField.addItem(dep);
        });
    }
    
    private void loadStudentsToTable() {
    String url = "jdbc:mysql://localhost:3306/university_Students";
    String user = "root";
    String password = "";

    String sql = "SELECT stu_name, department, age, university, gender, contact FROM student";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = connection.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        // Create a table model
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Name", "Department", "Age", "University", "Gender", "Contact"}, 0
        );

        // Add rows from ResultSet
        while (rs.next()) {
            model.addRow(new Object[]{
                    rs.getString("stu_name"),
                    rs.getString("department"),
                    rs.getInt("age"),
                    rs.getString("university"),
                    rs.getString("gender"),
                    rs.getString("contact")
            });
        }

        studentTable.setModel(model);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        universityLabel = new javax.swing.JLabel();
        universityTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        ageTextField = new javax.swing.JSpinner();
        departmentComboField = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        mobileConatctLabel = new javax.swing.JLabel();
        mobileContactField = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name ");

        departmentLabel.setText("Department");

        ageLabel.setText("Age");

        universityLabel.setText("University");

        genderLabel.setText("Gender");

        maleRadioButton.setText("Male");

        femaleRadioButton.setText("Female");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        departmentComboField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboFieldActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(studentTable);

        mobileConatctLabel.setText("Mobile");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registration Form Of Student For Program");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departmentLabel)
                        .addGap(18, 18, 18)
                        .addComponent(departmentComboField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(universityLabel)
                            .addComponent(genderLabel)
                            .addComponent(mobileConatctLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTextField)
                            .addComponent(nameTextField)
                            .addComponent(universityTextField)
                            .addComponent(mobileContactField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(maleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton)))))
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentComboField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universityLabel)
                    .addComponent(universityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileContactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileConatctLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(maleRadioButton)
                    .addComponent(genderLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

        
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String name = nameTextField.getText();
        String department = departmentComboField.getSelectedItem().toString();
        Integer age = Integer.parseInt(ageTextField.getValue().toString());
        String university = universityTextField.getText();
        String contact = mobileContactField.getText();
        String gender=null;
        if(maleRadioButton.isSelected()){
            gender = maleRadioButton.getText();
        }
        if(femaleRadioButton.isSelected()){
            gender = femaleRadioButton.getText();
        }
        
        try(Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/university_Students", 
            "root", 
            "")){
        

String sql = "INSERT INTO student (stu_name, department, age, university, gender, contact) VALUES (?, ?, ?, ?, ?, ?)";
PreparedStatement pstmt = connection.prepareStatement(sql);
pstmt.setString(1, name);
pstmt.setString(2, department);
pstmt.setInt(3, age);
pstmt.setString(4, university);
pstmt.setString(5, gender);
pstmt.setString(6, contact);

int rowsInserted = pstmt.executeUpdate();
if (rowsInserted > 0) {
    System.out.println("Form data inserted successfully.");
}
        }
        
catch(SQLException e){
        e.printStackTrace();
        System.out.println("Database error : "+e.getMessage());
        }
        System.out.println("Form Filled Successfuly.");
        loadStudentsToTable();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void departmentComboFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentComboFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JSpinner ageTextField;
    private javax.swing.JComboBox<String> departmentComboField;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel mobileConatctLabel;
    private javax.swing.JTextField mobileContactField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JTextField universityTextField;
    // End of variables declaration//GEN-END:variables
}
