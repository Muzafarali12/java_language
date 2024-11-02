import java.util.Scanner;
class FibonacciSequence {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter A Fibonacci Sequence Ending Number: ");
int num = s.nextInt();
int first = 1; 
int second = 1;

int next;
next = first + second;
for(int i=1; i<=num;i++){
first = second;
second = next;
next = first + second;
// switch (FibonacciSequence){
// case 70:
// System.out.println(next<=n);
// break;
// default:
// System.out.println("ok");
// }
}
if(i <= num){
break;
}
}
}
 