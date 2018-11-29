package com.bookstore.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.bookstore.dao.AuthorDAO;
import com.bookstore.dao.BookDAO;
import com.bookstore.dao.HibernateConnection;
import com.bookstore.model.Author;
import com.bookstore.model.Book;

public class MappingDemo {

	public static void main(String[] args) {

		Session session = HibernateConnection.getSession();

		Author a = session.get(Author.class, 1);
		session.close();

		Book b = BookDAO.selectBook(4);
		System.out.println(b);

		Set<Book> books = a.getBooks();
		books.add(b);

		a.setBooks(books);
		AuthorDAO.updateAuthor(a);

		// Book b = new Book();
		// b.setTitle("C++ ");
		//
		// BookDAO.insertBook(b);

		// --------------------------------------------------------------

		// Author a = AuthorDAO.selectAuthor(2);
		//
		// Book b = BookDAO.selectBook(3);
		//
		// Set<Book> books = new HashSet<Book>();
		// books.add(b);
		//
		// a.setBooks(books);
		//
		// AuthorDAO.updateAuthor(a);

		// --------------------------------------------------------------

		// Author a = new Author();
		// a.setName("Sam");
		// a.setEmail("sam@company.com");
		// a.setOrganisation("TCET");
		// a.setQualification("MTECH");
		//
		// AuthorDAO.insertAuthor(a);

		// --------------------------------------------------------------

		// Book b = new Book();
		// b.setTitle("Python");
		//
		// BookDAO.insertBook(b);

		// --------------------------------------------------------------
		// Book b = BookDAO.selectBook(2);
		// System.out.println("\n\n\n");
		// System.out.println("Title : " + b.getTitle());
		// System.out.println("Author : " + b.getAuthor().getName());

		// -------------------------------------------------------------
		// Session session = HibernateConnection.getSession();
		// Author a = session.get(Author.class, 1);
		//
		// for(Book b : a.getBooks()){
		// System.out.println(b.getTitle());
		// }

		// -------------------------------------------------------------
		// Book b1 = new Book();
		// b1.setTitle("Java");
		//
		// Book b2 = new Book();
		// b2.setTitle("Hibernate");
		//
		// Set<Book> books = new HashSet<Book>();
		// books.add(b1);
		// books.add(b2);
		//
		// Author a = new Author();
		// a.setName("George");
		// a.setEmail("george@company.com");
		// a.setOrganisation("CDAC");
		// a.setQualification("PHD");
		// a.setBooks(books);
		//
		// AuthorDAO.insertAuthor(a);

	}

}
