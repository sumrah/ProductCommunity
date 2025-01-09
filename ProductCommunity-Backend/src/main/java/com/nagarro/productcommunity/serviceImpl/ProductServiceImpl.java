package com.nagarro.productcommunity.serviceImpl;

import java.util.List;

import com.nagarro.productcommunity.model.Product;
import com.nagarro.productcommunity.repository.ProductRepository;
import com.nagarro.productcommunity.services.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	public List<Product> fetchByProductNameOrBrandOrProductCode(String query) {
		
		if(query!=null) {
			return productRepository.findByKeyword(query);
		}
		return productRepository.findAll();
	}

	
	public Product saveProduct(Product product) {
		System.out.println(product.toString());
		
		return this.productRepository.save(product);
	}

	
	public Product displaySingleProduct(Long productId) {
		
		return this.productRepository.findById(productId).orElse(null);
	}

	
	public Product searchByProductCode(String productCode) {
		
		return this.productRepository.findByProductCode(productCode);
	}

	
	public List<Product> findAll() {
		
		return this.productRepository.findAll();
	}
	
//	public Status addProduct(@Valid Product product) {
//		List<Product> products =productRepository.findAll();
//		for(Product prod:products) {
//			if(prod.equals(product)) {
//				System.out.println("Product already exists");
//				return Status.PRODUCT_ALREADY_EXISTS;
//			}
//		}
//		productRepository.save(product);
//		 return Status.SUCCESS;
//	}
	
	
	

}
