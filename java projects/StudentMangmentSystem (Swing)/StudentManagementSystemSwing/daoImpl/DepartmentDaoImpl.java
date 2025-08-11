package daoImpl;

import dao.DepartmentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Department;

public class DepartmentDaoImpl implements DepartmentDao {

    @Override
    public List<Department> getAllDepartments() {
        List<Department> list = new ArrayList<>();
        String sql = "SELECT dep_name FROM departments";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Department dept = new Department();
                dept.setName(rs.getString("dep_name"));
                list.add(dept);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
