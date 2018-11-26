package com.havmore.havmoreDao;

import java.util.List;

import com.havmore.model.Icecream;

public interface IceCreamDAO {
	
	public List<Icecream> getAllIcecreams();
	
	public boolean insertIcecream(Icecream icecream);

}
