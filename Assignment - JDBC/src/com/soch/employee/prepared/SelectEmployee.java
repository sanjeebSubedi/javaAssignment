package com.soch.employee.prepared;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.soch.employee.util.DbUtil;

public class SelectEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM employees WHERE id>?";
		
		PreparedStatement ps = DbUtil.getConnection().prepareStatement(query);
		
		ps.setInt(1, 6);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print("id: "+ rs.getInt(1));
			System.out.print(" name: "+ rs.getString(2));
			System.out.print(" salary: "+ rs.getInt(3));
			System.out.print(" address: "+ rs.getString(4) + "\n");
			
		}
	}

}
