import java.util.Scanner;
class GradingSystem {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter Name ");
String name = s.next();
System.out.print("Enter Your marks (1-100) = ");
int marks = s.nextInt();
System.out.println(name+" Your marks is = "+marks);
if(marks >= 89 && marks <= 100){
System.out.println("your grade is (A)+ ");
}
else if(marks >= 79 && marks <= 90){
System.out.println("Your grade is (A)- ");
}
else if(marks >= 79 && marks <= 90){
System.out.println("Your grade is (B)+ ");
}
else if(marks >= 69 && marks <= 80){
System.out.println("Your grade is (B)- ");
}
else if(marks >= 59 && marks <= 70){
System.out.println("Your grade is (C)+ ");
}
else if(marks >= 49 && marks <= 60){
System.out.println("Your grade is (C)- ");
}
else if(marks >= 1 && marks <= 50){
System.out.println("Your grade is F ");
System.out.println("Try Next Time ");
}
else{
System.out.println("This is not a marks Range");
System.out.println("Marks Range is Under 100 OR equal 100");
}
s.close();
}
}


