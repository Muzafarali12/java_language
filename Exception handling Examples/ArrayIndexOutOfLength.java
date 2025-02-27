package com.com.exception.test;

public class ArrayIndexOutOfLength {
    public static void main(String [] args){
        try{
            int[] arr = {1,3,4,5};
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception handled = "+e.getMessage());

        }
        try{
            int[] arr = new int[5];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception handled = "+e.getMessage());

        }
    }
}
