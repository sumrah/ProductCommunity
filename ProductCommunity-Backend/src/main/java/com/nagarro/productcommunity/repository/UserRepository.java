package com.nagarro.productcommunity.repository;

import com.nagarro.productcommunity.model.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{
	
	public UserEntity findByEmailAndPassword(String email, String password);
	
	@Query("select u from UserEntity u where u.email = :email")
	public UserEntity getUserByEmail(@Param("email") String email);
	
	
	
	

}
