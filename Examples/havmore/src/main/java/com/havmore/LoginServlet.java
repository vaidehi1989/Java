package com.havmore;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.model.DbConnection;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		String userid = request.getParameter("userName");
		String password = request.getParameter("password");

		Statement stmt = DbConnection.getDBConnection();
		try {
			ResultSet rs = stmt.executeQuery("select * from user where userName = '" + userid + "'");
			rs.next();
			if (rs.getString("password").equals(password)) {
				response.getWriter().append("Welcome " + rs.getString("name"));
				// response.sendRedirect("homepage.html");
			} else {
				response.getWriter().append("<h5 style = 'color:red;'>Invalid credentials<h5>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().append("Invalid credentials");
			response.sendRedirect("Login.html");
		}

	}

}
