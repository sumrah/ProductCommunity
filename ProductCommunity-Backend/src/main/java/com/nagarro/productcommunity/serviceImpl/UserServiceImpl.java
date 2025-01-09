package com.nagarro.productcommunity.serviceImpl;

import java.util.List;
import java.util.Set;

import com.nagarro.productcommunity.model.UserEntity;
import com.nagarro.productcommunity.model.UserRole;
import com.nagarro.productcommunity.repository.RoleRepository;
import com.nagarro.productcommunity.repository.UserRepository;
import com.nagarro.productcommunity.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;


	@Autowired
	private RoleRepository roleRepository;

	public UserEntity createUser(UserEntity user, Set<UserRole> userRoles) throws Exception {
		UserEntity local = this.userRepository.getUserByEmail(user.getEmail());
	if (local != null) {
		System.out.println("User exists");
			throw new Exception("User already present!");
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}

			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
			return local;
		}
}

	public UserEntity saveUser(UserEntity user) {
		return this.userRepository.save(user);
	}

	public UserEntity showUser(String email) {
		return this.userRepository.getUserByEmail(email);
	}

	public UserEntity fetchUserByEmailAndPassword(String email, String password) {
		return this.userRepository.findByEmailAndPassword(email, password);
	}

	public List<UserEntity> findAll() {
		return this.userRepository.findAll();
	}

	
}
	
	
	
	
	
	

