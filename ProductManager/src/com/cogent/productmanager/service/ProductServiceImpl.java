package com.cogent.productmanager.service;
import java.io.IOException;

import com.cogent.productmanager.exception.IdNotFoundException;
import com.cogent.productmanager.exception.InvalidNameException;
import com.cogent.productmanager.model.Product;
import com.cogent.productmanager.repository.ProductRepository;
import com.cogent.productmanager.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	private static ProductServiceImpl productService;
	private ProductServiceImpl() {}
	public static ProductServiceImpl getInstance() {
		if (productService==null) {productService=new ProductServiceImpl();
			return productService;
		}return productService;
	}
	
	@Override
	public String addProduct(Product product) {
		return productRepository.addProduct(product);
		//return null;
	}
	
	public Product getProductByName(String name) throws IOException, InvalidNameException {
		return productRepository.getProductByName(name);
	}
	
	public void showNameList() {
		for (Product product2:productRepository.getProducts()) {
			if (product2!=null) {
				System.out.println(product2.getProductName());
			}else {System.out.println("[empty]");}
		}
	}
	
	@Override
	public String deleteProductById(String id) throws IOException, IdNotFoundException {
		return productRepository.deleteProductById(id);
		//return null;
	}
	
	@Override
	public void deleteAllProducts() { productRepository.deleteAllProducts(); }
	
	@Override
	public Product getProductById(String id) throws IOException, IdNotFoundException {
		return productRepository.getProductById(id); }
	
	@Override
	public Product[] getProducts() { return productRepository.getProducts(); }

	@Override
	public String updateProduct(String id, Product product) throws IOException, IdNotFoundException {
		return productRepository.updateProduct(id,product);
	}

}
