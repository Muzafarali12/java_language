package com.com.exception.test;

public class Artithmettic {
    public static void main(String [] args ){
        try{
            int a = 30;
            int b = 0;
            double result = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled "+e.getMessage());
        }
        try{
            int c = 0;
            int d = 0;
            float f = c / d;
        }catch (ArithmeticException e) {
            System.out.println("Exeption handled "+e.getMessage());
        }
    }
}
