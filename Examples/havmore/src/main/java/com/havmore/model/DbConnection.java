package com.havmore.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {

	public static Statement getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement stmt = conn.createStatement();
			return stmt;
		} catch (Exception e) {
			System.out.println("Connection Failed!!!");
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(getDBConnection());
	}

}
