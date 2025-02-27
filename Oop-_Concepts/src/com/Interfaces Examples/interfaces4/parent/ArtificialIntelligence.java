package com.interfaces4.parent;

public class ArtificialIntelligence implements university{
    @Override
    public void fees(){
        System.out.println(university.name+" The fees of Artificial intelligence department  is 7k. ");
    }
    @Override
    public void attendence(){
        System.out.println("Teachers must take attendence 75%. ");
        System.out.println();
    }
}
