package com.java8.ReturnTypeInterfaceExamples.interfaceExample2;

public class Test {
    public void discount(int totalPrice){
        if(totalPrice > 4000){
            int discountCalculation = (int)(totalPrice * 0.1);
            int newPrice = totalPrice - discountCalculation;
            String name = "Q-Mobile";
            System.out.println("Congratulations you have 10% discount on  "+name+" New price : "+newPrice);
        }else {
            System.out.println("You have no any discount due to our rules.");
        }

    }
    public static void main(String[] args) {

        DiscountCalculate testFunctionalInterface2 = () -> 5000;


        int totalPrice = testFunctionalInterface2.price();
        Test test = new Test();
        test.discount(totalPrice);


    }
}


