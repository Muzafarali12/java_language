import java.util.Scanner;
class Person{
public void getFirstName(){
Scanner s = new Scanner(System.in);
System.out.print("Enter your first Name == ");
String fname = s.next();
}
public void getLastName(){
Scanner s = new Scanner(System.in);
System.out.print("Enter your Last Name == ");
String lname = s.next();
}
}
class Employee extends Person{
public void getEmployeeId(){
Scanner s = new Scanner(System.in);
System.out.print("Enter your ID : ");
int id = s.nextInt();
}
public void getLastName(){
Scanner s = new Scanner(System.in);
System.out.print("Enter your job title == ");
String lname = s.next();
}
}
public class IntroductionMain{
public static void main(String [] args){
Person p = new Person();
p.getFirstName();
Employee e = new Employee();
e.getEmployeeId();
e.getLastName();
}
}