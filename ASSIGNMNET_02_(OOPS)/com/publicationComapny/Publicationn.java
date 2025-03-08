package com.Student.publicationComapny;

import java.util.Scanner;

public class Publicationn {
    public String  publication;
    public float price;
    public void getData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Publication = ");
        this.publication = input.next();
        System.out.print("Enter Price  = ");
        this.price = input.nextFloat();
    }
    public void putData(){

        System.out.println("Publication  = "+publication);
        System.out.println("Price        = "+price);
    }
}
