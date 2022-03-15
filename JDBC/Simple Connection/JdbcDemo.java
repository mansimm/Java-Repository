package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String args[])
	{
		String url =  "jdbc:mysql://localhost:3306/database_name";
		String uname = "your_uname";
		String password = "your_password";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,uname,password);
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("Select * from Users");
			
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Age: "+rs.getInt(3));
			}
			conn.close();
			statement.close();
			rs.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
