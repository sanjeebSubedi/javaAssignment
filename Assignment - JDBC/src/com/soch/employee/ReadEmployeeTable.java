package com.soch.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		 //1. Load Driver
		 Class.forName("com.mysql.jdbc.Driver");

		 //2. Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch", "root", "");

		 //3. Create statement
		Statement st = con.createStatement();

		 //4. Send and execute sql query
		 String query = "SELECT * from employees";
		ResultSet rs  = st.executeQuery(query);

		while(rs.next())
		{
		System.out.println("ID = "+rs.getInt(1));
		System.out.println("Name = "+rs.getString(2));
		System.out.println("Salary = "+rs.getFloat(3));
		System.out.println("Address = "+rs.getString(4));
		}

		 //5. close the connection
		con.close();

		}
}
