package com.cogent.productmanager.repository;
import java.io.IOException;

import com.cogent.productmanager.exception.IdNotFoundException;
import com.cogent.productmanager.exception.InvalidNameException;
import com.cogent.productmanager.model.Product;

// DO NOT import @Data or @AllArgsConstructor into here
public class ProductRepositoryImpl implements ProductRepository {
	private Product products[] = new Product[10];
	private static ProductRepositoryImpl productRepository;

	private ProductRepositoryImpl() {}

	public static ProductRepository getInstance() {
		if (productRepository == null) {
			productRepository = new ProductRepositoryImpl();
			return productRepository;
		} return productRepository;
	}
	
	@Override
	public String addProduct(Product product) {
		for (int ct=0;ct<products.length;ct++) {
			if(products[ct]==null) {products[ct]=product; return "Success.";}
		}return "Array is full.";
		//return null;
	}
	
	@Override
	public String updateProduct(String productId, Product product) throws IOException, IdNotFoundException {
		for (int i=0;i<products.length;i++){
			if (products[i]!=null) {
				if ( productId.equals(products[i].getProductId()) ){
					products[i] = product;
					return "Updated product "+product+": "
							+ products[i].getProductId()+" "+ products[i].getProductName()
							+" "+products[i].getBatchNo()+" "
							+products[i].getProductPrice()+" "
							+products[i].getCreatedDate()+" "
							+products[i].getExpiryDate()+" "
							+products[i].getProductQuantity();
				}
			}
		} throw new IdNotFoundException("Product not found with this ID.");
		//return "Product not found with this ID.";
		//return null;
	}
	
	@Override
	public Product getProductById(String id) throws IOException, IdNotFoundException {
		for (Product product : products) {
			if (product != null && id.equals(product.getProductId())) {
				return product;
			}
		}
		//return null;
		throw new IdNotFoundException("Product not found with this ID.");
	}
	
	@Override
	public Product getProductByName(String name) throws InvalidNameException, IOException {
		for (Product product : products) {
			if (product != null && name.equals(product.getProductName())) {
				return product;
			}
		} throw new InvalidNameException("Product of this name does not exist. ");
		//return null;
	}
	
	@Override
	public Product[] getProducts() {
		return products;
	}
	
	// Done.
	@Override
	public String deleteProductById(String id) throws IOException, IdNotFoundException {
		Product product = this.getProductById(id);
		if (product!=null) {
			int index=this.getIndex(product);
			if(index!=-1) {
				products[index]=null;
				
				//// Sliding the array back down into the empty slot.
				for (int j=index;j<(products.length-1);j++) {
					products[j]=products[j+1];
				}products[products.length-1]=null;
				////
				
				return"Deleted.";
			} else {
				throw new IdNotFoundException("Product of this ID not found.");
				//return "not found";
			}
		} throw new IdNotFoundException("Product of this ID not found.");
		//return "not found";
		
		//return null;
	}
	
	// Internal helper method (not implemented from interface).....
	private int getIndex(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equals(product)) {
				return i;
			}
		} return -1;
	}
	
	private static int index=0;
	public Product[] getProductsByName(String name) {
		Product[] productsTemp=new Product[products.length];
		for (Product product : products) {
			if (product.getProductName().equals(name)) {
				productsTemp [index++] = product;
			}
		} return productsTemp;
	}
	
	@Override
	public void deleteAllProducts() {
		this.products = new Product[10];
		System.out.println("Record fully emptied.");

	}

}
