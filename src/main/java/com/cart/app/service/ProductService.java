package com.cart.app.service;

import java.util.List;

import com.cart.app.dto.Product;

public interface ProductService {
	
	Product addNewProduct(Product product);
	Product getProductById(String id);
	Product updatProduct(Product product);
	Product deleteProductById(String id);
	List<Product> getAllProducts();
}
