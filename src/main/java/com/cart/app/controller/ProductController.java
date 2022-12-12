package com.cart.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.app.dto.Product;
import com.cart.app.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired private ProductService productService;
	
	@GetMapping("/")
	public String getGreeting() {
		return "Cart application.";
	}
	
	@PostMapping("product")
	public Product addNewProduct(@RequestBody Product product) {
	return this.productService.addNewProduct(product);	
	}
	
	@GetMapping("product/{id}")
	public Product getProductById(@PathVariable("id") String productId) {
	return this.productService.getProductById(productId);	
	}
	
	@PutMapping("product")
	public Product updateProduct(@RequestBody Product product) {
	return this.productService.updatProduct(product);	
	}
	@DeleteMapping("product/{id}")
	public Product deleteProductById(@PathVariable("id") String productId) {
	return this.productService.deleteProductById(productId);	
	}
	
	@GetMapping("products")
	public List<Product>getAllProducts() {
		return this.productService.getAllProducts();
	}
	
}
