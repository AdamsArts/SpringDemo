package com.mipl.LibraryManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.LibraryManagement.Entity.Book;
import com.mipl.LibraryManagement.Service.BookService;

@RestController
@RequestMapping("/library")
public class BookController {
	@GetMapping("/books")
	public List<Book> listsOfBooks(){
		return BookService.lists();	
	}
	@PostMapping("/addbook")
	public String addBook(@RequestBody Book newBook) {
		return BookService.addNewBook(newBook);	
	}
	@PutMapping("/updatebook/{id}")
	public String update(@RequestBody Book updatedData,@PathVariable int id) {
		return BookService.updateData(updatedData,id);
		
	}
	@GetMapping("/displayBook/{id}")
	public Book BookByID(@PathVariable int id) {
		return BookService.bookByID(id);
	}
	@DeleteMapping("/removeBook/{id}")
	public String removeBook(@PathVariable int id) {
		return BookService.removeBook(id);
	}

}
