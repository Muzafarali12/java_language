package com.animal.parent;

public class Test {
    public static void main(String [] args){
        Dog d = new Dog();
        d.setName("Dog");
        d.eat();

        d = new Cat();
        d.setName("Cat");
        System.out.print(d.getName());
        d.walk();
    }
}
