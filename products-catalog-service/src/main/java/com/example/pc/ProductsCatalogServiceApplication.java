package com.example.pc;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.pc.model.Product;
import com.example.pc.repository.ProductRepository;

@SpringBootApplication
public class ProductsCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsCatalogServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(ProductRepository productRepository) {

		return args -> {
			List<Product> products = productRepository.findAll();
			System.out.println(products.size());
			products.forEach(System.out::println);
		};

	}

}
