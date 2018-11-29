package com.havmore.action;

import com.havmore.havmoreDao.CoffeeDao;
import com.havmore.havmoreDao.CoffeeDaoImpl;
import com.havmore.model.Coffee;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertCoffeeAction implements Action, ModelDriven<Coffee> {

	private Coffee coffee = new Coffee();
	private CoffeeDao dao = new CoffeeDaoImpl();

	@Override
	public String execute() throws Exception {

		dao.addCoffee(coffee);
		return "success";
	}

	@Override
	public Coffee getModel() {
		return coffee;
	}

}
