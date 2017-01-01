/**
 * 
 */
package com.lam.qltp.services;

import java.util.List;

import com.lam.qltp.models.Post;

/**
 * @author LamNguyen
 *
 */
public interface PostService {

	List<Post> findAll();
	
    List<Post> findLatest5();
    
    Post findById(Long id);
    
    Post create(Post post);
    
    Post edit(Post post);
    
    void deleteById(Long id);
	
}
