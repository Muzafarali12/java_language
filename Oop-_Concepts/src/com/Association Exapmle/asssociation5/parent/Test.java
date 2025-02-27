package com.asssociation5.parent;

public class Test {
    public static void main(String [] args){
        Mobile m = new Mobile();
        m.setName("Vivo y-28");
        m.setModel(2024);
        m.setRam(8);
        m.setRom(128);

        Battery b = new Battery();
        b.setCompany("Vivo");
        b.setMh("5000mh");

        m.setBattery(b);

        System.out.println("Mobile name              : "+m.getName());
        System.out.println("Mobile Model             : "+m.getModel());
        System.out.println("Mobile Ram               : "+m.getRam());
        System.out.println("Mobile Rom               : "+m.getRom());
        System.out.println("Mobile Battery company   : "+m.getBattery().getCompany());
        System.out.println("Battery Mh               : "+m.getBattery().getMh());
    }
}
