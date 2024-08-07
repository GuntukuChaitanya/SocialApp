package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService uServ;
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		System.out.println("We are at UserController");
		return uServ.getAllUsers();
		}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable String id) {
		return uServ.getUserById(id);
	}
}