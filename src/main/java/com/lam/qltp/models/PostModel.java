/**
 * 
 */
package com.lam.qltp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lam.qltp.entities.Post;

/**
 * @author NguyenLam
 *
 */
public class PostModel {

	private Long id;

	private String title;

	private String body;

	private Long author;

	private Date date = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getAuthor() {
		return author;
	}

	public void setAuthor(Long author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public PostModel(){
		
	}

	public PostModel(Long id, String title, String body, UserModel author) {

	}
	
	public static PostModel fromEntity(Post post){
		PostModel result = new PostModel();
		result.id = post.getId();
		result.title = post.getTitle();
		result.body = post.getBody();
		return result;
	}
	
	public static List<PostModel> fromEntities(List<Post> posts){
		List<PostModel> results = new ArrayList<PostModel>();
		for(Post post: posts){
			results.add(fromEntity(post));
		}
		return results;
	}

	@Override
	public String toString() {
		return "Post{" + "id=" + id + ", title='" + title + "', author='" + author + "'}";
	}
}
