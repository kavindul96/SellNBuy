package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductS extends JpaRepository<Product, Integer> {

	Product findOne(int productId);

	void deleteAll(int productId);


}
