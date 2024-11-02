import java.util.Scanner;
class FactorialofaNumber {
public static void main(String []args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to check their Factors: ");
int num = s.nextInt();
int factorial = 1;
for(int i=1;i<=num;i++){
int product = i;
result = factorial*product;
}
System.out.println("The factoraial of" + num + "is" +factorial);
}
}

