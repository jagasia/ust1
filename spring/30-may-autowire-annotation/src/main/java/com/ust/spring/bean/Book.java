package com.ust.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book {
	private Integer isbn;
	private String title;
	@Autowired
//	@Qualifier("author1")
	private Author author1;
	
	public Book() {
		isbn=1;
		title="Tale of two cities";
	}

	public Book(Integer isbn, String title, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author1 = author;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor1() {
		return author1;
	}

	public void setAuthor1(Author author) {
		this.author1 = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author1 + "]";
	}
	
	
	
}
