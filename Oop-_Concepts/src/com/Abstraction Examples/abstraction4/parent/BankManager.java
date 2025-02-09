package com.abstraction4.parent;

public class BankManager extends Humans{
    @Override
    public void department(){
        System.out.println(super.getName()+" is in Manging Department = id no :"+super.getId());
    }
}
