package com.java8.ReturnTypeInterfaceExamples.TestFunctionalInterfaceExamples;

import java.util.Scanner;

public class Test {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //lamda expression for functional interface to get petrol price
        PetrolPriceCalculate t1 = () -> {
            System.out.print("How many liters do you want: ");
            int liter = input.nextInt();
            input.nextLine();
            int price = 257; // Price per liter
            return liter * price;
        };

        float literPrice = t1.petrolPrice(); // Capture petrol price
        //input.close(); // Close the scanner

        // Calculate total price including distance
        float totalPrice = priceCalculation(literPrice, 560);

        // Display the details
        display(literPrice, totalPrice);

        //-----------------------------------------------lamda expression --------------------------------
        ObjectReturning objectReturning = ()->{
            System.out.print("Enter Your full Name : ");
            String name = input.nextLine();
            return name;
        };
        String fullName = objectReturning.getName();
        System.out.println("Full Name of User is : "+fullName);

        //-----------------2nd lamda expresion of object returning Interface for geting age
        ObjectReturning objectReturning1 = ()->{
            System.out.print("Enter Your Age : ");
            String age = input.nextLine();
            return age;
        };
        String age = objectReturning1.getName();
        System.out.println("Age of user is : "+age);
    }

    // Method to calculate price based on distance
    public static float priceCalculation(float literPrice, float distance) {
        float totalPrice = (distance * 2) + literPrice;
        return totalPrice;
    }

    // Method to display the details
    public static void display(float literPrice, float totalPrice) {
        System.out.println("PSO-Main Pump");
        System.out.println("Price of petrol without distance: " + literPrice);
        System.out.println("Total price including distance: " + totalPrice);
        }


    }

