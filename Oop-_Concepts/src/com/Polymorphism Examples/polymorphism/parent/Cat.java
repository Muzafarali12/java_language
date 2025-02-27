package com.polymorphism.parent;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println(super.getName()+"Miyaoo Miyaoo");
    }
}
