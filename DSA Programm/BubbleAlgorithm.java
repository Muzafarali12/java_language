import java.util.*;
class BubbleAlgorithm {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] array = new int[4];
for(int v=0; v<array.length; v++){
System.out.print("Enter a Number on "+v+" index : ");
array[v] = s.nextInt();
}
for(int i=0; i<array.length;i++){
for(int j=i+1;j<array.length;j++){
if(array[i] > array[j]){
int now = array[i];
array[i] = array[j];
array[j] = now;
}
}
System.out.print(array[i]+" ");
}    
}
}