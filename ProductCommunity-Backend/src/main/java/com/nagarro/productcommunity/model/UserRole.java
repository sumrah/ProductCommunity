package com.nagarro.productcommunity.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_Id",referencedColumnName="id")
	private UserEntity user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="roleId",referencedColumnName="roleId")
	private Role role;

	public UserRole() {
		super();
		//TODO Auto-generated constructor stub
	}

	public UserRole(Long userRoleId, UserEntity user, Role role) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
	
	
	
	

}
