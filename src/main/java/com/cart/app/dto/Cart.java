package com.cart.app.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {

	@Id
	private String id;

	private Map<String, Product> products = new HashMap<>();

	public Cart() {
		super();
	}

	public Cart(String id, Map<String, Product> products) {
		super();
		this.id = id;

		this.products = products;
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
