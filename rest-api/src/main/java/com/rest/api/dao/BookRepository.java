package com.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
