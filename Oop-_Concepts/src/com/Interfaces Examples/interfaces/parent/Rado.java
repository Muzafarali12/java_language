package com.interfaces.parent;

public class Rado implements Watch{
    @Override
    public void company(){
        System.out.println(" is famous for his designs. ");
    }
    @Override
    public void show(){
        System.out.print("Rado "+Watch.name);
    }
}
