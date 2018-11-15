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
public class Update {

	public static void main(String[] args) {
		SpringApplication.run(Update.class, args);
	}

	@Bean
	public CommandLineRunner test(EntityManagerFactory emf) {
		return args -> {

			/*
			 * selecting data by JPA, 4 ways
			 * 
			 * -> by primary key -> JPQL / HQL -> Criteria API ==> to make dynamic quiries
			 * -> Native SQL
			 * 
			 */

			System.out.println("=======================================");

			// Req1
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Product product = em.find(Product.class, 1);
			em.getTransaction().commit();
			em.close();

			System.out.println("-----------------------------------------");
			product.setPrice(1000);
			System.out.println("-----------------------------------------");

			// Req2
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(product);
			em.getTransaction().commit();
			em.close();

			System.out.println("=======================================");

		};
	}

}
