import java.util.Scanner;
class Calculator {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("1-Addition");
System.out.println("2-Subtraction");
System.out.println("3-Multiplication");
System.out.println("4-Division");
System.out.println("5-Modular");

System.out.println("Enter your choice: ");
String choice = s.next();

// This is for addition
if(choice.equals("1")){
System.out.println("Your choice is Addition = ");
System.out.print("First Number is: ");
int num1 = s.nextInt();
System.out.print("Second Number is: ");
int num2 = s.nextInt();
int addition = (num1 + num2);
System.out.println("Result of addition is ="+addition);
}

// This is for Subtraction
else if(choice.equals("2")){
System.out.println("Your choice is Subtraction = ");
System.out.print("First Number is: ");
int num1 = s.nextInt();
System.out.print("Second Number is: ");
int num2 = s.nextInt();
int subtraction = (num1 - num2);
System.out.println("Result of Subtraction of your Number is = "+subtraction);
}

// This is for Multipliaction
else if(choice.equals("3")){
System.out.println("Your choice is Multiplication = ");
System.out.print("First Number is: ");
int num1 = s.nextInt();
System.out.print("Second Number is: ");
int num2 = s.nextInt();
int multiplication = (num1 * num2);
System.out.println("Result of Multiplication of your number is = "+multiplication);
}

// This is for Division
else if(choice.equals("4")){
System.out.println("Your choice is Division = ");
System.out.print("First Number is: ");
double num1 = s.nextDouble();
System.out.print("Second Number is: ");
double num2 = s.nextDouble();
double division = (num1 / num2);
System.out.println("Result of Division of your number is = "+division);
}

// This is for modular
else if(choice.equals("5")){
System.out.println("Your choice is Modulas = ");
System.out.print("First Number is: ");
double num1 = s.nextDouble();
System.out.print("Second Number is: ");
double num2 = s.nextDouble();
double modular = (num1 % num2);
System.out.println("Result of solving of modular number is = "+modular);
}
else{
System.out.println("This is NOt a Calculator Number");
System.out.println("If you Want to Retry Then Enter");
System.out.println("For Addition Enter 1");
System.out.println("For Subtraction Enter 2");
System.out.println("For Multiplication Enter 3");
System.out.println("For Division Enter 4");
System.out.println("For Modular Enter 5");
}
}
}
