package com.abstraction4.parent;

public class Test {
    public static void main (String [] args) {
        Humans l = new BankManager();
        l.setName("M.Ameen Sahab ");
        l.setId(301);
        l.department();
        l = new Teacher();
        l.setName("Ali ");
        l.setId(208);
        l.department();
        l = new Employe();
        l.setName("Zubair");
        l.setId(202);
        l.department();
    }
}
