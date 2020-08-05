package com.soch.employee.prepared;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.soch.employee.util.DbUtil;

public class DeleteEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String query = "DELETE FROM employees WHERE id=?";
		
		PreparedStatement ps = DbUtil.getConnection().prepareStatement(query);
		
		ps.setInt(1, 2);
		
		int number = ps.executeUpdate();

		System.out.println(number + " row deleted");
	}

}
