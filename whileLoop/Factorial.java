import java.util.Scanner;
class Factorial {
public static void main(String [] args){ 
Scanner s = new Scanner(System.in);
System.out.println("Enter a Factorial Number: ");
int factorial = 1;
int num = s.nextInt();
int i = num;
while(i>0){
factorial *= i;
i--;
}
System.out.println("Factorial of " + num + " = " + factorial);
}
} 