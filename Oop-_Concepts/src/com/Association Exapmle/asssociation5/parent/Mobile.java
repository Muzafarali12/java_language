package com.asssociation5.parent;

public class Mobile {
    private String name;
    private double model;

    private int ram;
    private int rom;

    private Battery battery;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getModel(){
        return model;
    }
    public void setModel(double model){
        this.model = model;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRom(){
        return rom;
    }
    public void setRom(int rom){
        this.rom = rom;
    }
    public Battery getBattery(){
        return battery;
    }
    public void setBattery(Battery battery){
        this.battery = battery;
    }
}
