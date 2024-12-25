import java.util.Scanner;
class Employee{
public void work(){
Scanner s = new Scanner(System.in);
System.out.println("Enter your accupation. ");
String accupation = s.next(); 
}
public void getSalary(){
Scanner s = new Scanner(System.in);
System.out.print("Eneter Your Salary. ");
int salary = s.nextInt();
}
} 
class HRManager extends Employee {
public void work(){
Scanner s = new Scanner(System.in);
System.out.println("Enter your accupation. ");
String accupation = s.next(); 
}
public void addEmployee(){
Scanner s = new Scanner(System.in);
System.out.println("Enter your new Employee name. ");
String name = s.next();
System.out.println("Thanks for your time. ");
}
}
public class Main{
public static void main(String [] args){
HRManager h = new HRManager();
h.work();
h.addEmployee();
}
}

 