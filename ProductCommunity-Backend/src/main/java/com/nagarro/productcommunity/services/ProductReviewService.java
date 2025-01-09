package com.nagarro.productcommunity.services;

import java.util.List;

import com.nagarro.productcommunity.model.Review;

public interface ProductReviewService {

	public Review addReview(Review review);

	public List<Review> findByProductId(Long productId);

	public List<Review> showProductReview(Long productId);

	public List<Review> findAll();
	
	public void saveReview(Review review);

	public List<Review> findAllReviews();

	
	
}
