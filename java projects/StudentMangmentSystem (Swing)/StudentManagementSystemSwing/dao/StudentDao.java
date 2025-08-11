package dao;

import java.util.List;
import model.Student;

public interface StudentDao {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(String rollNumber);
    List<Student> getAllStudents();

}
