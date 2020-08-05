package com.soch.db.transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.soch.employee.util.DbUtil;

public class ScrollableResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Statement st = DbUtil.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		String query = "SELECT * FROM employees";
		
		ResultSet rs = st.executeQuery(query);
		
		System.out.println("All records in the table:");
		
		while(rs.next()) {
			System.out.print("id: " + rs.getInt(1));
			System.out.print(" name: " + rs.getString(2));
			System.out.print(" salary: " + rs.getString(3));
			System.out.print(" address: " + rs.getString(4) + "\n");
		}
		
		rs.absolute(5);
		System.out.println(rs.getString("name"));
		
		
	}

}
