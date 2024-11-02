import java.util.Scanner;
class PatternSecond {
public static void main(String [] args){
System.out.println("Enter a number = ");
Scanner s = new Scanner(System.in);
int n;
int l;
int num = s.nextInt();
for(int i=1; i<=num;i++){
n = i*i;
l = n*n;
System.out.println(n+"  "+l);
}
}
}
