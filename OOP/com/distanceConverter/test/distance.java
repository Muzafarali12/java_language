package com.distanceConverter.test;
import java.util.Scanner;
public class distance {
    private int dis;
    public void takeInput(){
        //Scanner input = new Scanner(System.in);
        System.out.println("Enter Your distance");
        //double dis = input.nextInt();
    }
    public void conversion(){
        Scanner input = new Scanner(System.in);
        System.out.println("1- inch to Centimeters.");
        System.out.println("2- inch to Meters.");
        System.out.println("3- inch to Millimeters.");
        System.out.println("4- millimeters to Centimeters.");
        System.out.println("5- millimeters to Meters.");
        System.out.println("6- millimeters to kilometers.");
        System.out.println("7- kilometers to Meters.");
        System.out.println("8- kilometers to Centimeters.");
        System.out.println("9- kilometers to Millimeters.");
        System.out.println();
        System.out.println("What are Your choising conversion Enter Number.");
        String choice = input.next();
        double dis = input.nextInt();
        if(choice.equals("1")){
            takeInput();
            double itocm = (dis*2.54);
            System.out.println("Inch to Meter = "+itocm+"cm");
        }
        else if(choice.equals("2")){
            takeInput();
            double itom = (dis*0.0254);
            System.out.println("Inch to Meter = "+itom+"m");
        }
        else if(choice.equals("3")){
            takeInput();
            double itomm = (dis*25.4);
            System.out.println("Inch To Millimeters = "+itomm+"mm");
        }
        else if(choice.equals("4")){
            takeInput();
            double mmtoc = (dis*0.1);
            System.out.println("millimeters to Centimeters = "+mmtoc+"c" );
        }
        else if(choice.equals("5")){
            takeInput();
            double mmtom = (dis*0.001);
            System.out.println("millimeters to Meters = "+mmtom);
        }
        else if(choice.equals("6")){
            takeInput();
            double mmtok = (dis*0.000001);
            System.out.println("millimeters to kilometers = "+mmtok+"km");
        }
        else if(choice.equals("7")){
            takeInput();
            double ktom = (dis*1000);
            System.out.println("kilometers to Meters = "+ktom+"m");
        }
        else if(choice.equals("8")){
            takeInput();
            double ktocm = (dis*100000);
            System.out.println("kilometers to Centimeters = "+ktocm+"cm");
        }
        else if(choice.equals("9")){
            takeInput();
            double ktomm = (dis*1000000);
            System.out.println("kilometers to Millimeters = "+ktomm+"mm");
        }
    }
    public static void main(String [] args){
        //Scanner input = new Scanner(System.in);
        distance dd = new distance();
        dd.conversion();
    }
}
