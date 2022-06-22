package com.xcelvations.bookdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookdatabaseApplication {

	private static final Logger logger = LoggerFactory.getLogger(BookdatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookdatabaseApplication.class, args);
		System.out.println("Hello World");
	}

}
