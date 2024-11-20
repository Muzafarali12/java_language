import java.util.Scanner;
class VotingSystem {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter Name");
String name = s.next();
System.out.println("Name of voter = "+name);
System.out.print("Enter a voter age to check for vote : ");
int age = s.nextInt();
System.out.print("voter age is = "+age);
if(age < 17){
System.out.println("This is not valid age for countig vote ");
}
if(age >= 18){
System.out.println(" This is a valid age for counting vote ");
}
else{
System.out.println("Enter The age");
}
}
}


