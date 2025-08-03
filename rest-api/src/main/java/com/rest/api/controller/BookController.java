package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Book;
import com.rest.api.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/book-service")
	public ResponseEntity<List<Book>> getAllBooks(){
		return new ResponseEntity<List<Book>>(bookService.getAllBook(),HttpStatus.OK);
	}
	
	@PostMapping("/book-service")
	public ResponseEntity<String> addBooks(@RequestBody Book book){
		String respPayload = bookService.addBook(book);
		return new ResponseEntity<>(respPayload,HttpStatus.OK);
	}
	
	@PutMapping("/book-service")
	public ResponseEntity<String> updateBooks(@RequestBody Book book){
		String respPayload = bookService.updateBook(book);
		return new ResponseEntity<>(respPayload,HttpStatus.OK);
	}
	
	@DeleteMapping("/book-service/{bookId}")
	public ResponseEntity<String> deleteBooks(@PathVariable Integer bookId){
		String respPayload = bookService.deleteBook(bookId);
		return new ResponseEntity<>(respPayload,HttpStatus.OK);
	}

}
