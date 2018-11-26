package com.havmore.havmoreDao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.havmore.model.HibernateConnection;
import com.havmore.model.Login;
import com.havmore.model.User;

public class UserDaoImpl implements UserDao {

	public boolean addUser(User user) {
		Session session = HibernateConnection.getSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public User login(Login login) {
		Session session = HibernateConnection.getSession();
		@SuppressWarnings("unchecked")
		List<User> users = (session.createQuery("from User u where u.userName = '" + login.getUserName()
				+ "' and u.password = '" + login.getPassword() + "' ")).list();

		if (users.isEmpty() || users.size() > 1) {
			return null;
		} else {
			return users.get(0);
		}

	}

}
