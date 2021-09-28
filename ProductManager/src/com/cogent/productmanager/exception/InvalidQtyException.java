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

public class InvalidQtyException extends RuntimeException {
	public InvalidQtyException(String message) {
		super(message);
	}

}
