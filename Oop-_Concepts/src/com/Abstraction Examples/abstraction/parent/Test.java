package com.abstraction.parent;

public class Test {
    public static void main(String [] args){
        Network n = new Jazz();
        n.setName("Jazz = ");
        n.net();
        n = new Warid();
        n.setName("Warid = ");
        n.net();
        n = new Zong();
        n.setName("Zong = ");
        n.net();
    }
}
