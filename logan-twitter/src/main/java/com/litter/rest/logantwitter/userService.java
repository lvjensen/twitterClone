package com.litter.rest.logantwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class userService {
	
	public static List<User> users = new ArrayList<>();
	
	private static Integer userCount = 3;
	
	static {
		
		users.add(new User(1, "adamislit", "Adam", new Date()));
		users.add(new User(2, "crazyeve", "Eve", new Date()));
		users.add(new User(3, "imnotfrank", "Franklin", new Date()));
		
	}
	
	public List<User> getAll(){
		return users;	
	}
	
	public User saveUser(User user) {
		if (user.getUserId()==null) {
			user.setUserId(++userCount);
		}
		
		users.add(user);
		
		return user;
	}
	
	public User findOne(Integer id) {
		
		for(User user:users) {
			if (user.getUserId()==id) {
				return user;
			}
		}
		
		return null;
		
	}
	
	public User deleteById(Integer id){
		
		Iterator<User> user = users.iterator();
		while (user.hasNext()) {
			User usr = user.next();
			
			if (usr.getUserId()==id) {
				user.remove();
				return usr;
			}
		}
		
		return null;
		
	}

}
