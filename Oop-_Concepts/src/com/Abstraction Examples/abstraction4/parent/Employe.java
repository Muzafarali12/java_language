package com.abstraction4.parent;

public class Employe extends Humans {
    @Override
    public void department(){
        System.out.println(super.getName()+" is in HR Department = id no :"+super.getId());
    }

}
