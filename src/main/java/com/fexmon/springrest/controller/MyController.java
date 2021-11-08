package com.fexmon.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fexmon.springrest.pojo.Users;
import com.fexmon.springrest.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	

	
	//get List
	@GetMapping("/Users")
	public List<Users> getUsers(){
		return this.userService.getUsers();
	}
	
	//get single id
	@GetMapping("/Users/{id}")
	public Users getUser(@PathVariable String id) {
		return this.userService.getUsers(Integer.parseInt(id));
	}
	
	//Add & Put Vlues in
	@PostMapping("/Users")
	public Users addUsers(@RequestBody Users users) {
		return  this.userService.addUsers(users);
	}

}
