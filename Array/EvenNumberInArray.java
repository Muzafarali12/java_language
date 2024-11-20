import java.util.*;
class EvenNumberInArray {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int[] Aray = new int[5];
for(int i=0; i<Aray.length; i++){
System.out.print("Enter value for index "+i+" : ");
Aray[i]= s.nextInt();

           // ---------  This is for Even Number -------------//
if(Aray[i] % 2 == 0){
System.out.println("Number is Even Number "+Aray[i]);
}
}
}
}
