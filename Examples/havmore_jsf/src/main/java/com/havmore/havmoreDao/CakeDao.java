package com.havmore.havmoreDao;

import java.util.List;

import com.havmore.model.Cake;

public interface CakeDao {

	public List<Cake> getAllCakes();

	public boolean insertCake(Cake cake);

}
