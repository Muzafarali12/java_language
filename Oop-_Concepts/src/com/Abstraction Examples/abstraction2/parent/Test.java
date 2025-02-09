package com.abstraction2.parent;

public class Test {
    public static void main(String [] args){
        University u = new Mehran();
        u.setDpName("Software Engineering");
        u.dpCode();
        u = new ShahLatif();
        u.setDpName("Law = ");
        u.dpCode();
        u = new Smiu();
        u.setDpName("Bba = ");
        u.dpCode();
    }
}
