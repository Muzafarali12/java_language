package com.Student.publicationComapny;

import java.util.Scanner;

public class Book extends Publicationn{
    public int pageCount;
    @Override
    public void getData(){
        Scanner input = new Scanner(System.in);
        super.getData();
        System.out.print("Enter Total pages. of Book");
        this.pageCount = input.nextInt();
    }
    @Override
    public void putData(){
        super.putData();
        System.out.println("Total Pages   = "+pageCount);
    }
}

