class Bike {
String name;
int model;
String color;
int price;


public void discount(int price){
int sum = price - (price * 5 / 100);
System.out.println("If you pay at a time you have 5% discount  : "+sum);
}

public void installment(int price){
int total = price/5;
System.out.println("If you want Installment In Each Month you Pay : "+total+" Installment. ");
}


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
OTF.installment(OTF.price);

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
System.out.println("Model = "+Honda.model);
System.out.println("Color = "+Honda.color);
System.out.println("Price = "+Honda.price);
Honda.installment(Honda.price);
Honda.discount(Honda.price);

System.out.println("");
System.out.println("Name = "+China.name);
System.out.println("Model = "+China.model);
System.out.println("Color = "+China.color);
System.out.println("Price = "+China.price);
China.installment(China.price);
China.discount(China.price);

System.out.println("");
System.out.println("Name = "+OTF.name);
System.out.println("Model = "+OTF.model);
System.out.println("Color = "+OTF.color);
System.out.println("Price = "+OTF.price);
OTF.installment(OTF.price);
OTF.discount(OTF.price);

System.out.println("");
System.out.println("Name = "+Seventy.name);
System.out.println("Model = "+Seventy.model);
System.out.println("Color = "+Seventy.color);
System.out.println("Price = "+Seventy.price);
Seventy.installment(Seventy.price);
Seventy.discount(Seventy.price);

System.out.println("");
System.out.println("Name = "+Dhoom.name);
System.out.println("Model = "+Dhoom.model);
System.out.println("Color = "+Dhoom.color);
System.out.println("Price = "+Dhoom.price);
Dhoom.installment(Dhoom.price);
Dhoom.discount(Dhoom.price);

}
}