import java.util.Scanner;
class FibonacciSequence {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter A Fibonacci Sequence Ending Number: ");
int num = s.nextInt();
int first = 0; 
int second = 1;

int next;
next = first + second;
for(int i=1; i<=num;i++){
first = second;
second = next;
next = first + second;
System.out.println(first);
}

}
}

 