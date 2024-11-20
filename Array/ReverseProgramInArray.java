import java.util.*;
class ReverseProgramInArray {
public static void main (String [] args){
Scanner s = new Scanner(System.in);
int [] Aray = new int[10];
for(int i=0; i<Aray.length; i++){
System.out.print("Eneter value for index "+i+" index : ");
Aray[i] =  s.nextInt();
}
for(int i=Aray.length-1; i>=0; i--){
System.out.println("Your Reversing value of : "+Aray[i]+" index : "+" on Index "+i);
}
}
}
