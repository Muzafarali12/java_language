//package model;
//
//import service.DepartmentServices;
//import service.StudentService;
//import serviceImpl.DepartmentServicesImpl;
//import serviceImpl.StudentServiceImpl;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        StudentService studentService = new StudentServiceImpl();
//        DepartmentServices departmentServices = new DepartmentServicesImpl();
//
//        while (true) {
//            System.out.println("\n--- MENU ---");
//            System.out.println("1. Add Student");
//            System.out.println("2. Update Student");
//            System.out.println("3. Delete Student");
//            System.out.println("4. Add Department");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//
//            String choice = input.nextLine();
//
//            switch (choice) {
//                case "1":
//                    studentService.addStudent();
//                    break;
//
//                case "2":
//                    studentService.updateStudent();
//                    break;
//                    case "3":
//                        studentService.deleteStudent();
//                    break;
//
//                case "4":
//                    departmentServices.addDepartment();
//                    break;
//
//                case "5":
//                    System.out.println("Exiting...");
//                    return;
//
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        }
//    }
//}
