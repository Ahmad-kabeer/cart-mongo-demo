package com.cart.app.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {

	@Id
	private String id;
	
	private List<ProductDetail> productDetails = new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(String id, List<ProductDetail> productDetails) {
		super();
		this.id = id;
		this.productDetails = productDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

}
