package com.example.pc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pc.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
