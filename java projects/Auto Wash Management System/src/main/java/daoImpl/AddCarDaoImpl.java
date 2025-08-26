package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.addCarDao;
import database.DBConnection;
import model.Car;

public class AddCarDaoImpl implements addCarDao{
	public void addCar(Car car) {
		Connection connection = DBConnection.getDBConnection();
		String sql = "insert into Car (c_engineNumber, c_name, c_model, c_color, c_bodyType, c_company) VALUES (?, ?, ?, ?, ?,?)";
		try(
			PreparedStatement prst = connection.prepareStatement(sql);){
			prst.setInt(1, car.getCarEngineNumber());
			prst.setString(2, car.getName());
			prst.setString(3, car.getModel());
			prst.setString(4, car.getColor());
			prst.setString(5, car.getBodyType());
			prst.setString(6, car.getCompany());
			
			prst.executeUpdate();
			System.out.println("Registration Completed");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
	}
}
