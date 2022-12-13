package com.cart.app.service;

import com.cart.app.dto.Cart;
import com.cart.app.dto.ProductDetail;

public interface CartService {
	
	Cart addProductToCart(ProductDetail productDetail);
	Cart deleteProductFromCart(String cartId,String productId);
	Cart getCartById(String cartId);
	Cart setProductQtyToCart(String cartId,String productId,Integer qty);
	Cart createCart();

}
