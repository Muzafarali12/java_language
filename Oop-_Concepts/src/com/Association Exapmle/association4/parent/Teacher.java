package com.association4.parent;

public class Teacher {
    String name;
    private String pNumber;

    private Student student;

    public String getPNumber(){
        return pNumber;
    }
    public void setpNumber(String pNumber){
        this.pNumber = pNumber;
    }

    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
}
