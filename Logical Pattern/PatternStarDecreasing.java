import java.util.Scanner;
class PatternStarDecreasing {
public static void main(String [] args){
System.out.print("Enter a number = ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for (int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println("  ");
}
}
}