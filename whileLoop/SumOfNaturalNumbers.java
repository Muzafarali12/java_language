import java.util.Scanner;
class SumOfNaturalNumbers {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter any of Ending Number of Natural Numbers: ");
int n = s.nextInt();
int S = 0;
int i=1;
while(i<=n){
S += i;
System.out.println("Natural Numbers ="+i);
i++;
}
System.out.println("The Addision of your Natural Numbers  = " + S);
}
}
