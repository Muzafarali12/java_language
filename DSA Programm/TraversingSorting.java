import java.util.*;
class BubbleSorting {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
System.out.print("Enter a number on "+i+" index : ");
arr[i] = s.nextInt();
}
for(int i=0; i<arr.length; i++){
for(int j=i+1; j<arr.length; j++){
if(arr[j] > arr[i]){
int start = arr[i];
arr[i] = arr[j];
arr[j] = start;
}
}
System.out.print(arr[i]+" ");   
}
}
} 