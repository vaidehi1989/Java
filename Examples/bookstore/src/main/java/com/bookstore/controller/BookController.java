package com.bookstore.controller;

import java.util.List;

import com.bookstore.dao.BookDAO;
import com.bookstore.model.Book;

public class BookController {

	public static void main(String[] args) {

		List<Book> books = BookDAO.selectBooks();

		for (Book b : books) {
			System.out.println(b.getTitle());
		}

		// Book book = BookDAO.selectBook(1);
		//
		// System.out.println(book.getTitle());
		// System.out.println(book.getAuthor());
		// System.out.println(book.getPrice());

		// Book book = new Book();
		// Deletion
		// book.setBookId(2);
		// BookDAO.deleteBook(book);

		// Updation
		// book.setBookId(1);
		// book.setTitle("Head First Java");
		// book.setAuthor("Kathy Searria");
		// book.setPublication("Oreily");
		// book.setPrice(600);
		// book.setEdition("2nd");
		//
		// BookDAO.updateBook(book);

		// Insertion
		// book.setTitle("Head First Java");
		// book.setAuthor("Kathy Searria");
		// book.setPublication("Oreily");
		// book.setPrice(600);
		//
		// BookDAO.insertBook(book);

	}

}
