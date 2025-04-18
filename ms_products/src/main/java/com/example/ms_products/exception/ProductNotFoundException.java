package com.example.ms_products.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {        
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(Long id) {            
		super("Product not found with id: " + id);        
		}    
	} 
