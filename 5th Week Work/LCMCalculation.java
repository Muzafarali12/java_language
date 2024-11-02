import java.util.Scanner;
class LCMCalculation {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a Number which you want to caculatae LCM = ");
int n = s.nextInt();
System.out.println("You enter a Number ="+n);
// int divider = 2;
for(int i=1;i<=n;i++){
int result = n/i;
System.out.println(result);
}
}
}
