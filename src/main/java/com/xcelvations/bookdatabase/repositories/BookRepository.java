package com.xcelvations.bookdatabase.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.xcelvations.bookdatabase.entities.Book;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByNameContaining(String name);
	
}
