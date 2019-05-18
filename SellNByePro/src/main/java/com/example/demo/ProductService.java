package com.example.demo;

import java.util.List;


public interface ProductService {

	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
	List<Product> getAllProductList();
	
	Product getProduct(int productId);
	
	void deleteProduct(int productId);
}
