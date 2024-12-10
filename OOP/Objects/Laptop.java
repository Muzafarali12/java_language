class Laptop {
String name;
String color;
String model;
int price;

public void pcColor(String color){
if(color.equals("White")){
System.out.println("Your laptop color "+color+" try to protect from Scratch.");
}
else if(color.equals("Black")){
System.out.println("Your laptop color "+color+" this is hard color.");
}
else if(color.equals("Blue")){
System.out.println("Your laptop color "+color+" this is hard and cool color.");
}
else{
System.out.println("Your laptop color "+color+" this is not good color.");
}
}

public void taxCharging(int price){
int sum = (price * 10) / 100;
System.out.println("On Lap Top 10% tax apply And total tax : "+sum);
}

public static void main(String [] args){

Laptop HP = new Laptop();
HP.name = "HP laptop";
HP.color = "White";
HP.model = "i-7 (8)Generation";
HP.price = 80000;

Laptop Dell = new Laptop();
Dell.name = "Dell-Laptop";
Dell.color = "Black";
Dell.model = "I-5 (6)Genertaion";
Dell.price = 50000;

Laptop Lenovo = new Laptop();
Lenovo.name = "Lenovo-Laptop";
Lenovo.color = "Yellow";
Lenovo.model = "i-5 (7)Generation";
Lenovo.price = 40000;

Laptop Mac = new Laptop();
Mac.name = "Mac-iphone";
Mac.color = "White";
Mac.model = "2019";
Mac.price = 300000;

Laptop Delll = new Laptop();
Delll.name = "Dell-Laptop";
Delll.color = "Black";
Delll.model = "i-6 (8)Geaneratin";
Delll.price = 50000;

System.out.println("<<<<< Laptop >>>>>");
System.out.println("");
System.out.println("Name = "+HP.name);
System.out.println("Color = "+HP.color);
System.out.println("Model = "+HP.model);
System.out.println("Price = "+HP.price);
HP.pcColor(HP.color);

System.out.println("");
System.out.println("Name = "+Dell.name);
System.out.println("Color = "+Dell.color);
System.out.println("Model = "+Dell.model);
System.out.println("Price = "+Dell.price);
Dell.pcColor(Dell.color);
Dell.taxCharging(Dell.price);

System.out.println("");
System.out.println("Name = "+Lenovo.name);
System.out.println("Color = "+Lenovo.color);
System.out.println("Model = "+Lenovo.model);
System.out.println("Price = "+Lenovo.price);
Lenovo.pcColor(Lenovo.color);
Lenovo.taxCharging(Lenovo.price);

System.out.println("");
System.out.println("Name = "+Mac.name);
System.out.println("Color = "+Mac.color);
System.out.println("Model = "+Mac.model);
System.out.println("Price = "+Mac.price);
Mac.pcColor(Mac.color);
Mac.taxCharging(Mac.price);

System.out.println("");
System.out.println("Name = "+Delll.name);
System.out.println("Color = "+Delll.color);
System.out.println("Model = "+Delll.model);
System.out.println("Price = "+Delll.price);
Delll.pcColor(Delll.color);
Delll.taxCharging(Delll.price);
}
}