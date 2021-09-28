/**
 * 
 */
package com.cogent.employeemanagementsystem.exception;
import lombok.ToString;
/**
 * @author hjack
 *
 */
@ToString

public class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		super(message);
	}

}
