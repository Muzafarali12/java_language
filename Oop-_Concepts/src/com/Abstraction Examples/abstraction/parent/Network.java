package com.abstraction.parent;

public abstract class Network {
    private String name;
    public abstract void net();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
