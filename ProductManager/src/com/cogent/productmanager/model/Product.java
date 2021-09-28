package com.cogent.productmanager.model;
import java.util.Date;

import com.cogent.productmanager.exception.InvalidQtyException;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public /*final */class Product {
	private String productId,productName,productPrice,batchNo;
	private long productQuantity;
	private Date createdDate, expiryDate;
	
	public void printDetails() {
		System.out.println(productId+" "+productName+" "+productPrice+" "
				+batchNo+" "+productQuantity+" "+createdDate+" "+expiryDate
				);
	}

	public void setQuantity(long l) throws InvalidQtyException {
		try {this.productQuantity=l;}
		catch (InvalidQtyException i) {}
	}
}
