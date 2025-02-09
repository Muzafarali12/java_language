package com.interfaces2.parent;

public class Test {
    public static void main(String []args){
        HolyBooks h = new HolyQuran();

        h.display();
        h.religion();
        h = new Bibel();
        h.display();
        h.religion();
        h = new Torah();
        h.display();
        h.religion();
    }
}
