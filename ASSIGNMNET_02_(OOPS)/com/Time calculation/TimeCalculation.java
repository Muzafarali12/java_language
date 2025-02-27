package com;
import java.util.Scanner;
public class TimeCalculation {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time in Seconds.");
        int seconds = input.nextInt();
        int hour = seconds/3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds/60;
        int second =  remainingSeconds/60;
        System.out.println("HH:MM:SS="+hour+":"+minutes+":"+second);
    }
}
