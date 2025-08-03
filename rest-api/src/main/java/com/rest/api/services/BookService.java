package com.rest.api.services;

import java.util.List;

import com.rest.api.entity.Book;

public interface BookService {
	public String addBook(Book book);
	public String updateBook(Book book);
	public String deleteBook(Integer id);
	public List<Book> getAllBook();
}
