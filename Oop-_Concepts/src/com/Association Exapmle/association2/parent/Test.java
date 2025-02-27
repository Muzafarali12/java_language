package com.association2.parent;

public class Test {
    public static void main(String [] args){
        University un = new University();
        un.setName("Karachi University");
        un.setBuilding("Main-Building");

        Department dp = new Department();
        dp.setName("Cyber Security ");
        dp.setFees(48000);

        un.setDepartment(dp);

        System.out.println("University name        : "+un.getName());
        System.out.println("University Building    : "+un.getBuilding());
        System.out.println("University department  : "+un.getDepartment().getName());
        System.out.println("Department fees        : "+un.getDepartment().getFees());
    }
}
