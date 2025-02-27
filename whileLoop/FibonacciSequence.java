import java.util.Scanner;
class FibonacciSequence {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("Eneter A Fibonacci Sequence Ending Number: ");
int num = s.nextInt();
int first = 0; 
int second = 1;
int next;
next = first + second;
int i=0;
while(i<=num){
i++;
first = second;
second = next;
next = first + second;
System.out.print(first+" ");
}
}
}

 