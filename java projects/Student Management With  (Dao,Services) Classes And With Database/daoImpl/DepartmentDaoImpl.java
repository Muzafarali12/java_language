package daoImpl;

import dao.DepartmentDao;
import database.DbConnection;
import model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDaoImpl implements DepartmentDao {

    Connection connection = DbConnection.getDbConnection();
    @Override
    public boolean addDepartment(Department department) {
        try {
            String insert = "INSERT INTO department (dep_id, dep_name, dep_code) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insert);
            stmt.setInt(1, department.getDepId());
            stmt.setString(2, department.getDepartmentName());
            stmt.setString(3, department.getDepartmentCode());

            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }
}
