package com.Student.mapExample;

public class Student {
    private String name;
    private short age;

    public Student(){}

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(short age){
        this.age = age;
    }
    public short getAge(){
        return age;
    }
    public Student(String name,short age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name "+name  +"Age  "+ age   );
    }
}
