package com.mipl.LibraryManagement.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mipl.LibraryManagement.Entity.Book;
@Service
public class BookService {
	
	public static List<Book> books=new ArrayList<>(Arrays.asList(
			new Book(1,"JAVA003","Fundamental of Java","James Gosling",2003,"Third Edition"),
			new Book(2,"PY002","Fundamental of Python","Guido van Rossum",2005,"Second Edition"),
			new Book(3,"PHY005","History of Physics","Galileo Galilei",1995,"Fifth Edition")));

	public static List<Book> lists() {
		return books;
	}

	public static String addNewBook(Book newBook) {
		books.add(newBook);
		return "Your new book was added :)";
	}

	public static String updateData(Book updatedData, int id) {
		for (Book book : books) {
			if (book.getId()==id) {
				book.setId(updatedData.getId());
				book.setBookID(updatedData.getBookID());
				book.setName(updatedData.getName());
				book.setAuthor(updatedData.getAuthor());
				book.setPublishedOn(updatedData.getPublishedOn());
				book.setEdition(updatedData.getEdition());
				return "Your details are uploaded Successfully";
			}
			
		}
		return "Oops! Something went wrong, and it seems the record you are looking for cannot be found.";
	}

	public static Book bookByID(int id) {
		for (Book book : books) {
			if (book.getId()==id) {
				return book;
			}
		}
		
		return null;
	}

	public static String removeBook(int id) {
		for (Book book : books) {
			if (book.getId()==id) {
				books.remove(book);
				return "You mentioned book was deleted :(";
			}
		}
		
		
		return "Oops! Something went wrong, and it seems the record you are looking for cannot be found.";
	}

}
