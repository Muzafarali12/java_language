package com.association3.parent;

public class Test {
    public static void main(String [] args){
        Library l = new Library();
        l.setName("Khan Bhadur Library");
        l.setLocation("Near HBl Plaza (karachi Saddar)");

        Books b = new Books();
        b.setBook("History of Sindh ");
        b.setQuantity(12);
        b.setTakerName("Habibullah ");

        l.setBooks(b);

        System.out.println("Library Name     : "+l.getName());
        System.out.println("Library Location : "+l.getLocation());
        System.out.println("Book             : "+l.getBooks().getBook());
        System.out.println("Book Quantity    : "+l.getBooks().getQuantity());
        System.out.println("Taker Name       : "+l.getBooks().getTakerName());
        System.out.println("Books "+l.getBooks());
    }
}
