package com.Student.vehicale;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String [] args){

        List<Bike> bike = new ArrayList<>();

       Bike bike1 = new Bike();
       bike1.setName("Black");
       bike1.setCompany("Indian-Comapany");

       Bike bike2 = new Bike();
       bike2.setName("XYZ");
       bike2.setCompany("XYZ");

        bike.add(new Bike("CD-70","Honda"));
        bike.add(new Bike("1-2-5","Honda"));
        bike.add(new Bike("Union-Star","China-Company"));
        bike.add(new Bike("Dhoom","Yamha-Company"));
        bike.add(new Bike("70-cd","Yamha"));
        bike.add(new Bike("Super-Star","China-Company"));
        bike.add(new Bike("Black-Widow","Honda-Company"));

        bike.add(bike1);
        bike.add(bike2);
        for(int i=0; i< bike.size();i++){
        System.out.println(bike.get(i));
        }

    }
}
