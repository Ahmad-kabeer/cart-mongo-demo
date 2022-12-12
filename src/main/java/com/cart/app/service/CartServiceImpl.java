package com.cart.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.app.dao.CartRepository;
import com.cart.app.dao.ProductsRepository;
import com.cart.app.dto.Cart;
import com.cart.app.dto.Product;
import com.cart.app.dto.ProductDetail;

@Service
public class CartServiceImpl implements CartService {

	@Autowired private CartRepository cartRepo;
	@Autowired private ProductsRepository productRepo;
	
	@Override
	public Cart addProductToCart(String cartId, String productId) {
		
		Optional<Cart> optCart = this.cartRepo.findById(cartId);
		if(optCart.isEmpty()) {
			
		}
		Cart cart = optCart.get();
		
		Optional<Product> optProduct = this.productRepo.findById(productId);
		if(optProduct.isEmpty()) {
			
		}
		Product product = optProduct.get();
		ProductDetail productDetails = new ProductDetail(productId, 1);
		cart.getProductDetails().add(productDetails);
		
		return this.cartRepo.save(cart);
	}

	@Override
	public Cart deleteProductFromCart(String cartId, String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart getCartById(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart setProductQtyToCart(String cartId, String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart createCart() {
		Cart cart = new Cart();
		return this.cartRepo.save(cart);
	}

}
