package com.abstraction3.parent;

public class Samsung extends Mobile{
    @Override
    public void price(){
        System.out.println("Price of Samsung Mobile is above 100k ");
    }
    @Override
    public void battery(){
        System.out.println("Battery of Samsung Mobile is 4000mh");
    }
}
