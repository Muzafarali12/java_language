package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.viewDataDao;
import database.DBConnection;
import model.Car;

public class ViewDataDaoImpl implements viewDataDao {

	public List<Car> getAllCar() {
	    List<Car> carList = new ArrayList<>();
	    try (Connection con = DBConnection.getDBConnection();
	         PreparedStatement ps = con.prepareStatement("SELECT * FROM car");
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	            Car car = new Car();
	            car.setCarEngineNumber(rs.getInt("c_engineNumber"));
	            car.setName(rs.getString("c_name"));
	            car.setModel(rs.getString("c_model"));
	            car.setColor(rs.getString("c_color"));
	            car.setBodyType(rs.getString("c_bodyType"));
	            car.setCompany(rs.getString("c_company"));
	            carList.add(car);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return carList;
	}


}
