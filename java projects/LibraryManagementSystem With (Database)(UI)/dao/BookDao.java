package com.test.librarymanagementsystem.dao;


import java.util.List;
import com.test.librarymanagementsystem.model.Book;

public interface BookDao {
    void addBook(Book book);
    List<Book> getAllBooks();
    
}