package com.hello.LMMS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManagementSystem {
    private Set<Student> studentSet = new HashSet<>();
    private Set<Department> departmentSet = new HashSet<Department>();

    public void defaultValue() {
        departmentSet.add(new Department("Software-Engineering", "BS-SE"));
        departmentSet.add(new Department("Artificial Intelligence", "BS-AI"));
        departmentSet.add(new Department("Cyber-Security", "BS-CS"));
        departmentSet.add(new Department("Data-Science", "BS-DS"));
        departmentSet.add(new Department("Computer-Science", "BS-CS"));
    }

    public void defaultStudent() {
        Department defaultDepartment = null;
        for (Department dept : departmentSet) {
            if (dept.getDepartmentName().equalsIgnoreCase("Software-Engineering")) {
                defaultDepartment = dept;
                break;
            }
        }

        if (defaultDepartment != null) {
            studentSet.add(new Student("Shahzad", "BSE-23F-140", "301", defaultDepartment));
            studentSet.add(new Student("Habib","BSE-23F","302",defaultDepartment));
            studentSet.add(new Student("Naveed","BSE-23S,013","317",defaultDepartment));

        } else {
            System.out.println("Default department not found. Default student could not be added.");
        }
    }


    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Details.");
        System.out.print("Enter Student Name  : ");
        String name = input.next();

        System.out.print("Enter Student Id    : ");
        String id = input.next();

        System.out.print("Enter Student RollNumber  : ");
        String rollNumber = input.next();

        System.out.print("Department Code: ");
        String departmentCode = input.next();


        Department department = null;
        for (Department dept : departmentSet) {
            if (dept.getDepartmentCode().equalsIgnoreCase(departmentCode)) {
                department = dept;
                break;
            }
        }
        Student newStudent = new Student(name, id, rollNumber, department);
        if (studentSet.add(newStudent)) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student could not be added (duplicate or error).");
        }
    }
    public void updateStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student ID you want to update: ");
        String sId = input.next();

        boolean studentFound = false;

        for (Student st : studentSet) {
            if (st.getStudentId().equalsIgnoreCase(sId)) {
                studentFound = true;

                System.out.println("Enter new data to update the student record.");

                System.out.print("Enter Student Name: ");
                String studentName = input.next();

                System.out.print("Enter Roll Number: ");
                String studentRollNumber = input.next();

                System.out.print("Enter Department Name: ");
                input.nextLine(); // Consume leftover newline
                String departmentInput = input.nextLine();

                Department department = null;
                for (Department dept : departmentSet) {
                    if (dept.getDepartmentName().equalsIgnoreCase(departmentInput)) {
                        department = dept;
                        break;
                    }
                }

                if (department == null) {
                    System.out.println("Invalid department name. Update aborted.");
                    return;
                }
                st.setStudentName(studentName);
                st.setStudentRollNumber(studentRollNumber);
                st.setDepartment(department);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        if (!studentFound) {
            System.out.println("Student ID not found.");
        }
    }
    public void deleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student ID to delete: ");
        String sId = input.next();

        boolean studentFound = false;

        for (Student st : studentSet) {
            if (st.getStudentId().equalsIgnoreCase(sId)) {
                studentSet.remove(st);
                studentFound = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student ID not found.");
        }
    }

    public void getSingleStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student ID to retrieve details: ");
        String sId = input.next();

        boolean studentFound = false;

        for (Student st : studentSet) {
            if (st.getStudentId().equalsIgnoreCase(sId)) {
                studentFound = true;

                // Display student details
                System.out.println("Student Details:");
                System.out.println("Name: " + st.getStudentName());
                System.out.println("ID: " + st.getStudentId());
                System.out.println("Roll Number: " + st.getStudentRollNumber());
                if (st.getDepartment() != null) {
                    System.out.println("Department Name: " + st.getDepartment().getDepartmentName());
                    System.out.println("Department Code: " + st.getDepartment().getDepartmentCode());
                } else {
                    System.out.println("Department: Not assigned");
                }
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + sId + " not found.");
        }
    }
    public void getAllStudent() {
        Student s = new Student();
        s.displayStudent();
        if (studentSet.isEmpty()) {
            System.out.println("No students available in the system.");
            return;
        }

        System.out.println("All Students Details:");
        for (Student st : studentSet) {

            System.out.println("---------------------------------");
            System.out.println("Name: " + st.getStudentName());
            System.out.println("ID: " + st.getStudentId());
            System.out.println("Roll Number: " + st.getStudentRollNumber());

            if (st.getDepartment() != null) {
                System.out.println("Department Name: " + st.getDepartment().getDepartmentName());
                System.out.println("Department Code: " + st.getDepartment().getDepartmentCode());
            } else {
                System.out.println("Department: Not assigned");
            }
        }
        System.out.println("---------------------------------");
    }


    public void addDepartement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Department Data.");
        System.out.print("Enter Department Name      : ");
        String departmentName = input.next();

        System.out.print("Enter department Code      : ");
        String departmentCode = input.next();

        Department department = new Department(departmentName, departmentCode);
        departmentSet.add(department);

        System.out.println("Department Added Sucessfuly .");
    }

    public void display() {
        for (Department dept : departmentSet) {
            dept.displayDepartment();
        }
    }

    public void updateDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Department Data for Update Department.");
        System.out.println("Enter department Code.");
        String departmentCode = input.next();
        Department foundDepartemnetCode = null;
        for (Department dp : departmentSet) {
            if (dp.getDepartmentCode().equalsIgnoreCase(departmentCode)) {
                foundDepartemnetCode = dp;
                break;
            }
        }
        if (foundDepartemnetCode != null) {
            System.out.println("Enter Your new Name Of Department   : ");
            String newDepartmentName = input.next();
            foundDepartemnetCode.setDepartmentName(newDepartmentName);
            System.out.println("Department Updated Successful. ");
        } else {
            System.out.println("Department With this code is not Present.");
        }
    }


    public void deleteDepartment(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Department Data  for Delete Department");
        System.out.print("Enter Department Code   : ");
        String code = input.next();
        Department foundCode = null;
        for(Department co : departmentSet) {
            if (co.getDepartmentCode().equalsIgnoreCase(code)) {
                foundCode = co;
                break;
            }
        }
        if (foundCode != null){

                departmentSet.remove(foundCode);
                System.out.println(" Department deleted Successful");}
            else {
                System.out.println("Department Not Present.");
            }
        }


    public Department getSingleDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Department Data for get Department");
        System.out.print("Enter Code    : ");
        String oldCode = input.next();
        Department foundOldDepartment = null;
        for (Department dep : departmentSet) {
            if (dep.getDepartmentCode().equalsIgnoreCase(oldCode)) {
                foundOldDepartment = dep;
                break;
            }
        }
            if (foundOldDepartment != null) {
                System.out.println("Department Found.");
                System.out.println("Name :  "+foundOldDepartment.getDepartmentName());
                System.out.println("Code :  "+foundOldDepartment.getDepartmentCode());
                return foundOldDepartment;
            }
            else {
                System.out.print("This Department is Not present. ");
            }
        return foundOldDepartment;
    }


    public void getAllDepartment(){
        defaultValue();
    }

    public void showMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View Single Student");
            System.out.println("5. View All Students");
            System.out.println("6. Add Department");
            System.out.println("7. Update Department");
            System.out.println("8. Delete Department");
            System.out.println("9. View Single Department");
            System.out.println("10. View All Departments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> deleteStudent();
                case 4 -> getSingleStudent();
                case 5 -> getAllStudent();
                case 6 -> addDepartement();
                case 7 -> updateDepartment();
                case 8 -> deleteDepartment();
                case 9 -> getSingleDepartment();
                case 10 -> getAllDepartment();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    public static void main(String [] args){
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        studentManagementSystem.showMenu();
        studentManagementSystem.display();
    }
}
