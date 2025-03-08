package com.test.MultilevelInheritance;

public class HeadOfDepartment {
    protected String name;
    protected String department;
    protected int departmentId;
    protected String contactNumber;

    public HeadOfDepartment(String name, String department,int departmentId,String contactNumber){
        this.name = name;
        this.department = department;
        this.departmentId = departmentId;
        this.contactNumber = contactNumber;
    }
    public void display(){
        System.out.println("Head of department.");
        System.out.println("Name            : "+name);
        System.out.println("Department      : "+department);
        System.out.println("Department Id   : "+departmentId);
        System.out.println("Contact Number  : "+contactNumber);
    }
}
