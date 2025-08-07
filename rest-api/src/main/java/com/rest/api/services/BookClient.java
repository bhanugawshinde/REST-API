package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.api.constents.Constents;
import com.rest.api.entity.Book;

@Service
public class BookClient {
	
	RestTemplate rt = new RestTemplate();
	
	public void getBooks() {
		ResponseEntity<Book[]> forEntity = rt.getForEntity(Constents.API_URL, Book[].class);
		Book[] books = forEntity.getBody();
		System.out.println("All Books");
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void addBook(Book book) {
		ResponseEntity<String> postForEntity = rt.postForEntity(Constents.API_URL, book, String.class);
		System.out.println(postForEntity.getBody());
	}
}
