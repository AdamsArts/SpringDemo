package com.mipl.LibraryManagement.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mipl.LibraryManagement.Entity.Book;
@Service
public class BookService {
	
	public static List<Book> books=new ArrayList<>(Arrays.asList(
			new Book(1,"BK001","Fundamental of Java","James goosling",2003,"Third Edition")));

	public static List<Book> lists() {
		return books;
	}

	public static String addNewBook(Book newBook) {
		books.add(newBook);
		return "Book added successfully";
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
				return "Your details are uploaded";
			}
			
		}
		return "Record not found";
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
				return "Book removed";
			}
		}
		
		
		return "Book not found";
	}

}
