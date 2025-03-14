package com.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args) {
        List<Student> studentList = new ArrayList<>();

        Student student = new Student();
        student.setName("Akbar");
        student.setSemester("4th-Semester");
        student.setSection("3A");
        student.setAge(19);
        student.setDepartment("Software Engineering");
        student.setRollNumber("BSE-23F-109");
        student.setGpa("2.9");
        student.setCurrentCgpa(2.7);
        student.setUniversity("Habib-University");

        Student student0 = new Student();
        student0.setName("Raja");
        student0.setSemester("3th-Semester");
        student0.setSection("3b");
        student0.setAge(17);
        student0.setDepartment("Computer Science");
        student0.setRollNumber("BSCE-23F-109");
        student0.setGpa("3.1");
        student0.setCurrentCgpa(2.9);
        student0.setUniversity("Mehran-University");

        studentList.add(student);
        studentList.add(student0);

        for(int i=0; i<studentList.size(); i++){
           Student students  = studentList.get(i);
            System.out.println(students);
        }
    }
}
