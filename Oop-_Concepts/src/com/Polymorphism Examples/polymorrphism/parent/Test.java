package com.polymorrphism.parent;

public class Test {
    public static void main(String [] args){
        day d = new Friday();
        d.setMonth("January ");
        d.setName("Friday ");
        d.dayy();
        d = new Monday();
        d.setMonth("Febuary ");
        d.setName("Monday ");
        d.dayy();
        d = new Tuesday();
        d.setMonth("March ");
        d.setName("Tuesday ");
        d.dayy();
    }
}
