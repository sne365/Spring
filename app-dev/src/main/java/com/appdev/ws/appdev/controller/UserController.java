package com.appdev.ws.appdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.ws.appdev.model.User;
import com.appdev.ws.appdev.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService){
		this.userService=userService;
	}
	
	@RequestMapping("/list")
	public List<User> userList(){
	return userService.userList();	
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id){
		
		return userService.deleteuser(id);
	}
		

	/*@RequestMapping("/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id){
		 User user = userService.findById(id);
		  if (user == null) {
		   return new ResponseEntity<User> (HttpStatus.NOT_FOUND);
		  }
		  userService.deleteuser(id);
		  return new ResponseEntity<User> (HttpStatus.OK);
		
	}*/
	
	@RequestMapping("/add")
	public User addUser(@RequestBody User user){
		System.out.print("hi");
		return userService.addUser(user);
		
	}
	
	@RequestMapping("/list/{id}")
	public User findOne(@PathVariable Long id){
		return userService.findById(id);
	}
}

