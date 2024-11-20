import java.util.*;
class PrimeNumberInArray {
public static void main(String [] args){
Scanner m = new Scanner(System.in);
int array [] = new int[5];
for(int i=0; i<array.length; i++){
System.out.print("Enter a Number on : "+i+" index ");
array[i] = m.nextInt();
}

for(int n=0; n<array.length; n++){
int factor = 0;
System.out.println("Factors of : "+array[n]);
for(int i=1; i<=array[n]; i++){
if(array[n] % i == 0){
factor++;
System.out.println("Factor are : "+i);
}
}
if(factor == 2){
System.out.println("The number is PrimeNumber : "+array[n]);
//}
}
else if(factor > 2){
System.out.println("The Number is Not a Prime Number : "+array[n]);
}
}
}
}

