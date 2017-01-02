/**
 * 
 */
package com.lam.qltp.models;

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

   @Override
   public String toString() {
       return "User{" + "id=" + id + ", username='" + username + '\'' +
           ", fullName='" + fullName + '\'' + '}';
   }

}
