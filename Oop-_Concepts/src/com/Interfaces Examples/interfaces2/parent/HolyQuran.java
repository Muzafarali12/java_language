package com.interfaces2.parent;

public class HolyQuran implements HolyBooks{
    @Override
    public void display(){
        System.out.println(HolyBooks.name+" Believed by Muslims.");
    }
    @Override
    public void religion(){
        System.out.print(" Holy Quran Sent down on Hazrat Muhammad (SAWW) ");
    }
}
