import java.util.*;
class factorsCountingInArray {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] num = new int[5];
for(int i=0; i<num.length; i++){
System.out.print("Enter The value of "+i+" Index : ");
num [i] = s.nextInt();
}
for(int n=0; n<num.length; n++){
System.out.println("Factors of " + num[n] + " are:");
for(int i=1; i<=num[n]; i++){
if(num[n] % i == 0){
System.out.println("Factors are "+i);
}
}
System.out.println();
}
}
}