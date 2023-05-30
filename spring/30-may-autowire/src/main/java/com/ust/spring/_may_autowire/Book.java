package com.ust.spring._may_autowire;

public class Book {
	private Integer isbn;
	private String title;
	private Author author;
	
	public Book() {}

	public Book(Integer isbn, String title, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	
}
