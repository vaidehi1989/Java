package com.havmore.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Insert into icecream values (null,'coconut', 'cup', 60)");

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error in sql syntax!!");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("doPost() - Servlet -1");
		// response.sendRedirect("Servlet2");
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
	}

}
