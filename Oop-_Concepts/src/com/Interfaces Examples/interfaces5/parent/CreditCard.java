package com.interfaces5.parent;

public class CreditCard implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Payment of $ made using credit card. ");
    }
}
