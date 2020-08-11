package com.namrata.multipart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class BooksController {

	@PostMapping("/book")
	public ResponseEntity<?> createBook(@RequestParam("file") MultipartFile file,@RequestParam("book") String book){
		
		if(book != null) {
			System.out.println("book json"+book);
		}
		
		if(file != null) {
			System.out.println("file"+file);
		}
		
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
}
