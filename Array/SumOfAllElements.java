import java.util.*;
class SumOfAllElements {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int num [] = new int[5];
int result = 0;
for(int i=0; i<num.length; i++){
System.out.print("Enter "+i+" : value = ");
num[i] = s.nextInt();
result += num[i];
}
System.out.println("Sum of loop "+result);
}
}