package database;

import model.Student;
import java.sql.*;
import java.util.Scanner;

public class StudentDbManager {
    Connection connection = DbConnection.getDbConnection();

    public void addStudent(Student student) {
        try {
            String checkDeptSQL = "SELECT COUNT(*) FROM department WHERE dep_id = ?";
            PreparedStatement checkStmt = connection.prepareStatement(checkDeptSQL);
            checkStmt.setInt(1, student.getDepartment().getDepId());
            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) == 0) {
                String insertDeptSQL = "INSERT INTO department (dep_id, dep_name, dep_code) VALUES (?, ?, ?)";
                PreparedStatement insertDeptStmt = connection.prepareStatement(insertDeptSQL);
                insertDeptStmt.setInt(1, student.getDepartment().getDepId());
                insertDeptStmt.setString(2, student.getDepartment().getDepartmentName());
                insertDeptStmt.setString(3, student.getDepartment().getDepartmentCode());
                insertDeptStmt.executeUpdate();
            }

            String insertStudentSQL = "INSERT INTO student (stu_id, stu_name, stu_roll, dep_id) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertStudentSQL);
            insertStmt.setString(1, student.getStudentId());
            insertStmt.setString(2, student.getStudentName());
            insertStmt.setString(3, student.getStudentRollNumber());
            insertStmt.setInt(4, student.getDepartment().getDepId());

            int rows = insertStmt.executeUpdate();
            System.out.println(rows > 0 ? "Student added successfully." : "Failed to add student.");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void updateStudent(String stu_id) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter new student name: ");
            String name = input.nextLine();

            System.out.print("Enter new department ID: ");
            int dep_id = Integer.parseInt(input.nextLine());

            String update = "UPDATE student SET stu_name = ?, dep_id = ? WHERE stu_id = ?";
            PreparedStatement stmt = connection.prepareStatement(update);
            stmt.setString(1, name);
            stmt.setInt(2, dep_id);
            stmt.setString(3, stu_id);

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "Student updated successfully." : "Student not found.");

        } catch (Exception e) {
            System.err.println("Update failed: " + e.getMessage());
        }
    }

    public void deleteStudent(String stu_id){
        try {
            String delete = "DELETE FROM student WHERE stu_id = ?";
            PreparedStatement stmt = connection.prepareStatement(delete);
            stmt.setString(1, stu_id);

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "Student deleted successfully." : "Student not found.");

        } catch (Exception e) {
            System.err.println("Delete failed: " + e.getMessage());
        }
    }
}
