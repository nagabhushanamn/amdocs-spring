package com.example.pc.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.pc.model.Product;

public interface ProductRepository extends MongoRepository<Product, ObjectId>{

}
