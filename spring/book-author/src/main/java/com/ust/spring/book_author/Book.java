package com.ust.spring.book_author;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors=new ArrayList<>();
	
	public Book() {}

	public Book(String title, List<Author> authors) {
		super();
		this.title = title;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + "]";
	}
	
}
