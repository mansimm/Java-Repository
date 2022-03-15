package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String args[])
	{
		String url =  "jdbc:mysql://localhost:3306/db_name";
		String uname = "uname";
		String password = "pass";
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

			//Prepare statement example
			PreparedStatement ps = conn.prepareStatement("insert into Users values(?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2, "Saske Uchiha");
			ps.setInt(3, 13);
			
			int y = ps.executeUpdate();
			System.out.println("Number of Ninjas added to the squad 7: "+x);

			rs = statement.executeQuery("Select * from Users");
			System.out.println("Ninjas present in sqad 7 :");
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
