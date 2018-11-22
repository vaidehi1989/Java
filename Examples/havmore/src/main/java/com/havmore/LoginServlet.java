package com.havmore;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.model.DbConnection;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userid = request.getParameter("userName");
		String password = request.getParameter("password");

		Statement stmt = DbConnection.getDBConnection();
		try {
			ResultSet rs = stmt.executeQuery("select * from user where userName = '" + userid + "'");
			rs.next();
			if (rs.getString("password").equals(password)) {
				response.getWriter().append("Welcome " + rs.getString("name"));
			} else {
				response.getWriter().append("Invalid credentials");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().append("Invalid credentials");
		}

	}

}
