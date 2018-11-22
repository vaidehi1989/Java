package com.havmore;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.model.DbConnection;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		Statement stmt = DbConnection.getDBConnection();

		try {
			stmt.executeUpdate("Insert into user values ('" + name + "','" + username + "','" + password + "','"
					+ category + "')");
			// response.getWriter().append("<h3>User added successfully</h3>");
			response.sendRedirect("homepage.html");
		} catch (SQLException e) {
			e.printStackTrace();
			// response.getWriter().append("<h3>Error in adding a user!!</h3>");
			response.sendRedirect("Login.html");
		}

	}

}
