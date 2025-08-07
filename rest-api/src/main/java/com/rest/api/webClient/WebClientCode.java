package com.rest.api.webClient;

import org.springframework.web.reactive.function.client.WebClient;

import com.rest.api.constents.Constents;
import com.rest.api.entity.Book;

public class WebClientCode {

	WebClient webClient = WebClient.create(); // Default WebClient with no base URL
	
	public WebClientCode() {
		saveBook(new Book("Web Client"));
		getAsyncBooks();
		getBooks();
	}
	
	public void saveBook(Book book) {
		String resp = webClient.post() // HTTP Post request
		.uri(Constents.API_URL)			// End point URL
		.bodyValue(book)				//HTTP Request body data
		.retrieve()						// Retrieve HTTP Response Body
		.bodyToMono(String.class)		// Bind Response to String 
		.block();						// make to as sync client
		
		System.out.println(resp);
	}
	
	public void getBooks() {
		Book[] books = webClient.get()
		.uri(Constents.API_URL)
		.retrieve()
		.bodyToMono(Book[].class)
		.block();
		System.out.println();
		for (Book book : books) {
			System.out.println(book.getBookId() + "\t" + book.getBookName() );
		}
	}
	
	public void getAsyncBooks() {
		webClient.get()
		.uri(Constents.API_URL)
		.retrieve()
		.bodyToMono(Book[].class)
		.subscribe(WebClientCode :: respHandler);
		
		System.out.println("***Request Send Asynchronslly***");
		
	}
	
	public static void respHandler(Book [] books) {
		for (Book book : books) {
			System.out.println("Async" + book.getBookId() + "\t" + book.getBookName() );
		}
	}
}
