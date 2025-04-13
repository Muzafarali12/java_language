package com.hello.LMMS;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private int quantity;

    public Book(String name, String author, String isbn, int quantity) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void display(){
        System.out.println( name + "       " + author+ "     "+ isbn + "        " +quantity);
    }
}
