package com;
import java.util.Scanner;

public class Calculator {

    private Scanner sc;

    public Calculator(Scanner sc){
        this.sc = sc;
    }

    public void addition() {
        System.out.print("Enter First Number = ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int num2 = sc.nextInt();
        System.out.println("Answer = "+(num + num2));
    }

    public void subtraction() {
        System.out.print("Enter First Number = ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int num2 = sc.nextInt();
        System.out.println("Answer = "+(num - num2));
    }

    public void multiplication() {
        System.out.print("Enter First Number = ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int num2 = sc.nextInt();
        System.out.println("Answer = "+(num * num2));
    }

    public void division() {
        System.out.print("Enter First Number = ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int num2 = sc.nextInt();
        System.out.println("Answer = "+(num & num2));
    }

    public void collOtherMethod() {
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Reminder");
        System.out.print("What you Perform. Enter Your Choice = ");
        int choice = sc.nextInt();
        if (choice == 1) {
            addition();
        } else if (choice == 2) {
            subtraction();
        } else if (choice == 3) {
            multiplication();
        } else if (choice == 4) {
            division();
        } else {
            System.out.println("You Choice Wrong Number. ");
        }
        System.out.println("Would you like to continue program! (Yes or No)");
        String Choice = sc.next();
        if (Choice.equals("Yes")) {
            collOtherMethod();
        } else {
            System.out.println("Thank You! ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator(sc);
        c.collOtherMethod();

    }
}

