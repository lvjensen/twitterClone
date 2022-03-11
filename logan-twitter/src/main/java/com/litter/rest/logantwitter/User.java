package com.litter.rest.logantwitter;

import java.util.Date;
import java.util.List;

public class User {
	
	public Integer userId;
	public String userName;
	public String givenName;
	public Date pieDay;
	public List<Post> Posts;
	
	public User(Integer userId, String userName, String givenName, Date pieDay) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.givenName = givenName;
		this.pieDay = pieDay;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public Date getPieDay() {
		return pieDay;
	}

	public void setPieDay(Date pieDay) {
		this.pieDay = pieDay;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", givenName=" + givenName + ", pieDay=" + pieDay
				+ "]";
	}
	
	
	
	

}
