import java.util.*;
class GreaterNumberInArray {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int [] Aray = new int[5];
for(int i=0; i<Aray.length; i++){
System.out.print("Enter a Number on "+i+" Index : ");
Aray[i] = s.nextInt();
}
int G = Aray[0];
for(int i=1; i<Aray.length; i++){
if(Aray[i] > G){
G = Aray[i];
}
}
System.out.println("Greater Number in your Aray is "+G);
}
}




 