package com.test.librarymanagementsystem.dao;

import com.test.librarymanagementsystem.model.ReturnBookInLibrary;

public interface ReturnBookDAO {
    void returnBook(ReturnBookInLibrary returnBook);
    
}
