package com.cart.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.app.dto.Cart;
import com.cart.app.service.CartService;

@RestController
public class CartController {

	@Autowired private CartService cartService;
	
	@PostMapping("cart")
	public Cart createCart() {
		return this.cartService.createCart();
	}
	
	@PostMapping("cart/{cartId}/{productId}")
	public Cart addProductToCart(@PathVariable("cartId") String cartId,@PathVariable("productId") String productId) {
		return this.cartService.addProductToCart(cartId, productId);
	}
	
}
