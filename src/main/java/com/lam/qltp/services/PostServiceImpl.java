/**
 * 
 */
package com.lam.qltp.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.lam.qltp.entities.Post;
import com.lam.qltp.entities.User;
import com.lam.qltp.models.PostModel;
import com.lam.qltp.repos.PostRepo;
import com.lam.qltp.repos.UserRepo;

/**
 * @author LamNguyen
 *
 */
@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<PostModel> findAll() {
		return PostModel.fromEntities(postRepo.findAll());
	}

	@Override
	public List<PostModel> findLatest5() {
		return PostModel.fromEntities(postRepo.findLatest5Posts(new PageRequest(0, 5)));
	}

	@Override
	public PostModel findById(Long id) {
		return PostModel.fromEntity(postRepo.findOne(id));
	}

	@Override
	public PostModel create(PostModel post) {
		User author = userRepo.findOne(post.getAuthor());
		Date date = new Date();
		Post create = new Post(post.getId(), post.getTitle(), post.getBody(), author, date);
		return PostModel.fromEntity(postRepo.save(create));
	}

	@Override
	public PostModel edit(PostModel post) {
		User author = userRepo.findOne(post.getAuthor());
		Date date = new Date();
		Post create = new Post(post.getId(), post.getTitle(), post.getBody(), author, date);
		return PostModel.fromEntity(postRepo.save(create));
	}

	@Override
	public void deleteById(Long id) {
		postRepo.delete(id);
	}
	
}
