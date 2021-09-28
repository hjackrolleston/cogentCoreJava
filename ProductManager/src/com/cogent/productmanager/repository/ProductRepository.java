package com.cogent.productmanager.repository;
import java.io.IOException;

import com.cogent.productmanager.exception.IdNotFoundException;
import com.cogent.productmanager.exception.InvalidNameException;
import com.cogent.productmanager.model.Product;

public interface ProductRepository {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws IOException, IdNotFoundException;
	public Product getProductById(String id) throws IOException, IdNotFoundException;
	public Product[] getProducts();
	public String deleteProductById(String id) throws IOException, IdNotFoundException;
	public void deleteAllProducts();
	public Product getProductByName(String name) throws IOException, InvalidNameException;
}
