class Bike {
String name;
int model;
String color;
int price;
public static void main(String [] args){

Bike Honda = new Bike();
Honda.name = "Honda-CD";
Honda.model = 2019;
Honda.color = "Black";
Honda.price = 130000;

Bike China = new Bike();
China.name = "Crown";
China.model = 2020;
China.color = "Red";
China.price = 75000;

Bike OTF = new Bike();
OTF.name = "1-2-5";
OTF.model = 2021;
OTF.color = "Black";
OTF.price = 200000;

Bike Seventy = new Bike();
Seventy.name = "Honda-Seventy";
Seventy.model = 2022;
Seventy.color = "Black";
Seventy.price = 170000;

Bike Dhoom = new Bike();
Dhoom.name = "Dhoom-5";
Dhoom.model = 2023;
Dhoom.color = "Green";
Dhoom.price = 300000;

System.out.println("<<<<< Bike >>>>>");
System.out.println("");
System.out.println("Name = "+Honda.name);
System.out.println("Name = "+Honda.model);
System.out.println("Name = "+Honda.color);
System.out.println("Name = "+Honda.price);

System.out.println("");
System.out.println("Name = "+China.name);
System.out.println("Name = "+China.model);
System.out.println("Name = "+China.color);
System.out.println("Name = "+China.price);

System.out.println("");
System.out.println("Name = "+OTF.name);
System.out.println("Name = "+OTF.model);
System.out.println("Name = "+OTF.color);
System.out.println("Name = "+OTF.price);

System.out.println("");
System.out.println("Name = "+Seventy.name);
System.out.println("Name = "+Seventy.model);
System.out.println("Name = "+Seventy.color);
System.out.println("Name = "+Seventy.price);

System.out.println("");
System.out.println("Name = "+Dhoom.name);
System.out.println("Name = "+Dhoom.model);
System.out.println("Name = "+Dhoom.color);
System.out.println("Name = "+Dhoom.price);

}
}