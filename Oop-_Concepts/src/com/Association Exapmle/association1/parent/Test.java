package com.association1.parent;

public class Test {
    public static void main(String [] args){
        Car c = new Car();
        c.setName("Cultus");
        c.setCompany("cultus-company");
        c.setPrise(2000000);

        Engine en = new Engine();
        en.setNumber(442278);
        en.setCompany("Honda-cc");

        c.setEngine(en);

        System.out.println("Car Name      :   "+c.getName());
        System.out.println("Car company   :   "+c.getComapny());
        System.out.println("Engine Company:   "+c.getEngine().getCompany());
        System.out.println("Engine Number :   "+c.getEngine().getNumber());
        System.out.println("Car price     :   "+c.getPrise());
    }
}
