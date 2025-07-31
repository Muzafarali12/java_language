package model;

import database.DepartmentDbManager;
import database.StudentDbManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentDbManager studentManager = new StudentDbManager();
        DepartmentDbManager departmentManager = new DepartmentDbManager();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Department");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student ID: ");
                    String sid = input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String sname = input.nextLine();

                    System.out.print("Enter Student Roll Number: ");
                    String sroll = input.nextLine();

                    System.out.print("Enter Department ID (number): ");
                    int did = Integer.parseInt(input.nextLine());

                    System.out.print("Enter Department Name: ");
                    String dname = input.nextLine();

                    System.out.print("Enter Department Code: ");
                    String dcode = input.nextLine();

                    Department dept = new Department(did, dname, dcode);
                    Student student = new Student(sname, sid, sroll, dept);
                    studentManager.addStudent(student);
                    break;

                case "2":
                    System.out.print("Enter Student ID to update: ");
                    String updateId = input.nextLine();
                    studentManager.updateStudent(updateId);
                    break;

                case "3":
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = input.nextLine();
                    studentManager.deleteStudent(deleteId);
                    break;

                case "4":
                    System.out.print("Enter Department ID: ");
                    int newDepId = Integer.parseInt(input.nextLine());

                    System.out.print("Enter Department Name: ");
                    String depName = input.nextLine();

                    System.out.print("Enter Department Code: ");
                    String depCode = input.nextLine();

                    Department newDepartment = new Department(newDepId, depName, depCode);
                    departmentManager.addDepartment(newDepartment);
                    break;

                case "5":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
