package com.soch.db.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.soch.employee.util.DbUtil;

public class DbTransaction {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getConnection();
		
		try {
			con.setAutoCommit(false);
			
			Statement st = con.createStatement();
			
			String query = "INSERT INTO employees(name, salary, address) VALUES('steven', 50000, 'btl')";
			
			st.executeUpdate(query);
			
			query = "INSERT INTO employees(name, salary, address) VALUES('marcus', 55000, 'brt')";
			
			st.executeUpdate(query);
			
			con.commit();
		}catch (Exception e) {
			// TODO: handle exception
			con.rollback();
		}
		

	}

}
