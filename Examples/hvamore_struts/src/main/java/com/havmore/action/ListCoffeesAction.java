package com.havmore.action;

import java.util.List;

import com.havmore.havmoreDao.CoffeeDao;
import com.havmore.havmoreDao.CoffeeDaoImpl;
import com.havmore.model.Coffee;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class ListCoffeesAction implements Action, ModelDriven<Coffee> {

	private List<Coffee> coffees;

	private CoffeeDao dao = new CoffeeDaoImpl();

	@Override
	public String execute() throws Exception {
		setCoffees(dao.getAllCoffees());
		return "success";
	}

	@Override
	public Coffee getModel() {
		// TODO Auto-generated method stub
		return new Coffee();
	}

	public List<Coffee> getCoffees() {
		return coffees;
	}

	public void setCoffees(List<Coffee> coffees) {
		this.coffees = coffees;
	}

}
