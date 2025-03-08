package com.test.MultilevelInheritance;

class CoOrdinator extends HeadOfDepartment{
    protected String coOrdinaterName;
    protected int coOrdinaterId;
    public CoOrdinator(String name, String department,int departmentId,String contactNumber,String coOrdinaterName,int coOrdinaterId){
        super(name, department, departmentId, contactNumber);
        this.coOrdinaterName = coOrdinaterName;
        this.coOrdinaterId = coOrdinaterId;
    }
    @Override
    public void display(){
        System.out.println("Co-Ordinater ");
        System.out.println("Co-Ordinater Name   : "+coOrdinaterName);
        System.out.println("Co-Ordinater Id     : "+coOrdinaterId);
    }
}
