import java.util.Scanner;
class PatternDecrease {
public static void main(String [] args){
System.out.print("Enter a number = ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for (int i=n;i>=1;i--){
for(int j=5;j>=i;j--){
System.out.print(i);
}
System.out.println("  ");
}
}
}
