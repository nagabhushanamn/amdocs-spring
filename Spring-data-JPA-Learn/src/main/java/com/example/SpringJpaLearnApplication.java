package com.example;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@SpringBootApplication
public class SpringJpaLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaLearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(ProductRepository productRepository) {
		return args -> {

//			Product product = new Product();
//			product.setId(1);
//			product.setName("One");
//
//			productRepository.save(product);

			// -------------------------------

//			List<Product> products = productRepository.findAll();
			// List<Integer> ids = Arrays.asList(111, 222, 1);
			// List<Product> products = productRepository.findAllById(ids);
//
//			Product p = new Product();
//			p.setPrice(10);
//			Example<Product> example = Example.of(p);
//			List<Product> products = productRepository.findAll(example);
			List<Product> products = productRepository.queryByPrice(10);
			products.forEach(product -> System.out.println(product));

		};
	}
}
