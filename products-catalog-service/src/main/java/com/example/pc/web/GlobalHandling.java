package com.example.pc.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandling {

	

	@ExceptionHandler(value=RuntimeException.class)
	void handleException(){
		//..
	}
	
}
