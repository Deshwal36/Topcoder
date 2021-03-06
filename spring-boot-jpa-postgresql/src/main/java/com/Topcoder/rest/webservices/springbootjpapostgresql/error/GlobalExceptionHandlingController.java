package com.Topcoder.rest.webservices.springbootjpapostgresql.error;

import java.util.HashMap;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


	@ControllerAdvice
	public class GlobalExceptionHandlingController extends ResponseEntityExceptionHandler{


	@ExceptionHandler(NoHandlerFoundException.class)
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex,HttpHeaders headers, HttpStatus status, WebRequest request) {
	    HashMap<String,String> responseBody = new HashMap<>();
	    responseBody.put("path",request.getContextPath());
	    responseBody.put("message","Invalid Endpoint");
	    return new ResponseEntity<Object>(responseBody,HttpStatus.METHOD_NOT_ALLOWED);
		}
	}



