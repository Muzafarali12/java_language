package com.interfaces5.parent;

public class Paypal implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Payment of $ made using paypal. ");
    }
}
