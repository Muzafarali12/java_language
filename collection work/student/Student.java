package com.Student.Student;

public class Student {
    private String name;
    private String semester;
    private String section;
    private double age;
    private String university;
    private String department;
    private double currentCgpa;
    private String gpa;
    private String rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCurrentCgpa() {
        return currentCgpa;
    }

    public void setCurrentCgpa(double currentCgpa) {
        this.currentCgpa = currentCgpa;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", section='" + section + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", currentCgpa=" + currentCgpa +
                ", gpa='" + gpa + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}
