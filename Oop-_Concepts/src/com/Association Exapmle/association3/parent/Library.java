package com.association3.parent;

public class Library {
    private String name;
    private String location;

    private Books books;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public Books getBooks(){
        return books;
    }
    public void setBooks(Books books){
        this.books = books;
    }
}
