package com.interfaces4.parent;

public class SoftwareEngineering implements university{
    @Override
    public void fees(){
        System.out.println(university.name+" The fees of Software Enginnering department is per subject 8k. ");
    }
    @Override
    public void attendence(){
        System.out.println("The university teachers must take 80% attendence. ");
    }
}
