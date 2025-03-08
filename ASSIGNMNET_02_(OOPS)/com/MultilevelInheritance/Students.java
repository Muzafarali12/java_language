package com.test.MultilevelInheritance;

public class Students extends Faculties{
    protected String studentName;
    protected int studentId;
    public Students(String name, String department,int departmentId,String contactNumber,String coOrdinaterName,int coOrdinaterId,String facultyName, int facultyId,String studentName, int studentId){
        super(name,department,departmentId,contactNumber,coOrdinaterName,coOrdinaterId,facultyName,facultyId);
        this.studentName = studentName;
        this.studentId = studentId;
    }
    @Override
    public void display(){
        System.out.println("Student  ");
        System.out.println("Student Name   : "+studentName);
        System.out.println("Student I'd    : "+studentId);
    }
}
