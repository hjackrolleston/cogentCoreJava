package com.cogent.employeemanagementsystem.exception;
import lombok.ToString;

@ToString

public class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		super(message);
	}

}
