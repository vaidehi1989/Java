package com.bookstore.controller.action;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.dao.AuthorDAO;
import com.bookstore.dao.BookDAO;
import com.bookstore.model.Author;
import com.bookstore.model.Book;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertBookAction implements Action, ModelDriven<Book> {

	private Book book = new Book();

	private List<Author> authors;

	public List<Author> getAuthors() {
		return authors;
	}

	@Override
	public String execute() throws Exception {

		BookDAO.insertBook(book);
		return "success";
	}

	@Override
	public Book getModel() {
		return book;
	}

	public String newM() {
		authors = AuthorDAO.selectAuthors();
		return "success";
	}
	
	

}
