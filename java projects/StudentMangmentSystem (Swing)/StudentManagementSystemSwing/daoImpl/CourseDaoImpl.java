package daoImpl;

import dao.CourseDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Course;

public class CourseDaoImpl implements CourseDao {
    Connection connection = DBConnection.getDbConnection();
    @Override
     public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "select * from courses";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                courses.add(new Course(rs.getInt("id"), rs.getString("name")));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return courses;
    }
}
