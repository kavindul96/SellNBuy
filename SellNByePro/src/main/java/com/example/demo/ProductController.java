package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product)
	{
		return productservice.createProduct(product);
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product)
	{
		return productservice.updateProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts()
	{
		return productservice.getAllProductList();
	}
	
	
	@GetMapping("/by/{productId}")
	public Product getProduct(@PathVariable(name="productId")int productId)
	{
		return productservice.getProduct(productId);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable(name = "productId")int productId)
	{
		productservice.deleteProduct(productId);
	}
}
