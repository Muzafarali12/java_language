package com.test.librarymanagementsystem.model;

public class IssueToSudent {
    private int studentId;
    private String studentName;
    private String rollNumber;
    private String bookIsbn;

    public IssueToSudent(){}
    
    public IssueToSudent(int studentId, String studentName, String rollNumber, String bookIsbn) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.bookIsbn = bookIsbn;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
}

   
