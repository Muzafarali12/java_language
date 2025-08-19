package com.test.librarymanagementsystem.model;

public class ReturnBookInLibrary {
    private int studentId;
    private String bookIsbn;

    public ReturnBookInLibrary(int studentId, String bookIsbn) {
        this.studentId = studentId;
        this.bookIsbn = bookIsbn;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
}