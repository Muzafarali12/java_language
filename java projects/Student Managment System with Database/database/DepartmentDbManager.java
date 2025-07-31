package database;

import model.Department;
import java.sql.*;

public class DepartmentDbManager {
    Connection connection = DbConnection.getDbConnection();

    public void addDepartment(Department department){
        try {
            String insert = "INSERT INTO department (dep_id, dep_name, dep_code) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insert);
            stmt.setInt(1, department.getDepId());
            stmt.setString(2, department.getDepartmentName());
            stmt.setString(3, department.getDepartmentCode());

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "Department added successfully." : "Failed to add department.");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
