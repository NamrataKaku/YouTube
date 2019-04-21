package com.namrata.httpLogging.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.AbstractRequestLoggingFilter;



@Component
public class HttpRequestLoggingFilter extends AbstractRequestLoggingFilter {
	
	private static final String DEVICE_ID = "DEVICE_ID";
	
	private static final String DEVICE_TYPE = "DEVICE_TYPE";

	@Override
	protected void beforeRequest(HttpServletRequest request, String message) {
		
		System.out.println("Before Request Starts :");
		System.out.println("Request URL : "+request.getRequestURL().toString());
		System.out.println("Remote Host : "+request.getRemoteHost());
		System.out.println("Remote Address : "+request.getRemoteAddr());
		System.out.println("Query String : "+request.getQueryString());
		
		System.out.println("Request URI : "+request.getRequestURI());
		System.out.println("Request Header for DEVICE_ID : "+request.getHeader(DEVICE_ID));
		System.out.println("Request Header for DEVICE_TYPE : "+request.getHeader(DEVICE_TYPE));
		System.out.println("Before Request Ends :");
	}

	@Override
	protected void afterRequest(HttpServletRequest request, String message) {
		
		System.out.println("After Request Starts :");
		System.out.println("Request URL : "+request.getRequestURL().toString());
		System.out.println("Remote Host : "+request.getRemoteHost());
		System.out.println("Remote Address : "+request.getRemoteAddr());
		
	
		System.out.println("Request URI : "+request.getRequestURI());
		System.out.println("Request Header for DEVICE_ID : "+request.getHeader(DEVICE_ID));
		System.out.println("Request Header for DEVICE_TYPE : "+request.getHeader(DEVICE_TYPE));
		System.out.println("After Request Ends :");
	}

}
