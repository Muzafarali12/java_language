import java.util.Scanner;
class NamazprayingSwitchProgrm{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to check which one is first (1-5) ");
int namaz = s.nextInt();
switch(namaz){
case 1:
System.out.println("Fajur is pray first in a day ");
break;
case 2:
System.out.println("Zuhur is pray after Fajur ");
break;
case 3:
System.out.println("Esur is pray after Zuhur ");
break;
case 4:
System.out.println("Magrib is pray after Esur ");
break;
case 5:
System.out.println("Eshha is pray after magrib ");
break;
default:
System.out.println("The only 5 times Namaz is praying in a day");
}
}
}
