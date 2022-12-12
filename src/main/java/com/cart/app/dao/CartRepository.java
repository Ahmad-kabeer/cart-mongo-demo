package com.cart.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cart.app.dto.Cart;

public interface CartRepository extends MongoRepository<Cart, String>{

}
