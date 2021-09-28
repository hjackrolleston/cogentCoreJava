/**
 * 
 */
package com.cogent.productmanager.exception;
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
