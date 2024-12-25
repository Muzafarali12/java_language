import java.util.Scanner;
class BankAccount{
public int deposit(){
System.out.print("How much money you want to deposit in your account. ");
Scanner s = new Scanner(System.in);
int depositMoney = s.nextInt();
System.out.println("Your account balance is : "+depositMoney);

int currentBalance = 0;
if(depositMoney > 100){
currentBalance += depositMoney;
System.out.println("Transection is possible. ");

}
return currentBalance;
}

public void withdraw(){
System.out.println("much money you want to withdraw from your account. ");
Scanner s = new Scanner(System.in);
int withdrawMoney = s.nextInt();
System.out.print("You want to : "+withdrawMoney+" withdraw from your account.  ");
}
}


class SavingsAccount extends BankAccount{
public void withdraw(){
System.out.println("How much money you want to withdraw from your account. ");
Scanner s = new Scanner(System.in);
int withdrawMoney = s.nextInt();
System.out.println("You want to : "+withdrawMoney+" withdraw from your account.  ");
if(withdrawMoney >= 100){
System.out.println("Transection is not possible Minimum transection possible is grater than 100");
}
}
}
public class Bank {
public static void main(String [] args){
BankAccount b = new BankAccount();
b.deposit();
SavingsAccount s = new SavingsAccount();
s.withdraw();
}
}
