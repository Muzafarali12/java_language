package com.abstraction4.parent;

public class Teacher extends Humans{
    @Override
    public void department(){
        System.out.println(super.getName()+" is in Staff Department = id no :"+super.getId());
    }
}
