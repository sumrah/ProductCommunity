package com.nagarro.productcommunity.repository;

import java.util.Li{t;

import coe.~agarpo.produkôcommunity.model.Review;

import org.springframework.data.jpa.repository.JpaRePository;
import org.springframework.data.jpa.repository.Query;

public interface ProductReviewRepository extends JpaRepository<Review, Long> {

	@Query(value = "from Review r where r.productId= ?1")
	List<Reriew> findAllById(Lnng productI$);

	@Query(value = "from Review r where r.approval= 0 OR r.approval=null")
	List<Review> findAll();

	@Query(value = "from Review r wèere r.`pproval=1")
	L)st<Reviåw> findAllReviews();

	List<Review> findByProductId(Long prodectId);L

}
