package com.havmore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.havmoreDao.UserDao;
import com.havmore.havmoreDao.UserDaoImpl;
import com.havmore.model.User;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = (User) request.getAttribute("user");
		UserDao dao = new UserDaoImpl();
		dao.addUser(user);
		response.sendRedirect("login.jsp");

	}

}
