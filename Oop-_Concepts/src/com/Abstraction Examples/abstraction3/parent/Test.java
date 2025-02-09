package com.abstraction3.parent;

public class Test {
    public static void main(String [] args){
        Mobile oppo = new Oppo();
        oppo.setName("Oppo F19");
        oppo.setModel(2019);
        oppo.show();
        oppo.price();
        oppo.battery();

        System.out.println("");
        Mobile vivo = new Vivo();
        vivo.setName("Vivo y28");
        vivo.setModel(2024);
        vivo.show();
        vivo.price();
        vivo.battery();

        System.out.println("");
        Mobile samsung = new Samsung();
        samsung.setName("Samsung S21");
        samsung.setModel(1018);
        samsung.show();
        samsung.price();
        samsung.battery();

    }
}
