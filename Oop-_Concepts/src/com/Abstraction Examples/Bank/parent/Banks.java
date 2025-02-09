package com.Bank.parent;

public abstract class Banks {
    private String name;
    public abstract void  employee();

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Name of Bank "+this.name);
    }

}
