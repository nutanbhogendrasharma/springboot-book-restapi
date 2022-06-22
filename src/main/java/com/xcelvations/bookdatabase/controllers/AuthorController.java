package com.xcelvations.bookdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcelvations.bookdatabase.entities.Author;
import com.xcelvations.bookdatabase.repositories.AuthorRepository;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@RequestMapping("/authors")
	public Iterable<Author> getAuthors(){
		return authorRepository.findAll();
	}
}
