package com.interfaces2.parent;

public class Torah implements HolyBooks{
    @Override
    public void display(){
        System.out.println(HolyBooks.name+" Believed by Judaism");
    }
    @Override
    public void religion(){
        System.out.print(" Torah Sent down on Prophet Musa ");
    }
}
