package com.tollbooth.main;
import java.util.Scanner;
public class Tollbooth {
    private int cars;
    private double collectedMoney;
    private int totalCars;

    public void payingCar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Number of Cars = ");
        cars = input.nextInt();
        System.out.print("Enter total Car Number tax payed car Number = ");
        totalCars = input.nextInt();
        collectedMoney = totalCars * 0.50;
    }
    public void nonPayingCar(){
          int totalNonPayingCars = cars - totalCars;
          System.out.println("Total Cars "+cars);
        System.out.println("Total collected Money of tax Paying Car's is  = "+collectedMoney+"PKR");
        System.out.println("Your total Non paying Car Number is."+totalNonPayingCars);
    }
    public void display(){
        payingCar();
        nonPayingCar();
    }

    public static void main(String [] args){
        Tollbooth tollbooth = new Tollbooth();
        tollbooth.display();
    }

}
