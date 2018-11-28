package com.havmore.controller;

import java.util.List;

import com.havmore.havmoreDao.IceCreamDAO;
import com.havmore.havmoreDao.IceCreamDAOImpl;
import com.havmore.model.Icecream;

public class IcreamControler {

	public static void main(String[] args) {
		IceCreamDAO dao = new IceCreamDAOImpl();

		List<Icecream> icecreams = dao.getAllIcecreams();

		for (Icecream ic : icecreams) {
			System.out.println(ic);
		}

	}

}
