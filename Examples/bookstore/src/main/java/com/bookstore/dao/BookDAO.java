package com.bookstore.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.bookstore.model.Book;

public class BookDAO {

	public static void insertBook(Book book) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();

		session.close();
	}

	public static void updateBook(Book book) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.update(book);

		session.getTransaction().commit();

		session.close();

	}

	public static void deleteBook(Book book) {
		Session session = HibernateConnection.getSession();

		session.beginTransaction();
		session.delete(book);

		session.getTransaction().commit();

		session.close();

	}

	public static Book selectBook(int pk) {
		Session session = HibernateConnection.getSession();
		Book book = session.get(Book.class, pk);
		session.close();

		return book;

	}

	public static List<Book> selectBooks() {
		Session session = HibernateConnection.getSession();

		TypedQuery<Book> books = session.createQuery("from Book");

		List<Book> list = books.getResultList();

		session.close();

		return list;

	}

	public static List<Book> searchBooks(String title, String author) {
		Session session = HibernateConnection.getSession();
		Query queryObject = session.createQuery(
				"from Book b where b.title like '%'||'" + title + "' and b.author.name like '%'||'" + author + "'");
		List<Book> books = queryObject.list();
		session.close();
		return books;
	}
}
