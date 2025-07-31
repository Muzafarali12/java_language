package com.hello.LMMS;

public class Department {
    private String departmentName;
    private String departmentCode;
    

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
    public Department(String departmentName,String departmentCode){
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    public void displayDepartment(){
        System.out.println("Department Name  :   "+departmentName + "       Department Code :  " + departmentCode);
    }
}
