package com.test.librarymanagementsystem.dao;


import java.util.List;
import com.test.librarymanagementsystem.model.IssueToSudent;


public interface IssueToSudentDao {
    void issueBook(IssueToSudent issue);
    List<IssueToSudent>getAllIssuedBook();
}