package com.havmore.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.havmore.havmoreDao.UserDao;
import com.havmore.havmoreDao.UserDaoImpl;

public class HibernateConnection {

	public static Session getSession() {
		
		
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		return session;
	}
	

	public static void main(String[] args) {
		System.out.println(getSession());
	}

}
