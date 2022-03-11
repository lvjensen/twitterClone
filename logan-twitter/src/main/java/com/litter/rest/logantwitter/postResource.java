package com.litter.rest.logantwitter;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postResource {

	@Autowired
	postService service;
	
	@GetMapping("/posts/{id}")
	public List<Post> getUserPosts(@PathVariable int id) {
		return service.getAllUserPosts(id);
	}
	
	@PostMapping("/posts")
	public Post createPost(@Valid @RequestBody Post post) {
		Post pst = service.createPost(post);
		return pst;
	}
	
}
