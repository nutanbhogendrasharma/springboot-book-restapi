package com.xcelvations.bookdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcelvations.bookdatabase.entities.Book;
import com.xcelvations.bookdatabase.repositories.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping("/books")
	public  Iterable<Book> getBooks(){
		return bookRepository.findAll();
	}
}
