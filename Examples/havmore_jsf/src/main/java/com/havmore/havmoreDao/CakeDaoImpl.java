package com.havmore.havmoreDao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.havmore.model.Cake;
import com.havmore.model.HibernateConnection;
import com.havmore.model.Icecream;

public class CakeDaoImpl implements CakeDao {

	public List<Cake> getAllCakes() {
		Session session = HibernateConnection.getSession();
		TypedQuery<Cake> cakes = session.createQuery("from Cake");
		return cakes.getResultList();
	}

	public boolean insertCake(Cake cake) {
		Session session = HibernateConnection.getSession();
		try {
			session.beginTransaction();
			session.save(cake);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
