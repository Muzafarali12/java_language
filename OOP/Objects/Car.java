class Car {
String name;
int model;
int price;
String color;

public void calculateGovTax(int price){
double tax = price * 0.10;
double totalPrice = price + tax;
System.out.println("The price is : "+price+" but with Gov tax your price is : "+totalPrice);
}

public void zakat(int price){
if(price > 2000000){
double totalZakat = price * 0.025;
System.out.println("Faith of Isalm. And According to your record. you are eligiible for giving Zakat"+totalZakat);
}
else{
System.out.println("Faith of Isalm. And According to your record you are not eligiible for giving Zakat");
}
}

public static void main(String [] args){
Car Mehran = new Car();
Mehran.name = "Mehran";
Mehran.model = 2000;
Mehran.price = 2200000;
Mehran.color = "White";

Car Cultus = new Car();
Cultus.name = "Cultus";
Cultus.model = 2022;
Cultus.price = 2000000;
Cultus.color = "Black";

Car Vitz = new Car();
Vitz.name = "Vitz";
Vitz.model = 2000;
Vitz.price = 1500000;
Vitz.color = "Yellow";

Car Civic = new Car();
Civic.name = "Crolla-Vitz";
Civic.model = 2021;
Civic.price = 3000000;
Civic.color = "Black";

Car Pajero = new Car();
Pajero.name = "Z-Pajero";
Pajero.model = 2003;
Pajero.price = 1900000;
Pajero.color = "Blaack";



System.out.println("<<<<< Car Details >>>>>");

System.out.println("");

System.out.println("Name : "+Vitz.name);
System.out.println("Model : "+Vitz.model);
System.out.println("price : "+Vitz.price);
System.out.println("color : "+Vitz.color);
Vitz.calculateGovTax(Vitz.price);
Vitz.zakat(Vitz.price);

System.out.println("");

System.out.println("Name : "+Civic.name);
System.out.println("Model : "+Civic.model);
System.out.println("price : "+Civic.price);
System.out.println("color : "+Civic.color);
Civic.calculateGovTax(Civic.price);
Civic.zakat(Civic.price);

System.out.println("");

System.out.println("Name : "+Pajero.name);
System.out.println("Model : "+Pajero.model);
System.out.println("price : "+Pajero.price);
System.out.println("color : "+Pajero.color);
Pajero.calculateGovTax(Pajero.price);
Pajero.zakat(Pajero.price);

System.out.println("");

System.out.println("Name : "+Cultus.name);
System.out.println("Model : "+Cultus.model);
System.out.println("Price : "+Cultus.price);
System.out.println("color : "+Cultus.color);
Cultus.calculateGovTax(Cultus.price);
Cultus.zakat(Cultus.price);

System.out.println("");

System.out.println("Name : "+Mehran.name);
System.out.println("Model : "+Mehran.model);
System.out.println("Price : "+Mehran.price);
System.out.println("color : "+Mehran.color);
Mehran.calculateGovTax(Mehran.price);
Mehran.zakat(Mehran.price);
}
}

