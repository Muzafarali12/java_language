import java.util.Scanner;
class Shape {
public void getArea(){
System.out.println("Enter a Value. ");
}
}
class Rectangle extends Shape{
public void getArea(){
Scanner s = new Scanner(System.in);
System.out.print("Eneter a length for finding Your Rectangle Area. ");
int length = s.nextInt();
System.out.print("Eneter a Width of Your Rectangle. ");
int width = s.nextInt();
System.out.println("Result : "+(length * width)+"Meter");
}
}
public class Main {
public static void main(String [] args){
Rectangle r = new Rectangle();
r.getArea();
}
}