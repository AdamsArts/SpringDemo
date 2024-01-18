package com.mipl.LibraryManagement.Entity;

public class Book {
	private int id;
	private String bookID;
	private String name;
	private String author;
	private int publishedOn;
	private String edition;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String bookID, String name, String author, int publishedOn, String edition) {
		super();
		this.id = id;
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.publishedOn = publishedOn;
		this.edition = edition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(int publishedOn) {
		this.publishedOn = publishedOn;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	
	

}
