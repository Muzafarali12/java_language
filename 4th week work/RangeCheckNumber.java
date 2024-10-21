import java.util.Scanner;
class RangeCheckNumber {
public static void main (String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter A Number To Ckeck range: ");
int giveNumber = s.nextInt();
System.out.println("Number is = "+giveNumber);
if(giveNumber <= 50 && giveNumber >= 10){
System.out.println("The Number range is in (10-50)");
}
else if (giveNumber < 10 && giveNumber >= 1){
System.out.println("The number range is in (1-10)");
}
else if (giveNumber < 0){
System.out.println("The number range is Negative Numbers");
}
else if (giveNumber == 0){
System.out.println("The number range is = ZERO");
}
else {
System.out.println("The number is not in Range of (10-50)");
}
}
}
