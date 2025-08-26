package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.updateRecordDao;
import database.DBConnection;
import model.Car;

public class UpdateRecordDaoImpl implements updateRecordDao {

    @Override
    public boolean updateRecord(Car car) {
        boolean updated = false;
        Connection connection = DBConnection.getDBConnection();

        try {
            String sql = "UPDATE Car SET c_name=?, c_model=?, c_color=?, c_bodyType=?, c_company=? WHERE c_engineNumber=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            // Set parameters
            ps.setString(1, car.getName());
            ps.setString(2, car.getModel()); 
            ps.setString(3, car.getColor());
            ps.setString(4, car.getBodyType());
            ps.setString(5, car.getCompany());
            ps.setInt(6, car.getCarEngineNumber());

            int rows = ps.executeUpdate();
            updated = rows > 0;  

        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;
    }

    @Override
    public Car getCarByEngineNumber(int engineNumber) {
    	Car car = null;
    	Connection connection = DBConnection.getDBConnection();
    	try {
    		String sql = "SELECT * FROM Car where c_engineNumber = ?";
    		PreparedStatement ps = connection.prepareStatement(sql);
    		ps.setInt(1, engineNumber);
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()) {
    			car = new Car();
    			car.setCarEngineNumber(rs.getInt("c_engineNumber"));
    			car.setName(rs.getString("c_name"));
    			car.setModel(rs.getString("c_model"));
    			car.setColor(rs.getString("c_color"));
    			car.setBodyType(rs.getString("c_bodyType"));
    			car.setCompany(rs.getString("c_company"));
    		}
    	}
    		catch(Exception e) {
    			e.printStackTrace();
    	}
    return car;
}
    }