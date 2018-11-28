package com.havmore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.havmore.havmoreDao.UserDao;
import com.havmore.havmoreDao.UserDaoImpl;
import com.havmore.model.Login;
import com.havmore.model.User;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Login login = new Login(request.getParameter("userName"), request.getParameter("password"));
		UserDao dao = new UserDaoImpl();

		System.out.println(login);
		User user = dao.login(login);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
