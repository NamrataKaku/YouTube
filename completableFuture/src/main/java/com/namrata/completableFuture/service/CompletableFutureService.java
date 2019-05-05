package com.namrata.completableFuture.service;

import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CompletableFutureService {
	

	@Async
	public CompletableFuture<String> getBooks() {
		
		System.out.println("get books service before Thread sleep: "+Calendar.getInstance().getTime());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get books service after Thread sleep: "+Calendar.getInstance().getTime());
		
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		completableFuture.complete("books");
		return completableFuture;
	}

}
