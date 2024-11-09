import java.util.Scanner;
class Factorial {
public static void main(String [] args){
System.out.println("Enter your factorial Number ");
Scanner s = new Scanner(System.in); 
int num = s.nextInt();
int factorial = 1;
for(int i = num; i > 0; i--){
factorial *= i;
}
System.out.println("Factorial of " + num + " = " + factorial);
}
}