package com.java8.interfaceExample2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TestFunctionalInterface testFunctionalInterface = () -> {
            //Scanner input = new Scanner(System.in);
            //System.out.print("Enter Array Number : ");
            int[] Array = {321, 432, 543, 654, 876};

            for (int i = 0; i < Array.length; i++) {
                int originalNumber = Array[i];
                int number = 0;
                while (Array[i] > 0) {
                    int reverse = Array[i] % 10;
                    number = number * 10 + reverse;
                    Array[i] = Array[i] / 10;
                }
                System.out.print(" " + Array[i]);
            }
        };
        testFunctionalInterface.arrayReversing();
    }
}
