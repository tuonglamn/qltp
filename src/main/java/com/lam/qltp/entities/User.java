/**
 * 
 */
package com.lam.qltp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lam.qltp.models.UserModel;

/**
 * @author LamNguyen
 *
 */
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 30, unique = true)
	private String username;
	
	@Column(length = 60)
	private String passwordHash;
	
	@Column(length = 160)
	private String fullName;
	
	public User(){
		
	}
	
	public User(Long id, String username, String fullName) {
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setUserModel(UserModel model) {
		this.username = model.getUsername();
		this.fullName = model.getFullName();
	}
	
	@Override
	public String toString() {
		return "User{" +
		"id=" + id +
		", username='" + username + '\'' +
		", passwordHash='" + passwordHash + '\'' +
		", fullName='" + fullName + '\'' +
		'}';
	}
}
