package com.Student.laptop;

public class Laptop {
    private String model;
    private double price;
    private String company;
    private int batteryCell;
    private String chargerCompany;
    private String color;
    private float size;
    private String ram;
    private String rom;
    private double hardDisk;
    private String batteryPower;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getBatteryCell() {
        return batteryCell;
    }

    public void setBatteryCell(int batteryCell) {
        this.batteryCell = batteryCell;
    }

    public String getChargerCompany() {
        return chargerCompany;
    }

    public void setChargerCompany(String chargerCompany) {
        this.chargerCompany = chargerCompany;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public double getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(double hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(String batteryPower) {
        this.batteryPower = batteryPower;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", batteryCell=" + batteryCell +
                ", chargerCompany='" + chargerCompany + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", hardDisk=" + hardDisk +
                ", batteryPower='" + batteryPower + '\'' +
                '}';
    }
}
