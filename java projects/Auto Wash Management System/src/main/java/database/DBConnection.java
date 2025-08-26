package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/CarWashCenter";	
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = ""; // hear you can add your database password
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		}catch(ClassNotFoundException e) {
			throw new RuntimeException("MySQL JDBC not found in classpath ", e);
		}catch(SQLException e){
			throw new RuntimeException("Database Connection failed", e);
		}
	}
}
