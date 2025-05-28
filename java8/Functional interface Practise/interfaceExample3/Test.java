/*package com.java8.interfaceExample3;

public class Test {
    public static void main(String [] args){
        TestFunctionalInterface3 testFunctionalInterface3 = ()->{
            int[] numberss = {121,654,876,987,984,878};
            for(int i = 0; numberss.length; i++){
                int numbers = 0;
                int originalNumber = numberss[i];
                while(numberss[i] > 0){
                    int r = numberss[i] % 10;
                    numbers = numbers * 10 + r;
                    numberss[i] = numberss[i] / 10;
                }
                if(originalNumber == numbers){
                    System.out.println("This is Palindrom Number : "+numbers);
                }
                else {
                    System.out.println("Thear is no palindrom Number ");
                }
            }
        };
        testFunctionalInterface3.palindromNumber();
    }
}


 */