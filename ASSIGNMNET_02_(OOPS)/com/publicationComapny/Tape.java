package com.Student.publicationComapny;

import java.util.Scanner;

public class Tape extends Book{
    public float playingTime;
    @Override
    public void getData(){
        Scanner input = new Scanner(System.in);
        super.getData();
        System.out.print("Enter Playing Time. ");
        this.playingTime = input.nextFloat();
    }
    @Override
    public void putData(){
        super.putData();
        System.out.println("Playing Time   = "+playingTime);
    }
}

