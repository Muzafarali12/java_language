package model;

public class Student {
    private String studentName;
    private String studentId;
    private String studentRollNumber;
    private Department department;

    public Student(String studentName, String studentId, String studentRollNumber, Department department) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
        this.department = department;
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getStudentRollNumber() { return studentRollNumber; }
    public void setStudentRollNumber(String studentRollNumber) { this.studentRollNumber = studentRollNumber; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public void displayStudent() {
        System.out.println("Name: " + studentName + ", ID: " + studentId +
                ", Roll No: " + studentRollNumber + ", Department: " + department.getDepartmentName());
    }
}
