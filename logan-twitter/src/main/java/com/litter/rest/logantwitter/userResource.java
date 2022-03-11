package com.litter.rest.logantwitter;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userResource {
	
	@Autowired
	userService service;
	
	@GetMapping("/users")
	public List<User> returnAllUsers(){
		
		return service.getAll();
	}
	
	@GetMapping("/users/{id}")
	public User returnOneUser(@PathVariable int id) {
		User usr = service.findOne(id);
		return usr;
		
	}
	
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User usr) {
		User user = service.saveUser(usr);
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id) {
		User user = service.deleteById(id);
		return user;
	}
	

}
