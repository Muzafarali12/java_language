package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static Connection connection = null;
    public static Connection getDbConnection(){

        String jdbUrl = "jdbc:mysql://localhost:3306/StudentManagement";
        String username = "";
        String password = "";
        try {
            if (connection==null){
                connection = DriverManager.getConnection(jdbUrl,username,password);
            }
            return connection;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
