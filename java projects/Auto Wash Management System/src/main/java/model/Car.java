package model;

public class Car {
	private int carEngineNumber;
	private String name;
	private String model;
	private String color;
	private String bodyType;
	private String company;
	
	public Car() {
		
	}
	
	public Car(int carEngineNumber, String name, String model, String color, String bodyType, String company) {
		this.carEngineNumber = carEngineNumber;
		this.name = name;
		this.model = model;
		this.color = color;
		this.bodyType = bodyType;
		this.company = company;
	}
	
	public int getCarEngineNumber() {
		return carEngineNumber;
	}
	public void setCarEngineNumber(int carEngineNumber) {
		this.carEngineNumber = carEngineNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
