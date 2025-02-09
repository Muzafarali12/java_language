package com.abstraction3.parent;

public abstract class Mobile {
    private String name;
    private int model;

    public abstract void price();
    public void battery(){
    }


    public void setName(String name){
        this.name = name;
    }

    public void setModel(int model){
        this.model = model;
    }
    public void show(){
        System.out.println("Name ="+this.name);
        System.out.println("Model = "+this.model);
    }

}
