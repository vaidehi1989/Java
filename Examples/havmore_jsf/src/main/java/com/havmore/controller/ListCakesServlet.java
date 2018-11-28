package com.havmore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.havmoreDao.CakeDao;
import com.havmore.havmoreDao.CakeDaoImpl;
import com.havmore.model.Cake;

public class ListCakesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CakeDao dao = new CakeDaoImpl();

		List<Cake> cakes = dao.getAllCakes();

		request.setAttribute("cakesList", cakes);

	}

}
