package com.havmore;

import java.util.List;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.havmore.model.DbConnection;
import com.havmore.model.Icecream;

public class ListProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Statement stmt = DbConnection.getDBConnection();
		List<Icecream> icecreams = new ArrayList<Icecream>();

		try {
			ResultSet rs = stmt.executeQuery(" select * from icecream");
			while (rs.next()) {
				icecreams.add(new Icecream(rs.getInt("pid"), rs.getInt("price"), rs.getString("name"),
						rs.getString("category")));

			}

		} catch (SQLException e) {
			response.getWriter().append("Error in Query!!");
			e.printStackTrace();
		}

		request.setAttribute("icecreamList", icecreams);
		
	}

}
