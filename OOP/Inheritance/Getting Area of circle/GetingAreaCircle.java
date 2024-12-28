import java.util.Scanner;
class Shape{
public double getPerimeter(Scanner s){
System.out.print("Enter your perimeter Size :");
double perimeter = s.nextDouble();
return perimeter;
}
public double getArea(Scanner s){
System.out.print("Enter your Area Size :");
double area = s.nextDouble();
return area;
}
}
class Circle extends Shape{
public double getPerimeter(Scanner s){
System.out.print("Enter Size of a diameter :");
double d = s.nextDouble();
double c = (2)* (22.0/7) * (d);
System.out.println("Perimeter of a circle is = "+c);
return d;
}
public double getArea(Scanner s){
System.out.print("Enter radius of circle: ");
double r = s.nextDouble();
double rr = r*r;
double a = (22.0/7) * (rr);
System.out.println("Area of a circle is = "+a);
return a;
}
}
public class GetingAreaCircle {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
Circle c = new Circle();
double perimeter = c.getPerimeter(s);
double area = c.getArea(s); 
}
}