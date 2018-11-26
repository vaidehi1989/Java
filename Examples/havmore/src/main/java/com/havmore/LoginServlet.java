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
import javax.servlet.http.HttpSession;

import com.havmore.model.DbConnection;
import com.havmore.model.User;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String userid = request.getParameter("userName");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();

		Statement stmt = DbConnection.getDBConnection();
		try {
			ResultSet rs = stmt.executeQuery("select * from user where userName = '" + userid + "'");
			if (rs.next()) {
				User user = new User(rs.getString("name"), rs.getString("userName"), rs.getString("password"),
						rs.getString("type"));
				if (user.getUserName().equals(userid) && user.getPassword().equals(password)) {
					session.setAttribute("user", user);
					response.sendRedirect("index.jsp");
				}
			} else {
				response.sendRedirect("login.jsp");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("login.jsp");
		}

	}

}
