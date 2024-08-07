package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService uServ;
	
	@RequestMapping(value="/getUsers")
	public List<User> getUsers(){
		System.out.println("We are at UserController");
		return uServ.getAllUsers();
		}
}
