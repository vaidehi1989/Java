package com.havmore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.havmoreDao.IceCreamDAO;
import com.havmore.havmoreDao.IceCreamDAOImpl;
import com.havmore.model.Icecream;

public class ListProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IceCreamDAO dao = new IceCreamDAOImpl();

		List<Icecream> icecreams = dao.getAllIcecreams();

		request.setAttribute("icecreamList", icecreams);

	}

}
