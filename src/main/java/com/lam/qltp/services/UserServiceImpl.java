/**
 * 
 */
package com.lam.qltp.services;

import com.lam.qltp.entities.User;
import com.lam.qltp.models.UserModel;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.lam.qltp.repos.UserRepo;

/**
 * @author LamNguyen
 *
 */
@Service
@Primary
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
    public boolean authenticate(String username, String password) {
         // TODO Provide a sample password check: username == password
         return Objects.equals(username, password);
    }

	@Override
	public List<UserModel> findAll() {
		return UserModel.fromEntities(userRepo.findAll());
	}

	@Override
	public UserModel findById(Long id) {
		return UserModel.fromEntity(this.userRepo.findOne(id));
	}

	@Override
	public UserModel create(UserModel user, String password) {
		if (user != null) {
			User newUser = new User();
			newUser.setUserModel(user);
			// TODO set password
			newUser.setPasswordHash("");
			userRepo.save(newUser);
		}
		return user;
	}

	@Override
	public UserModel edit(UserModel user, String passwordOld, String passwordNew) {
		if (user != null) {
			User newUser = new User();
			newUser.setUserModel(user);
			// TODO check and set password
			newUser.setPasswordHash("");
			userRepo.save(newUser);
		}
		return user;
	}

	@Override
	public void deleteById(Long id) {
	this.userRepo.delete(id);
	}
	
}
