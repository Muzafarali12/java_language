package com.polymorphism.parent;

public class Test {
    public static void main(String [] args){
        Animal a = new Cat();
        a.setName("Cat cam make sound ");
        a.sound();
        a = new Dog();
        a.setName("Dog can make sound ");
        a.sound();
    }
}
