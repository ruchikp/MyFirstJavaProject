package com.digi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtill {


		private static Connection connection =null;
		
		public  Connection setupDBConnection() throws ClassNotFoundException, SQLException{
	
		String connectionString = "jdbc:mysql://localhost/company?" + "user=root&password=password";
		Class.forName("com.mysql.jdbc.Driver");
		 return connection= DriverManager.getConnection(connectionString);
		
		
		
		
	
	}

}
