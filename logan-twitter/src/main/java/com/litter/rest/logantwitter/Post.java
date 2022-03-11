package com.litter.rest.logantwitter;

import java.util.Date;

public class Post {
	
	public int userId;
	public int postId;
	public Date postDate;
	public String post;
	public Post(int userId, int postId, Date postDate, String post) {
		super();
		this.userId = userId;
		this.postId = postId;
		this.postDate = postDate;
		this.post = post;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", postId=" + postId + ", postDate=" + postDate + ", post=" + post + "]";
	}
	
	

}
