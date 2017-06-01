/**
 * 
 */
package com.lam.qltp.models;

import java.util.ArrayList;
import java.util.List;

import com.lam.qltp.entities.User;

/**
 * @author LamNguyen
 *
 */
public class UserModel {
	
	private Long id;
	
	private String username;
		
	private String fullName;
	
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public UserModel(){
		
	}
	
	public UserModel(Long id, String username, String fullName) { 
        this.id = id; this.username = username; this.fullName = fullName;
    }

	public static UserModel fromEntity(User user){
		if (user == null){
			return null;
		} else {
			UserModel result = new UserModel();
			result.id = user.getId();
			result.username = user.getUsername();
			result.fullName = user.getFullName();
			return result;
		}
	}
	
	public static List<UserModel> fromEntities(List<User> users){
		List<UserModel> results = new ArrayList<UserModel>();
		if (!users.isEmpty()){
			for(User user: users){
				results.add(fromEntity(user));
			}
		}
		return results;
	}
	
	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\'' +
				", fullName='" + fullName + '\'' + '}';
	}

}
