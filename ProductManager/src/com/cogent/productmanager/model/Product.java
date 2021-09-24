package com.cogent.productmanager.model;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public /*final */class Product {
	private String productId,productName,productPrice,batchNo;
	private long productQuantity;
	private Date createdDate, expiryDate;
}
