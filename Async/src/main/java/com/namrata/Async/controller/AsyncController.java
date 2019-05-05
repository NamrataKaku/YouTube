package com.namrata.Async.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.namrata.Async.service.AsyncService;

@Controller
@RequestMapping("/api")
public class AsyncController {

	@Autowired
	private AsyncService asyncService;
	
	@GetMapping("/books")
	public ResponseEntity<?> getBooks() {
		
		System.out.println("inside getBooks controller ");
		System.out.println("before service call: "+Calendar.getInstance().getTime());
		
		for(int i=0;i<5;i++) {
			asyncService.getBooksService();
		}
		
		System.out.println("after service call: "+Calendar.getInstance().getTime());
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
}
