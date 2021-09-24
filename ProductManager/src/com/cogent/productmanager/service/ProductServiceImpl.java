package com.cogent.productmanager.service;
import com.cogent.productmanager.model.Product;
import com.cogent.productmanager.repository.ProductRepository;
import com.cogent.productmanager.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	// Done.
	@Override
	public String addProduct(Product product) {
		return productRepository.addProduct(product);
		//return null;
	}
	
	public Product getProductByName(String name) {
		return productRepository.getProductByName(name);
	}
	
	public void showNameList() {
		for (Product product2:productRepository.getProducts()) {
			if (product2!=null) {
				System.out.println(product2.getProductName());
			}else {System.out.println("[empty]");}
		}
	}
	
	// Done.
	@Override
	public String deleteProductById(String id) {
		return productRepository.deleteProductById(id);
		//return null;
	}
	
	// Done.
	@Override
	public void deleteAllProducts() { productRepository.deleteAllProducts(); }
	
	// Done.
	@Override
	public Product getProductById(String id) { return productRepository.getProductById(id); }
	
	// Done.
	@Override
	public Product[] getProducts() { return productRepository.getProducts(); }

	// Done.
	@Override
	public String updateProduct(String id, Product product) {
		return productRepository.updateProduct(id,product);
	}

}
