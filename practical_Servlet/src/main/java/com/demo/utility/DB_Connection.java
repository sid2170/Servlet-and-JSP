package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
	
	static Connection conn=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		try {
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64", "root", "Sid@9915519442");
		}
		catch(SQLException e1){
			System.out.println(e1.getMessage());
		}
		finally {
			return conn;
		}
	}

}
