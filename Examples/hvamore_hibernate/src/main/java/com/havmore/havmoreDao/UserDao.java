package com.havmore.havmoreDao;

import com.havmore.model.Login;
import com.havmore.model.User;

public interface UserDao {

	public boolean addUser(User user);
	
	public User login(Login login);
}
