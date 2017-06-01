/**
 * 
 */
package com.lam.qltp.services;

import java.util.List;

import com.lam.qltp.models.UserModel;

/**
 * @author LamNguyen
 *
 */

public interface UserService {
	boolean authenticate(String username, String password);
	List<UserModel> findAll();
	UserModel findById(Long id);
	UserModel create(UserModel user, String password);
	UserModel edit(UserModel user, String passwordOld, String passwordNew);
	void deleteById(Long id);
}
