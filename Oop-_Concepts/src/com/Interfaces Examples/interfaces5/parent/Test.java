package com.interfaces5.parent;

public class Test {
    public static void main(String [] args){
        Payment p = new CreditCard();
        p.makePayment();
        p.printRecipt();
        System.out.println();
        p = new Paypal();
        p.makePayment();
        p.printRecipt();
    }
}
