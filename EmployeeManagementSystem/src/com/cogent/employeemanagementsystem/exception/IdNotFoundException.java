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

public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String message) {
		super(message);
	}

}
