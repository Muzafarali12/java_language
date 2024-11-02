import java.util.Scanner;
class PatternThird {
public static void main(String [] args){
System.out.println("Enter a number = ");
Scanner s = new Scanner(System.in);
int num = s.nextInt();
int l = 0;
for(int i=num; i>0;i--){
l++;
System.out.println(i+"  "+l);
}
}
}
