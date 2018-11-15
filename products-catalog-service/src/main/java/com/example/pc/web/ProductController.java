package com.example.pc.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pc.model.Product;
import com.example.pc.repository.ProductRepository;

@CrossOrigin(origins="*")
@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value = "/products")
	public ResponseEntity<?> getAll(@RequestParam(required = false) Integer limit) {

		List<Product> products = null;
		if (limit != null) {
		} else
			products = productRepository.findAll();
		return ResponseEntity.ok().body(products);

	}

	@GetMapping(value = "/products/{id}")
	public ResponseEntity<?> getOne(@PathVariable String id) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not available");
		}

	}

	@PostMapping(value = "/products")
	public ResponseEntity<?> save(@RequestBody Product product) {
		Product savedProduct = productRepository.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
	}

	@PutMapping(value = "/products/{id}")
	public ResponseEntity<?> saveOrUpdate(@RequestBody Product product, @PathVariable String id) {
		Product savedProduct = productRepository.save(product);
		return ResponseEntity.status(HttpStatus.OK).body(savedProduct);
	}

	@DeleteMapping(value = "/products/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		productRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}
	

}
