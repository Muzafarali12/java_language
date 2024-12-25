class Driven{
public void drive(){
System.out.println("Repairing a Car.");
}
}
class Car extends Driven{
public void drive(){
System.out.println("Repairing a Car.");
}
}
public class Vehicle {
public static void main(String [] args){
Car c = new Car();
c.drive();
}
}
