import java.util.Scanner;
class LeapYear {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter Year which you want to check is it a leap year = ");
int year = s.nextInt();
System.out.print(year);
if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
System.out.println(" This is a leap year");
}
else{
System.out.println(" This is not a leap year");
}
}
}