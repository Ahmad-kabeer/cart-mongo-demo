package com.cart.app.service;

import com.cart.app.dto.Cart;

public interface CartService {
	
	Cart addProductToCart(String cartId,String productId);
	Cart deleteProductFromCart(String cartId,String productId);
	Cart getCartById(String cartId);
	Cart setProductQtyToCart(String cartId,String productId);
	Cart createCart();

}
