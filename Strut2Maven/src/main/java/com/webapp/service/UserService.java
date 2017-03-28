package com.webapp.service;

import java.util.List;

import com.webapp.model.User;
import com.webapp.repository.UserRepository;

public class UserService {
	private UserRepository userReposity;
	public UserService(){
		userReposity = new UserRepository();
	}
	public boolean create(User user){
		return userReposity.create(user);
	}
	public List<User> listAll(){
		return userReposity.listAll();
	}
}
