package com.nagarro.productcommunity.serviceImpl;

import java.util.List;

import com.nagarro.productcommunity.model.Review;
import com.nagarro.productcommunity.repository.ProductReviewRepository;
import com.nagarro.productcommunity.services.ProductReviewService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductReviewServiceImpl implements ProductReviewService {

	
	@Autowired
	private ProductReviewRepository reviewRepository;
	
	public Review addReview(Review review) {
		return this.reviewRepository.save(review);
	}

	public List<Review> findByProductId(Long productId) {
		return this.reviewRepository.findByProductId(productId);
	}
	
	public List<Review>findAllReviews(){
		return this.reviewRepository.findAllReviews();
	}
	
	public void saveReview(Review review) {
		this.reviewRepository.save(review);
	}

	
	public List<Review> showProductReview(Long productId) {
		return this.reviewRepository.findAllById(productId);
		
	}

	
	public List<Review> findAll() {
		
		return this.reviewRepository.findAll();
	}

	
	
	
	
}
