import java.util.Scanner;
class SumOfNaturalNumbers {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter any of Ending Number of Natural Numbers: ");
int n = s.nextInt();
int S = 0;
for(int i=1; i<=n; i++){
S += i;
System.out.println("Natural Numbers ="+i);
}
System.out.println("The Addision of your Natural Numbers  = " + S);
}
}
