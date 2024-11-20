import java.util.Scanner;
class PatternFourth {
public static void main(String [] args){
System.out.println("Enter a number = ");
Scanner s = new Scanner(System.in);
int l = 0;
int num = s.nextInt();
for(int i=num; i>0;i-=2){
l++;
System.out.println(i+"  "+l);
}
}
}
