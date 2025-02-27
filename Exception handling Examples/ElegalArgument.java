package com.com.exception.test;
import java.util.Scanner;
public class ElegalArgument {

    public String intro() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your name : ");
            String name = input.next();
            System.out.print("Name = " + name);
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name is Empty");
            }
            if (name.equals(String.valueOf(name))) {
                throw new IllegalArgumentException("int is not allowed");
            }
            return name;
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception handled = " + e.getMessage());
        return null;
        }
    }
    public static void main(String [] args){
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite Number : ");
        int num = input.nextInt();}
        catch (IllegalArgumentException e) {
            System.out.println("Exception handled " + e.getMessage());
        }
        ElegalArgument elegalArgument = new  ElegalArgument();
        elegalArgument.intro();
    }
}
