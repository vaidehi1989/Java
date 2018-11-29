package com.havmore.havmoreDao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.havmore.model.HibernateConnection;
import com.havmore.model.Icecream;

public class IceCreamDAOImpl implements IceCreamDAO {

	public List<Icecream> getAllIcecreams() {
		Session session = HibernateConnection.getSession();
		TypedQuery<Icecream> icecreams = session.createQuery("from Icecream");
		return icecreams.getResultList();

	}

	public boolean insertIcecream(Icecream icecream) {
		Session session = HibernateConnection.getSession();
		try {
			session.beginTransaction();
			session.save(icecream);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	
	
	
	
	
	

}
