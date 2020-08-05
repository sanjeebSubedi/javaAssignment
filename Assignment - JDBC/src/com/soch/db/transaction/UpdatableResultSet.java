package com.soch.db.transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.soch.employee.util.DbUtil;

public class UpdatableResultSet {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement st = DbUtil.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		String query = "SELECT * FROM employees";
		
		ResultSet rs = st.executeQuery(query);
				
//		rs.moveToInsertRow();
//		
//		rs.updateString("name", "philip");
//		rs.updateInt("salary", 30000);
//		rs.updateString("address", "pkr");
//		
//		rs.insertRow();
		
//		rs.absolute(3);
//		rs.deleteRow();
		
		rs.first();
		rs.updateString("name", "mark");
		rs.updateRow();
	}
	
}
