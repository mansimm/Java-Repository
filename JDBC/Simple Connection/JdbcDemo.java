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
			
			System.out.println("Ninjas present in sqad 7 :");
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Age: "+rs.getInt(3));
			}
			
			int x = statement.executeUpdate("delete from Users where user_id=2");
			System.out.println("Number of eliminated Ninjas: "+x);

			conn.close();
			statement.close();
			rs.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
