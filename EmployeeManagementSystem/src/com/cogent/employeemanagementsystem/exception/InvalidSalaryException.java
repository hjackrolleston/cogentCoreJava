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

public class InvalidSalaryException extends RuntimeException {
	public InvalidSalaryException(String message) {
		super(message);
	}

}
