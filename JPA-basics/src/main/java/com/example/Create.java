package com.example;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Boy;
import com.example.model.Employee;
import com.example.model.Gender;
import com.example.model.Girl;
import com.example.model.Product;

//@SpringBootApplication
public class Create {

	public static void main(String[] args) {
		SpringApplication.run(Create.class, args);
	}

	@Bean
	public CommandLineRunner test(EntityManagerFactory emf) {
		return args -> {

			

			System.out.println("=======================================");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Product product=new Product();// Transient
			product.setId(2);
			product.setName("product2");
			product.setPrice(100.00);

			em.persist(product);  // Managed
		
			product.setPrice(100);
			
			em.getTransaction().commit();
			System.out.println("=======================================");

		};
	}

}
