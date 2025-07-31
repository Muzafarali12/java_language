package serviceImpl;

import daoImpl.StudentDaoImpl;
import model.Department;
import model.Student;
import service.StudentService;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{

    @Override
    public void addStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String sid = input.nextLine();

        System.out.print("Enter Student Name: ");
        String sname = input.nextLine();

        System.out.print("Enter Student Roll Number: ");
        String sroll = input.nextLine();

        System.out.print("Enter Department ID (number): ");
        int did;
        try {
            did = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid department ID.");
            return;
        }

        System.out.print("Enter Department Name: ");
        String dname = input.nextLine();

        System.out.print("Enter Department Code: ");
        String dcode = input.nextLine();

        Department dept = new Department(did, dname, dcode);
        Student student = new Student(sname, sid, sroll, dept);

        StudentDaoImpl studentDao = new StudentDaoImpl();
        boolean success = studentDao.addStudent(student);

        if (success) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
    }


    @Override
    public void updateStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID to update: ");
        String stu_id = input.nextLine();

        System.out.print("Enter new student name: ");
        String name = input.nextLine();

        System.out.print("Enter new department ID: ");
        int dep_id;
        try {
            dep_id = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid department ID format.");
            return;
        }

        StudentDaoImpl studentDao = new StudentDaoImpl();
        boolean success = studentDao.updateStudent(stu_id, name, dep_id);

        if (success) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found or update failed.");
        }
    }

    @Override
    public void deleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        String deleteId = input.nextLine();
        StudentDaoImpl studentDao = new StudentDaoImpl();
        boolean success = studentDao.deleteStudent(deleteId);
        if (success) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found with this I'd.");
        }
    }
}
