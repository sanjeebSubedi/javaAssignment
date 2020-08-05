package com.soch.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch", "root", "root");

		//Create Statement
		Statement st = con.createStatement();

		//Send and execute sql query
		String query = "CREATE TABLE employees(id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, name varchar(100),"
				+ "salary float, address varchar(100))";
		
		int result = st.executeUpdate(query);
		con.close();
	}

}
