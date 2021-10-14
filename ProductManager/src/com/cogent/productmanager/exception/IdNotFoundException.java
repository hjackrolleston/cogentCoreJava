package com.cogent.productmanager.exception;
import java.lang.Exception;
import lombok.ToString;

public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String message) {super(message);} 
}
