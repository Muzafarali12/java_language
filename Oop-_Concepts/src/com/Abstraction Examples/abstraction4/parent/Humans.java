package com.abstraction4.parent;

public abstract class Humans {
    private String name;
    private double id;
    public abstract void department();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
