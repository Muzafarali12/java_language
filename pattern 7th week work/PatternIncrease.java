import java.util.Scanner;
class PatternIncrease {
public static void main(String [] args){
System.out.print("Enter a number = ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for (int i=1;i<=n;i++){
for(int j=n;j>=i;j--){
System.out.print(i);
}
System.out.println("  ");
}
}
}
