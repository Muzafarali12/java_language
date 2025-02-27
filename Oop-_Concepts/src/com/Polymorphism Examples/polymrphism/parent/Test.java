package com.polymrphism.parent;

public class Test {
    public static void main(String [] args){
        Mobile m = new Oppo();
        m.setName("Oppo Mobile = ");
        m.battery();
        m = new Iphone();
        m.setName("Iphone Mobile = ");
        m.battery();
        m = new Vivo();
        m.setName("Vivo Mobile = ");
        m.battery();
    }
}
