package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.deleteRecordDao;
import database.DBConnection;

public class DeleteRecordDaoImpl implements deleteRecordDao {
	public boolean deleteRecord(int c_engineNumber) {
	    String sql = "DELETE FROM car WHERE c_engineNumber = ?";
	    try (Connection con = DBConnection.getDBConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setInt(1, c_engineNumber);
	        int rows = ps.executeUpdate();

	        return rows > 0; 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}
}
