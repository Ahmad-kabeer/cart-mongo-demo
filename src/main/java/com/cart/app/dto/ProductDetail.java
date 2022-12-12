package com.cart.app.dto;

public class ProductDetail {
	private String id;
	private Integer qty;
	public ProductDetail() {
		super();
	}
	public ProductDetail(String id, Integer qty) {
		super();
		this.id = id;
		this.qty = qty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
