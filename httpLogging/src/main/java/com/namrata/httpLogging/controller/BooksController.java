package com.namrata.httpLogging.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@RequestMapping(name ="/books",method = RequestMethod.GET)
	public ResponseEntity<String> getBooks() {
		System.out.println("Books get request");
		
		return new ResponseEntity<String>("books data", HttpStatus.OK);
	}
	
	
}
