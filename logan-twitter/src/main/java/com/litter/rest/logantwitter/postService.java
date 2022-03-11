package com.litter.rest.logantwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class postService {

	public static List<Post> posts = new ArrayList<>();
	
	static {
		
		posts.add(new Post(1, 1, new Date(), "this is a post"));
		posts.add(new Post(1, 2, new Date(), "this is a different post"));
		posts.add(new Post(1, 3, new Date(), "this is yet another post"));
		posts.add(new Post(2, 1, new Date(), "I DECLARE BANKRUPTCY"));
		posts.add(new Post(2, 2, new Date(), "I'm not superstitious, but I am a littlestitious"));
		posts.add(new Post(3, 1, new Date(), "Street youths!"));
		
	}
	
	public List<Post> getAllUserPosts(int userId){
		List<Post> userPosts = new ArrayList<>();
		for (Post post:posts) {
			if (post.getUserId()==userId) {
				userPosts.add(post);
			}
		}
		
		return userPosts;
		
	}
	
	public Post createPost(Post post) {
		int numPosts = 0;
		for(Post pst:posts) {
			if(pst.getUserId()==post.getUserId()) {
				numPosts++;
			}
		}
		post.setPostId(numPosts+1);
		posts.add(post);
		return post;
		
	}
	
	
	
}
