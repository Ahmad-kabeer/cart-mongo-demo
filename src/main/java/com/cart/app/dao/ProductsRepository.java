package com.cart.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cart.app.dto.Product;

public interface ProductsRepository extends MongoRepository<Product, String>{

}
