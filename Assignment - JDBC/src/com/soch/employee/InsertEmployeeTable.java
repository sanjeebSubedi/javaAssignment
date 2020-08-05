package com.soch.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployeeTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		 //1. Load Driver
		 Class.forName("com.mysql.jdbc.Driver");

		 //2. Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch", "root", "");

		 //3. Create statement
		Statement st = con.createStatement();

		 //4. Send and execute sql query
		 String query = "INSERT INTO employees (`name`, `salary`, `address`) VALUES('Madan', 30000, 'pokhara')";

		int rows = st.executeUpdate(query);
		 System.out.println("Number of rows affected =" + rows);

		 //5. close the connection
		con.close();

		}
}
