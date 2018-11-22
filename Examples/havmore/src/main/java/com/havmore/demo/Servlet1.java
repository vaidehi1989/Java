package com.havmore.demo;

import java.io.IOException;

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

//		request.setAttribute("name", 10);
//		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
//		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("name", 10);
		response.sendRedirect("Servlet2");
//		
//		ServletContext context = getServletContext();
//		context.setAttribute("name", "value");
		
		
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
