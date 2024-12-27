import java.util.Scanner;
class vehicle{
String make; 
int model;
int year; 
int fuel;
}
class Truck extends vehicle{
public int fuelefficiency(){
Scanner sc = new Scanner(System.in); 
System.out.println(" ");
System.out.println(" ");
System.out.println("		this is for check fuel efficiency. ");
System.out.print("how much leters you take in your Truck : ");
fuel = sc.nextInt();
int range = fuel * 80;
System.out.println("Your truck give : "+range+"km. ");
System.out.println("Your truck take "+(range / fuel)+" per leter.");
return range;
}
}
class Car extends vehicle{
public int distancetraveled(){
Scanner s = new Scanner(System.in);
System.out.println(" ");
System.out.println(" ");
System.out.println("		this is for finding traveled distance. ");
System.out.print("how many leters take your Car today : ");
int leter = s.nextInt();
int sum = leter * 80;
System.out.println("To day your Car travel  : "+sum+"km distance");
model = 2022;
System.out.println("Your car model is. "+model);
return sum;
}
}
class Motorcycle extends vehicle{
public void maximumspeed(){
Scanner sc = new Scanner(System.in);
System.out.println(" ");
System.out.println(" ");
System.out.println("		this is for check maximum range of speed according to time. ");
System.out.print("Enter  your travel route distance :");
int rout = sc.nextInt();
System.out.print("Enter  your time that you want to reach your destination :");
int time = sc.nextInt();
int distance = rout / time;
System.out.println("You can drive maximum Speed of : "+distance+"km per hour.");
}
}
public class YourRideRecord {
public static void main(String [] args){
Truck t = new Truck();
t.fuelefficiency();
Car c = new Car();
c.distancetraveled();
Motorcycle m = new Motorcycle();
m.maximumspeed();
}
}
 