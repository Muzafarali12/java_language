package com.java8.StremAPI;

public class Employee {
    String name;
    String department;
    int salary;
    int age;

    public Employee(String name,String department,int salary,int age){
        this.name= name;
        this.department= department;
        this.salary = salary;
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
