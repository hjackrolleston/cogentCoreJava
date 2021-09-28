package com.cogent.productmanager;

import java.util.Scanner;

import com.cogent.productmanager.model.Product;
import com.cogent.productmanager.service.ProductServiceImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductServiceImpl productService = new ProductServiceImpl();
		Product pro1=new Product("ox444","OxiClean","$19.99","25",3,null,null);
		Product pro2=new Product("or843","OrangeGlo","$19.98","24",3,null,null);
		Product pro3=new Product("kb999","Kaboom","$19.95","18",3,null,null);
		Product pro4=new Product("mp861","MightyPutty","$19.96","13",3,null,null);
		
		String re1 = productService.addProduct(pro1);
		String re2 = productService.addProduct(pro2);
		String re3 = productService.addProduct(pro3);
		String re4 = productService.addProduct(pro4);

		//System.out.println(re1);
		//System.out.println(re2);
		//System.out.println(re3);
		//System.out.println(re4);
		
		Product[] products = productService.getProducts(); productService.showNameList();
		System.out.println("===================\n\n");
		
		try{System.out.println(productService.deleteProductById("kb999s"));}catch(Exception e) {e.printStackTrace();}
		
		productService.showNameList(); System.out.println("Fixing this...");
		
		
		// Updating the record for an employee who got a raise
		productService.getProducts()[3].printDetails();
		pro4 = new Product("kb999","HerculesHook","$19.99","10",4,null,null);
		
		try {productService.updateProduct("mp861",pro4);
			productService.getProducts()[3].printDetails();
		} catch(Exception e) {e.printStackTrace();}
		
	
		
		Scanner sc = new Scanner(System.in);System.out.println("Enter a product's name...");
		String fN = sc.next();
		try{Product searched=productService.getProductByName(fN);
			if(searched!=null) {searched.printDetails();}
		}catch(Exception e) {e.printStackTrace();}
	}

}
