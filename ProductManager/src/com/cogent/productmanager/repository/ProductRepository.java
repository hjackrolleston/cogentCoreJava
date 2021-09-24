package com.cogent.productmanager.repository;
import com.cogent.productmanager.model.Product;

public interface ProductRepository {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product);
	public Product getProductById(String id);
	public Product[] getProducts();
	public String deleteProductById(String id);
	public void deleteAllProducts();
	public Product getProductByName(String name);
}
