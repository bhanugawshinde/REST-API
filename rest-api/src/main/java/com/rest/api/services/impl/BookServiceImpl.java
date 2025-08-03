package com.rest.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dao.BookRepository;
import com.rest.api.entity.Book;
import com.rest.api.services.BookService;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public String addBook(Book book) {
		repository.save(book);
		return "Book Added...";
	}

	@Override
	public String updateBook(Book book) {
		repository.save(book);
		return "Book Updated...";
	}

	@Override
	public String deleteBook(Integer id) {
		repository.deleteById(id);
		return "Book Deleted...";
	}

	@Override
	public List<Book> getAllBook() {
		return repository.findAll();
	}

}
