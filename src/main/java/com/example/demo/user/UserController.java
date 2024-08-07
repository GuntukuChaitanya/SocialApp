package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;

@RestController
public class UserController {
	
	@RequestMapping(value="/getUsers")
	public List<User> getAllUsers(){
		System.out.println("We are at Users");
		User user1 = new User("u1","Chaitanya", "Guntuku","cg123@gmail.com", new Location("l1","Texas"));
		User user2 = new User("u2","C2", "G2","cg2123@gmail.com", new Location("l2","New York"));
		return Arrays.asList(user1,user2);
	}

}
