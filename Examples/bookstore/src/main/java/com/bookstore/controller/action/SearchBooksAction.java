package com.bookstore.controller.action;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.dao.BookDAO;
import com.bookstore.model.Book;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class SearchBooksAction implements Action, ModelDriven<Book> {

	private List<Book> searchBooks;

	private int selectbookId;

	private Book book = new Book();

	@Override
	public String execute() throws Exception {
		searchBooks = new ArrayList<Book>();
		return "success";
	}

	public String search() {
		searchBooks = BookDAO.searchBooks(book.getTitle(), book.getAuthor().getName());
		return "success";
	}

	public String select() {
		searchBooks = new ArrayList<Book>();
		Book b = BookDAO.selectBook(book.getBookId());
		System.out.println("\n\n\n" + b);
		book.setAuthor(b.getAuthor());
		book.setTitle(b.getTitle());
		book.setEdition(b.getEdition());
		book.setPrice(b.getPrice());
		book.setPublication(b.getPublication());

		return "correct";
	}

	@Override
	public Book getModel() {
		return book;
	}

	public List<Book> getSearchBooks() {
		return searchBooks;
	}

	public int getSelectbookId() {
		return selectbookId;
	}

	public void setSelectbookId(int selectbookId) {
		this.selectbookId = selectbookId;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
