package com.appdev.ws.appdev.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.ws.appdev.model.User;
import com.appdev.ws.appdev.repository.UserRepository;
import com.appdev.ws.appdev.service.UserService;

@Service
public class UserServiceImp implements UserService {

	public UserRepository userRepository;
	
	@Autowired
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	public List<User> userList(){
		return userRepository.findAll();
	}


	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}


	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}


	@Override
	public String deleteuser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		return "{Message: 'user deleted sucessfully'}";
	}
}
