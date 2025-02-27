package com.interfaces.parent;

public class Rolex implements Watch{
    @Override
    public void company(){
        System.out.println(" is known for its high-quality,durable, and timeless designs.");
    }
    @Override
    public void show(){
        System.out.print("Rolex "+Watch.name);
    }
}
