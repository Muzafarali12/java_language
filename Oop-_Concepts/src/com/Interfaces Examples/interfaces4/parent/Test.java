package com.interfaces4.parent;

public class Test {
    public static void main(String [] args){
        university u = new SoftwareEngineering();
        u.fees();
        u.attendence();
        System.out.println();
        u = new ArtificialIntelligence();
        u.fees();
        u.attendence();
    }
}
