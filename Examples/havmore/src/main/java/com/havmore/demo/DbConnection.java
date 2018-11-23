package com.havmore.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Insert into iceream values (null,'coconut', 'cup')");

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error in sql syntax!!");
		}

	}

	public static void main(String[] args) {
		getDBConnection();
	}

}
