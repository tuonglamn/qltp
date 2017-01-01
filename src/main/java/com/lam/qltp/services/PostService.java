/**
 * 
 */
package com.lam.qltp.services;

import java.util.List;

import com.lam.qltp.models.PostModel;

/**
 * @author LamNguyen
 *
 */
public interface PostService {

	List<PostModel> findAll();
	
    List<PostModel> findLatest5();
    
    PostModel findById(Long id);
    
    PostModel create(PostModel post);
    
    PostModel edit(PostModel post);
    
    void deleteById(Long id);
	
}
