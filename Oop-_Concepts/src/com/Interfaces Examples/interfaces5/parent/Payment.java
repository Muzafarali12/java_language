package com.interfaces5.parent;
interface Payment {
    void makePayment();
    default void printRecipt(){
       System.out.println("The Payment of $ Was Successful. ");
    }
}
