package com.namrata.completableFuture.controller;

import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.namrata.completableFuture.service.CompletableFutureService;



@Controller
@RequestMapping("/api")
public class CompletableFutureController {

	@Autowired
	private CompletableFutureService completableFutureService;
	
	@GetMapping("/books")
	public ResponseEntity<?> getBooks() {
		
		System.out.println("inside getBooks controller ");
		System.out.println("before service call: "+Calendar.getInstance().getTime());
		
		CompletableFuture<String> completableFuture1 = completableFutureService.getBooks();
		CompletableFuture<String> completableFuture2 = completableFutureService.getBooks();
		CompletableFuture<String> completableFuture3 = completableFutureService.getBooks();
		CompletableFuture<String> completableFuture4 = completableFutureService.getBooks();
		
		CompletableFuture<Void> completableFutureCombined = CompletableFuture.allOf(completableFuture1,completableFuture2,completableFuture3,completableFuture4);
		
		completableFutureCombined.join();
		
		System.out.println("after service call: "+Calendar.getInstance().getTime());
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
}
