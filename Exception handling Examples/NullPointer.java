package com.com.exception.test;

public class NullPointer {
    public static void main(String [] args){
        try {
            String s = null;
            s.concat("Hello");
        }
        catch (NullPointerException e){
            System.out.println("Exception handled = "+e.getMessage());
        }
        try {
            StringBuffer d = null;
            d.append("Hello");
        }
        catch (NullPointerException e){
            System.out.println("Exception handled = "+e.getMessage());
        }
    }
}
