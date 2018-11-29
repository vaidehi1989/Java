package com.bookstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bookstore.model.Book;

public class HibernateConnection {

	public static Session getSession() {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		return session;
	}

	public static void main(String[] args) {
		Session session = getSession();
		session.close();

	}

}
