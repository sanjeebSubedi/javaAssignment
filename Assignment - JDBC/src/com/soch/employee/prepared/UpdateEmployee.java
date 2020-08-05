package com.soch.employee.prepared;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.soch.employee.util.DbUtil;

public class UpdateEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String query = "UPDATE employees SET salary=? WHERE id=?";
		
		PreparedStatement ps = DbUtil.getConnection().prepareStatement(query);
		
		ps.setInt(1, 40000);
		ps.setInt(2, 3);
		
		int number = ps.executeUpdate();
		
		System.out.println(number + " row updated");

	}
}
