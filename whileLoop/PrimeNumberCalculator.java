import java.util.Scanner;
class PrimeNumberCalculator {
public static void main(String [] args){
System.out.println("Enter a number you want to check is prime number and Which Numbers are Their prime factors: ");
Scanner s = new Scanner(System.in);
int count = 1;
int num = s.nextInt();
int i=1;
while(i<=num){
i++;
if(num%i == 0){
System.out.println(i);
count++;
}
}
System.out.println(count);
if(count == 2){
System.out.println("The number is prime Number: "+num);
}
else{
System.out.println("Number is Not a prime Number: "+num);
}
}
}