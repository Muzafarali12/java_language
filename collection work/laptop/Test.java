package com.Student.laptop;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){
        Laptop laptop = new Laptop();
        laptop.setModel("Apple");
        laptop.setColor("Black");
        laptop.setCompany("Apple-Company");
        laptop.setPrice(20000);
        laptop.setChargerCompany("Gernal");
        laptop.setBatteryCell(5);
        laptop.setBatteryPower("88%");
        laptop.setHardDisk(8);
        laptop.setRam("8Gb Ram");
        laptop.setRom("256 Rom");

        List<Laptop> laptopL = new ArrayList();
        laptopL.add(laptop);
        System.out.println(laptopL);

    }
}
