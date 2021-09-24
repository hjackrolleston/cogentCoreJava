package com.cogent.productmanager.service;
import com.cogent.productmanager.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public String deleteProductById(String id);
	public void deleteAllProducts();
	public Product getProductById(String id);
	public Product[] getProducts();
	public String updateProduct(String id, Product product);
}
