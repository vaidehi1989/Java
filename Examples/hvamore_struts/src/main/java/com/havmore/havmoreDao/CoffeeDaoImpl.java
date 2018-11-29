package com.havmore.havmoreDao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.havmore.model.Coffee;
import com.havmore.model.HibernateConnection;
import com.havmore.model.Icecream;
import com.havmore.model.Login;
import com.havmore.model.User;

public class CoffeeDaoImpl implements CoffeeDao {

	@Override
	public boolean addCoffee(Coffee coffee) {
		Session session = HibernateConnection.getSession();
		try {
			session.beginTransaction();
			session.save(coffee);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Coffee> getAllCoffees() {
		Session session = HibernateConnection.getSession();
		TypedQuery<Coffee> coffees = session.createQuery("from Coffee");
		return coffees.getResultList();
	}

}
