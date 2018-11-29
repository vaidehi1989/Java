package com.havmore.havmoreDao;

import java.util.List;

import com.havmore.model.Coffee;

public interface CoffeeDao {

	public boolean addCoffee(Coffee coffee);

	public List<Coffee> getAllCoffees();
}
