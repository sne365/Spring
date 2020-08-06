package com.appdev.ws.appdev.service;

import java.util.List;

import com.appdev.ws.appdev.model.User;



public interface UserService {
	
	List<User> userList();
	
	User findById(Long id);
	
	User addUser(User user);
	
    String deleteuser(Long id);

}
