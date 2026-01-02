package com.example.Classes.Exception;

import org.springframework.http.HttpStatus;

public class StudentException extends RuntimeException {

	
	private String getMessage;
	private HttpStatus getHttp;
	
	@Override
	public String getMessage() {
		
		return getMessage;
	}
	
	public HttpStatus gethttp() {
		return getHttp;
	}

	public StudentException(String getMessage, HttpStatus getHttp) {
		
		this.getMessage = getMessage;
		this.getHttp = getHttp;
	}
	
	
	
}
