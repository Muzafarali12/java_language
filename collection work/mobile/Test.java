package com.Student.mobile;

import com.Student.laptop.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){

        Mobile mobile = new Mobile();
        mobile.setName("I-phone");
        mobile.setPrice(150000);
        mobile.setCompany("Apple");
        mobile.setColor("White");
        mobile.setBattery(88);
        mobile.setCamera("100MP");
        mobile.setCharger(50);
        mobile.setSim(1);
        mobile.setSize(5.6F);
        mobile.setVaranty(3);

        List<Mobile> moblink = new ArrayList();
        moblink.add(mobile);
        System.out.println(mobile);

    }
}
