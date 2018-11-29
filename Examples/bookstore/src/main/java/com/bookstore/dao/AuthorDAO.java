package com.bookstore.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.bookstore.model.Author;

public class AuthorDAO {

	public static void insertAuthor(Author author) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.save(author);
		session.getTransaction().commit();

		session.close();
	}

	public static void updateAuthor(Author author) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.update(author);
		session.getTransaction().commit();

		// session.close();
	}

	public static void deleteAuthor(Author author) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.delete(author);

		session.getTransaction().commit();

		// session.close();

	}

	public static Author selectAuthor(int pk) {
		Session session = HibernateConnection.getSession();
		Author author = session.get(Author.class, pk);

		return author;

	}

	public static List<Author> selectAuthors() {
		Session session = HibernateConnection.getSession();

		TypedQuery<Author> authors = session.createQuery("from Author");

		List<Author> list = authors.getResultList();

		session.close();

		return list;

	}

}
