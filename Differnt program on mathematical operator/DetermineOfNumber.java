import java.util.Scanner;
class DetermineOfNumber {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a Number for Check is number (Positive) (Negative)  OR (Zero) ");
int number = s.nextInt();
System.out.println("This is a number = "+number);
if(number < 0 ){
System.out.println("Number is Negative");
}
else if(number == 0 ){
System.out.println("Number is Zero");
}
else {
System.out.println("Number is Positive");
}
}
}