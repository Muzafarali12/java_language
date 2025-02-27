package com.animal.parent;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void eat() {
        System.out.println(name+" Can eat.");
        walk();
    }
    public void walk(){
        System.out.println(name+" Can bark.");
    }
}
