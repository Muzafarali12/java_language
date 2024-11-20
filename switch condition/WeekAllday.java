import java.util.Scanner;
class WeekAllday{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number(1-7) to check day");
int WeekAllday = s.nextInt();
switch(WeekAllday){
case 1:
System.out.println("its Monday");
break;
case 2:
System.out.println("its Tuesday");
break;
case 3:
System.out.println("its Wenesday");
break;
case 4:
System.out.println("its Thursday");
break;
case 5:
System.out.println("its Friday");
break;
case 6:
System.out.println("its Saturday");
break;
case 7:
System.out.println("its Sunday");
break;
default:
System.out.println("enter number only in range(1-7) because in a Week only 7 days");
}
}
}

