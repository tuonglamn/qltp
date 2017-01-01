/**
 * 
 */
package com.lam.qltp.models;

import java.util.Date;

/**
 * @author NguyenLam
 *
 */
public class PostModel {

	private Long id;

	private String title;

	private String body;

	private UserModel author;

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

	public UserModel getAuthor() {
		return author;
	}

	public void setAuthor(UserModel author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public PostModel(Long id, String title, String body, UserModel author) {

	}

	@Override
	public String toString() {
		return "Post{" + "id=" + id + ", title='" + title + "', author='" + author + "'}";
	}
}
