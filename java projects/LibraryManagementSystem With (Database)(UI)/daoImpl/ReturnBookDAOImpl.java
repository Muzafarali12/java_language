package com.test.librarymanagementsystem.daoImpl;

import com.test.librarymanagementsystem.dao.ReturnBookDAO;
import com.test.librarymanagementsystem.dataBase.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.test.librarymanagementsystem.model.ReturnBookInLibrary;



public class ReturnBookDAOImpl implements ReturnBookDAO {

    @Override
    public void returnBook(ReturnBookInLibrary returnBook) {
        Connection connection = DBConnection.getDbConnection();
        String query = "delete from issued_books where student_id = ? and book_isbn = ?";

        try (
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, returnBook.getStudentId());
            statement.setString(2, returnBook.getBookIsbn());
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Book returned successfully");
            } else {
                System.out.println("No matching issued book found for return");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void returnBook(Object returnBook) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}