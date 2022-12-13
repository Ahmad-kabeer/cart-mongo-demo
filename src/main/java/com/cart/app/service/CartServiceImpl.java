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

	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private ProductsRepository productRepo;

	@Override
	public Cart addProductToCart(ProductDetail productDetail) {

		Optional<Cart> optCart = this.cartRepo.findById(productDetail.getCartId());
		if (optCart.isEmpty()) {

		}
		Cart cart = optCart.get();

		if (cart.getProducts().containsKey(productDetail.getProductId())) {
			Product product = cart.getProducts().get(productDetail.getProductId());
			product.setQuantity(product.getQuantity() + productDetail.getQty());

			return this.cartRepo.save(cart);
		}

		Optional<Product> optProduct = this.productRepo.findById(productDetail.getProductId());
		if (optProduct.isEmpty()) {

		}
		Product product = optProduct.get();

		product.setQuantity(productDetail.getQty());

		cart.getProducts().put(product.getId(), product);
		return this.cartRepo.save(cart);
	}

	@Override
	public Cart deleteProductFromCart(String cartId, String productId) {
		Optional<Cart> optCart = this.cartRepo.findById(cartId);
		if (optCart.isEmpty()) {

		}
		Cart cart = optCart.get();
		if (!cart.getProducts().containsKey(productId)) {

		}
		cart.getProducts().remove(productId);

		return this.cartRepo.save(cart);
	}

	@Override
	public Cart getCartById(String cartId) {
		Optional<Cart> optCart = this.cartRepo.findById(cartId);
		if (optCart.isEmpty()) {

		}

		return optCart.get();
	}

	@Override
	public Cart setProductQtyToCart(String cartId, String productId, Integer qty) {
		Optional<Cart> optCart = this.cartRepo.findById(cartId);
		if (optCart.isEmpty()) {

		}
		Cart cart = optCart.get();
		if (!cart.getProducts().containsKey(productId)) {

		}

		cart.getProducts().get(productId).setQuantity(qty);

		return this.cartRepo.save(cart);
	}

	@Override
	public Cart createCart() {
		Cart cart = new Cart();
		return this.cartRepo.save(cart);
	}

}
