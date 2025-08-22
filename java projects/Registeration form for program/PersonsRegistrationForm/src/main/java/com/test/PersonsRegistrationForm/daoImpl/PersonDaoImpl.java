package com.test.PersonsRegistrationForm.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.PersonsRegistrationForm.dao.personDao;
import com.test.PersonsRegistrationForm.dataBase.DBConnection;
import com.test.PersonsRegistrationForm.model.Person;


public class PersonDaoImpl implements personDao{
	public void register(Person person) {
		Connection connection = DBConnection.getDBConnection();
		String sql = "insert into person (p_id, p_name, p_email, p_age_, p_address, p_password) VALUES (?, ?, ?, ?, ?,?)";
		try(
			PreparedStatement prst = connection.prepareStatement(sql);){
			prst.setInt(1, person.getId());
			prst.setString(2, person.getName());
			prst.setString(3, person.getEmail());
			prst.setInt(4, person.getAge());
			prst.setString(5, person.getAddress());
			prst.setString(6, person.getPassword());
			
			prst.executeUpdate();
			System.out.println("Registration Completed");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public List<Person> getAllPerson() {
	    Connection con = DBConnection.getDBConnection();
	    List<Person> list = new ArrayList<>();
	    try {
	        String query = "select * from person";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Person p = new Person(
	                rs.getInt("p_id"),
	                rs.getString("p_name"),
	                rs.getString("p_email"),
	                rs.getInt("p_age"),
	                rs.getString("p_address"),
	                rs.getString("p_password")
	            );
	            list.add(p);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
}
