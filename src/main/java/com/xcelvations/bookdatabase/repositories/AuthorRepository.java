package com.xcelvations.bookdatabase.repositories;

import org.springframework.data.repository.CrudRepository;
import com.xcelvations.bookdatabase.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
