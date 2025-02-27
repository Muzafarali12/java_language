package com.association1.parent;

public class Car {
    private String name;
    private String company;
    private double prise;

    private Engine engine;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
     }
    public String getComapny(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public double getPrise(){
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
