package com.cogent.productmanager;

import com.cogent.productmanager.model.Product;
import com.cogent.productmanager.service.ProductService;
import com.cogent.productmanager.service.ProductServiceImpl;

public class Main2 {

	public static void main(String[] args) {
		String result = null;
		
		ProductService productService = ProductServiceImpl.getInstance();
		
		Product unit1 = new Product("ux9958","ShamWow","$12.99",null,
				0,null,null);unit1.printDetails();
		try {result=productService.addProduct(unit1);}
		catch(Exception e) {e.printStackTrace();}
		
		if("Success.".equals(result)) {System.out.println("We did it!");}
	}

}
