package com;
import java.util.Scanner;

public class FractionsCalculator {
    private Scanner sc;

    public FractionsCalculator(Scanner sc){
        this.sc = sc;
    }
    //public void numberTaker()
    public void addition(){
        System.out.print("Enter A : ");
        double a = sc.nextInt();
        System.out.print("Enter B : ");
        double b = sc.nextInt();
        System.out.print("Enter C : ");
        double c = sc.nextInt();
        System.out.print("Enter D : ");
        double d = sc.nextInt();
        double add = a/b + c/d;
       System.out.println("Addition: "+add);
    }
    public void subtraction(){
        System.out.print("Enter A : ");
        double a = sc.nextInt();
        System.out.print("Enter B : ");
        double b = sc.nextInt();
        System.out.print("Enter C : ");
        double c = sc.nextInt();
        System.out.print("Enter D : ");
        double d = sc.nextInt();
        double sub =  a/b - c/d;
        System.out.println("Subtraction: "+sub);
    }

    public void multiplication(){
        System.out.print("Enter A : ");
        double a = sc.nextInt();
        System.out.print("Enter B : ");
        double b = sc.nextInt();
        System.out.print("Enter C : ");
        double c = sc.nextInt();
        System.out.print("Enter D : ");
        double d = sc.nextInt();
        double mul = a/b * c/d;
        System.out.println("Multiplication: "+mul);
    }
    public void division(){
        System.out.print("Enter A : ");
        double a = sc.nextInt();
        System.out.print("Enter B : ");
        double b = sc.nextInt();
        System.out.print("Enter C : ");
        double c = sc.nextInt();
        System.out.print("Enter D : ");
        double d = sc.nextInt();
        double div = a/b + c/d;
        System.out.println("Division: "+div);
    }

    public void collOtherMethod() {
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Reminder");
        System.out.print("What you Perform. Enter Your Choice = ");
        String choice = sc.next();
        if(choice.equals("1")) {
            addition();
        }
        else if (choice.equals("2")) {
            subtraction();
        }
        else if (choice.equals("3")) {
            multiplication();
        }
        else if (choice.equals("4")) {
            division();
        } else {
            System.out.println("You Choice Wrong Number.");
        }

        System.out.println("You Want to another calculation");
        String Choice = sc.next();
        if (Choice.equals("Y")){
            collOtherMethod();
        }
        else{
            System.out.println("Thank You");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        FractionsCalculator f = new FractionsCalculator(sc);
        f.collOtherMethod();

    }
}
