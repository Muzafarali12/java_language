import java.util.Scanner;
class LargestProviencePakistan{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to check biggest continent: ");
int provience = s.nextInt();
switch(provience){
case 1:
System.out.println("Baloshitan is biggest provience in pakistan");
break;
case 2:
System.out.println("Punjab is 2nd largest provience of pakistan");
break;
case 3:
System.out.println("Sindh is 3rd largest provience of pakistan");
break;
case 4:
System.out.println("KPK is smallest provience of pakistan ");
break;
default:
System.out.println("Enter a valid number becasue pakistan only (4) provience");
}
}
}