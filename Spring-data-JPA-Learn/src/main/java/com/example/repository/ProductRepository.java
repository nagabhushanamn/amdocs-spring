package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	// List<Product> findByPrice(double price);

	@Query(name="Product.byPrice")
	List<Product> queryByPrice(double price);


}
