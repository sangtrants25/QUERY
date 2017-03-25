package com.webapp.service;

import java.util.List;

import com.webapp.model.User;
import com.webapp.repository.UserRepository;

public class UserService {
	private UserRepository userReposity;
	public UserService(){
		userReposity = new UserRepository();
	}
	public String create(User user){
		userReposity.create(user);
		return "";
	}
	public List<User> listAll(){
		return userReposity.listAll();
	}
}
