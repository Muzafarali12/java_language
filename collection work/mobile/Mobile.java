package com.Student.mobile;

public class Mobile {
    private String name;
    private double price;
    private String company;
    private int battery;
    private double charger;
    private String color;
    private float size;
    private String Camera;
    private int sim;
    private double varanty;
    private String batteryCapacity;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getCharger() {
        return charger;
    }

    public void setCharger(double charger) {
        this.charger = charger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public double getVaranty() {
        return varanty;
    }

    public void setVaranty(double varanty) {
        this.varanty = varanty;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", battery=" + battery +
                ", charger=" + charger +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", Camera='" + Camera + '\'' +
                ", sim=" + sim +
                ", varanty=" + varanty +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                '}';
    }
}
