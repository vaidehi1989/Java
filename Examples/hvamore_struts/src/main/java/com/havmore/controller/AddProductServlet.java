package com.havmore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.havmoreDao.IceCreamDAO;
import com.havmore.havmoreDao.IceCreamDAOImpl;
import com.havmore.model.Icecream;

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Icecream ic = (Icecream) request.getAttribute("icecream");
		IceCreamDAO dao = new IceCreamDAOImpl();

		if (dao.insertIcecream(ic)) {
			response.sendRedirect("listproducts.jsp");
		} else {
			response.sendRedirect("error");
		}
	}

}
