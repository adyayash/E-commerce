package com.microservices.product_service.repository;

import com.microservices.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

//MongoRepository: Spring Data MongoDB interface that provides out-of-the-box CRUD and query operations for MongoDB.
public interface ProductRepository extends MongoRepository<Product, String> {
}
