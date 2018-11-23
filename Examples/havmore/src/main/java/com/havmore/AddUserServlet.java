package com.havmore;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.model.DbConnection;
import com.havmore.model.User;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Statement stmt = DbConnection.getDBConnection();
		User user = (User) request.getAttribute("user");

		try {
			stmt.executeUpdate("Insert into user values ('" + user.getName() + "','" + user.getUserName() + "','"
					+ user.getPassword() + "','" + user.getType() + "')");
			response.sendRedirect("index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("adduser.jsp");
		}

	}

}
