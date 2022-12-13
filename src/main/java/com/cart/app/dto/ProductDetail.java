package com.cart.app.dto;

public class ProductDetail {
	
	private String productId;
	private String cartId;
	private Integer qty;
	
	public ProductDetail() {
		super();
	}

	public ProductDetail(String productId, String cartId, Integer qty) {
		super();
		this.productId = productId;
		this.cartId = cartId;
		this.qty = qty;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
