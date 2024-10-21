import java.util.Scanner;
class khulfaeRashideenNumber{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to check khilafat(1-4)");
int khalifa = s.nextInt();
switch(khalifa){
case 1:
System.out.println("Hazrat Abu Bakar is first khalifa of islam");
break;
case 2:
System.out.println("Hazrat Umer Farooq is Second Khalifa of islam");
break;
case 3:
System.out.println("Hazrat Usman Ghani is 3rd khalifa of islam");
break;
case 4:
System.out.println("Hazrat Ali is 4th khalifa of islam");
break;
default:
System.out.println("enter number only in range(1-4)");
}
}
}

