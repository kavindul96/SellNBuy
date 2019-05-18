package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductS ps;
	
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return ps.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return ps.saveAndFlush(product);
	}

	@Override
	public List<Product> getAllProductList() {
		// TODO Auto-generated method stub
		return ps.findAll();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return ps.findOne(productId);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		ps.deleteAll(productId);
		
	}

}
