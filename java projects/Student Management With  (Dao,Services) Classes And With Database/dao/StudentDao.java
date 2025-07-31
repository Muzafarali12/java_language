package dao;

import model.Student;

public interface StudentDao {
    boolean addStudent(Student student);
    boolean updateStudent(String stu_id, String name, int dep_id);
    boolean deleteStudent(String stu_id);
}
