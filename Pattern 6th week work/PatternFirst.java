import java.util.Scanner;
class PatternFirst {
public static void main(String [] args){
System.out.println("Enter a number = ");
Scanner s = new Scanner(System.in);
int num = s.nextInt();
for(int i=1; i<=num;i++){
System.out.println(i+"  "+"  * "+i*5);
}
}
}
