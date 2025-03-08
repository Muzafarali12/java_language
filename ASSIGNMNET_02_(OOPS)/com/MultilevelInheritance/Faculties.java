package com.test.MultilevelInheritance;

class Faculties extends CoOrdinator{
    protected String facultyName;
    protected int facultyId;
    public Faculties(String name, String department,int departmentId,String contactNumber,String coOrdinaterName,int coOrdinaterId,String facultyName, int facultyId){
        super(name,department,departmentId,contactNumber,coOrdinaterName,coOrdinaterId);
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }
    @Override
    public void display(){
        System.out.println("Faculties ");
        System.out.println("Faculties Name   : "+facultyName);
        System.out.println("Faculties I'd    : "+facultyId);
    }
}
