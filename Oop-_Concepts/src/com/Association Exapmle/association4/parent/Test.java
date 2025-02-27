package com.association4.parent;

public class Test {
    public static void main(String [] args){
        Teacher t = new Teacher();
        t.name="Agha Abbass Shaikh";
        t.setpNumber("+73979903");

        Student s = new Student();
        s.name="Raza";
        s.setId("BSE-23F-144");
        s.setClss(4);

        t.setStudent(s);

        System.out.println("Teacher Name           : "+t.name);
        System.out.println("Teacher Contact Number : "+t.getPNumber());
        System.out.println("Student name           : "+s.name);
        System.out.println("Student Name           : "+t.getStudent().getId());
        System.out.println("Student Class          : "+t.getStudent().getClss());


    }
}
