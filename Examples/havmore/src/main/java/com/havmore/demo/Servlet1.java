package com.havmore.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		response.getWriter().append("doGet() - Servlet -1 before calling Servlet -2<br>");
		// response.sendRedirect("Servlet2");

		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		// rd.forward(request, response);
		rd.include(request, response);
		response.getWriter().append("<br>doGet() - Servlet -1 after calling Servlet -2");
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
