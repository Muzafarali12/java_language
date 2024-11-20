import java.util.Scanner;
class checkNumLargest {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter numbers to Check which one is largest of three");
System.out.println("Eneter first Number");
int firstNumber = s.nextInt();
System.out.println("First Number = "+firstNumber);
System.out.println("Eneter Second Number");
int secondNumber = s.nextInt();
System.out.println("Seond Number = "+secondNumber);
System.out.println("Eneter Third Number");
int thirdNumber = s.nextInt();
System.out.println("ThirdNumber = "+thirdNumber);

// for first Number
if(firstNumber > secondNumber && firstNumber > thirdNumber){
System.out.println(firstNumber+" is greater then "+secondNumber+" and also "+thirdNumber);
}

// for Second Number
else if(secondNumber > firstNumber && secondNumber > thirdNumber){
System.out.println(secondNumber+" is greater then "+firstNumber+" and also "+thirdNumber);
}


// for Third Number
else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
System.out.println(thirdNumber+" is greater then "+firstNumber+" and also "+secondNumber);
}
}
}
