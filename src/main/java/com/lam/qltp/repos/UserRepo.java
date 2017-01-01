/**
 * 
 */
package com.lam.qltp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lam.qltp.entities.User;

/**
 * @author LamNguyen
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
