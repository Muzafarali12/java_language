package com.interfaces.parent;

public class Test {
    public static void main(String [] args){
        Watch w = new Rado();
        w.show();
        w.company();
        w = new Rolex();
        w.show();
        w.company();

    }

}
