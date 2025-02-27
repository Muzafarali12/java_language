package com.interfaces2.parent;

public class Bibel implements HolyBooks{
    @Override
    public void display(){
        System.out.println(HolyBooks.name+" Believed by Christians. ");
    }
    @Override
    public void religion(){
        System.out.print(" Bibel Sent down on Prophet Isa ");
    }
}
