package com.polymorphism.parent;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println(super.getName()+"Barking");
    }
}
