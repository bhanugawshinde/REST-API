package com.rest.api.restTemplate;

import com.rest.api.entity.Book;
import com.rest.api.services.BookClient;

public class RestTemplateCode {

	public BookClient bookClient = new BookClient();
	
	public RestTemplateCode() {
		super();
		
		
		bookClient.addBook(new Book("java"));
		bookClient.addBook(new Book("python"));
		bookClient.addBook(new Book("web technology"));
		bookClient.addBook(new Book("Oracle"));
		
		getAllBooks();

			
	}
	
	public void getAllBooks() {
		bookClient.getBooks();
	}
	
}
