package com.hello.LMMS;

public class Student {
    private String name;
    private String id;
    private String address;
    private String idCardNumber;

    public Student(String name, String id, String address, String idCardNumber) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.idCardNumber = idCardNumber;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getIdCardNumber() { return idCardNumber; }
    public void setIdCardNumber(String idCardNumber) { this.idCardNumber = idCardNumber; }


    public void displayStudentData(){
        System.out.println("Name            Id             Address             ID-Card-Number");
    }
}
