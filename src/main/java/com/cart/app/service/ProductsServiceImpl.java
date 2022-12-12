package com.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.app.dao.ProductsRepository;
import com.cart.app.dto.Product;

@Service
public class ProductsServiceImpl implements ProductService{

	@Autowired
	private ProductsRepository productRepo;
	
	@Override
	public Product addNewProduct(Product product) {
		return this.productRepo.save(product);
	}

	@Override
	public Product getProductById(String id) {
		
		return this.productRepo.findById(id).get();
	}

	@Override
	public Product updatProduct(Product product) {
		
		return this.productRepo.save(product);
	}

	@Override
	public Product deleteProductById(String id) {
		Optional<Product> OptProduct = this.productRepo.findById(id);
		if(OptProduct.isEmpty())
		{
			
		}
		return OptProduct.get();
	}

	@Override
	public List<Product> getAllProducts() {
		return this.productRepo.findAll();
	}

}
