import java.util.Scanner;
class NumberGuesingGame {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter Your Name");
String name = s.next();
System.out.println(name+" Suggested Number is (2,3,4,5,6,7,11,12,13,14,20,30) what you want ");
int guess = s.nextInt();


// for (2,3,4,5)
if(guess == 2 || guess == 3){
System.out.println("Congratulation you win 2 Apples ");
}
else if(guess == 4 || guess == 5){
System.out.println("Congratulations you win 3 Mangoes");

}
// for (6,7)
else if(guess == 6 || guess == 7){
System.out.println("Congratulation you win Bike");
}

// for (11,12)
else if(guess == 11 || guess == 12){
System.out.println("Congratulation you win 100 Rupees");
}

// for (13,14)
else if(guess == 13 || guess == 14){
System.out.println("Congratulation you win 200 Rupees");
}


// for (20,30)
else if(guess == 20 || guess == 30){
System.out.println("Congratulation you win 300 Rupees");
}
else{
System.out.println("Your choose wrong number");
System.out.println("play next time ");
}
}
}


