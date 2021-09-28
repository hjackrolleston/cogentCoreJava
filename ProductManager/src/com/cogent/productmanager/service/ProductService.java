package com.cogent.productmanager.service;
import java.io.IOException;

import com.cogent.productmanager.exception.IdNotFoundException;
import com.cogent.productmanager.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public String deleteProductById(String id) throws IOException, IdNotFoundException;
	public void deleteAllProducts();
	public Product getProductById(String id) throws IOException, IdNotFoundException;
	public Product[] getProducts();
	public String updateProduct(String id, Product product) throws IOException, IdNotFoundException;
}
