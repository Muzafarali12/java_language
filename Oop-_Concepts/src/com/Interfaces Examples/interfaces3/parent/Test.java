package com.interfaces3.parent;

public class Test {
    public static void main(String [] args){
        ColdDrink c = new CocaCola();
        c.brand();
        c = new SevenUp();
        c.brand();
    }
}
