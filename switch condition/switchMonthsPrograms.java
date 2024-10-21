import java.util.Scanner;
class switchMonthsPrograms{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a Number to Check Month(1-12) ");
int month = s.nextInt();
switch(month){
case 1:
System.out.println("its january ");
break;
case 2:
System.out.println("its Feburary ");
break;
case 3:
System.out.println("its March ");
break;
case 4:
System.out.println("its April ");
break;
case 5:
System.out.println("its May ");
break;
case 6:
System.out.println("its June ");
break;
case 7:
System.out.println("its July ");
break;
case 8:
System.out.println("its August ");
break;
case 9:
System.out.println("its September ");
break;
case 10:
System.out.println("its Octomber ");
break;
case 11:
System.out.println("its November ");
break;
case 12:
System.out.println("its December ");
break;
default:
System.out.println("Enter a correct in range(1-12)");
}
}
}