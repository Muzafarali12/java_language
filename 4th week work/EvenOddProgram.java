import java.util.Scanner;

class EvenOddProgram {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Who are You ?");
String name =s.next();
System.out.println("ok = "+name);
System.out.println("Eneter A Number for check Even or odd = ");
int number = s.nextInt();
System.out.println("This is Your Number = "+number);

if(number%2 == 0){
System.out.println(number+" is Even number.");
}
else {
System.out.println(number+" is odd number.");
}
}
}