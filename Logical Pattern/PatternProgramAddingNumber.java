import java.util.Scanner;
class PatternProgramAddingNumber {
public static void main(String [] args){
System.out.print("Enter a number = ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for (int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println("  ");
}
}
}
