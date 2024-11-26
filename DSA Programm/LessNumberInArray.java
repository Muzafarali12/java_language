import java.util.*;
class LessNumberInArray {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] array = new int[5];
for(int i=0; i<array.length;i++){
System.out.print("Enter a value on "+i+" index : ");
array[i] = s.nextInt();
}
int l = array[0];
for(int i=1; i<array.length; i++){
if(array[i] < l){
l = array[i];
}
}
System.out.println("Your Lest Number is : "+l);
}
}



 