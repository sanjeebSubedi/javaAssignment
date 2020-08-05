package com.soch.employee.prepared;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.soch.employee.util.DbUtil;

public class InsertEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String query = "INSERT INTO employees(name, salary, address) VALUES(?, ?, ?)";
		
		PreparedStatement ps = DbUtil.getConnection().prepareStatement(query);
		
		ps.setString(1, "chris");
		ps.setInt(2, 40000);
		ps.setString(3, "htd");
		
		int success = ps.executeUpdate();
		
		if(success ==1)
			System.out.println("Query successfully processed!");

	}

}
