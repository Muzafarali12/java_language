package com.abstraction5.parent;

public abstract class animal {
    private String name;
    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
