package com.polymrphism.parent;

public class Iphone extends Mobile{
    @Override
    public void battery(){
        System.out.println(super.getName()+"Battery of Iphone is 3000mh");
    }
}
