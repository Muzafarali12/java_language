import java.util.*;
class DuplicateChecker {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] Array = new int[5];
for(int i=0; i<Array.length; i++){
System.out.print("Enter Your Number on : "+i+" index "); 
Array[i] = s.nextInt();
}
for(int l=0; l<Array.length; l++){
for(int k=l+1; k<Array.length; k++){
if(Array[l] == Array[k]){
System.out.println("duplicate number is = "+Array[l]);
}
}
}
}
} 