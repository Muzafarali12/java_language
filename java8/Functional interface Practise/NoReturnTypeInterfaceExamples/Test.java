package com.java8.NoReturnTypeInterfaceExamples;
import java.util.Scanner;
public class Test {
    public static void main(String []args){
        // lamda expression of revresing functional interface
        ReversingANumber testFunctionalInterface = ()->{
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
        //testFunctionalInterface.reverseOfNumber();

        // lamda expression of missing number functional interface
        MissingNumberFinding missingNumberFinding = ()->{
            int [] arr = {1,2,3,5,6,7,8};
            int N = 8;
            int sumExpected = N * (N + 1) / 2;
            int actualSum = 0;
            for (int num : arr){
                actualSum += num;
            }
            int missingNumber = sumExpected - actualSum;
            System.out.println("Missing Number : "+missingNumber);
        };
        //missingNumberFinding.missingNumberFindingInterface();

        // lamda expression of equal number finding functional interface
        DupliacteNumberFinding equalNumberFinding = ()->{
            int [] arr = {1,2,3,4,5,5};
            int N = 5;
            int sumExpected = N * (N + 1)/2;
            int actualSum = 0;
            for(int num : arr){
                actualSum += num;
            }
            int duplicate =  actualSum - sumExpected;
            System.out.println("Dupliacte Number is : "+duplicate);
        };
        //equalNumberFinding.equalNumber();

        //lamda expression for finding functional interface to finding second largest Number
        SecondLargestNumber secondLargestNumber = ()->{
            int [] arr = {11,22,33,44,55,66};
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arr){
                if (num > first){
                    second = first;
                    first = num;
                }
                else if (num > second && num != first){
                    second = num;
                }
            }
            if (second == Integer.MIN_VALUE){
                System.out.println("No Second largest Element.");
            }

            else {
                System.out.println("Second largest is : "+second);
            }
        };
        secondLargestNumber.findingSecondLargestNumber();

        // lamda expression for functional interface to reverse a array
        ReverseArrayOfNumbers reverseArrayOfNumbers = () -> {
            int[] Array = {321, 432, 543, 654, 876};
            for (int i = 0; i < Array.length; i++) {
                int originalNumber = Array[i];
                int number = 0;
                while (originalNumber > 0) {
                    int reverse = originalNumber % 10;
                    number = number * 10 + reverse;
                    originalNumber = originalNumber / 10;
                }
                System.out.print(" " + number);
            }
        };
        testFunctionalInterface.reverseArray();
    }

}
