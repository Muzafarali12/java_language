package com.java8.interfaceExample1;
import java.util.Scanner;
public class Test {
    public static void main(String []args){
        TestFunctionalInterface testFunctionalInterface = ()->{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a Number That you want to Reverse : ");
            int number = input.nextInt();
            int reverse = 0;
            while (number > 0) {
                int reverser = number % 10;
                reverse = reverse * 10 + reverser;
                number = number / 10;
            }
            System.out.println("Reversed number is : "+reverse);
        };
        testFunctionalInterface.reverseOfNumber();
    }
}
