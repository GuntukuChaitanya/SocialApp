package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Optional<User> getUserById(@PathVariable String id) {
		return uServ.getUserById(id);
	}
	
	@PostMapping("/user/new")
	public List<User> addUser(@RequestBody User user) {
		uServ.addUser(user);
		return uServ.getAllUsers();
	}
	
	@PutMapping("/user/update/{id}")
	public List<User> updateUser(@PathVariable String id, @RequestBody User user){
		uServ.updateUser(id, user);
		return uServ.getAllUsers();
	}
	
	@DeleteMapping("/user/{id}")
	public List<User> deleteUser(@PathVariable String id){
		uServ.deleteUser(id);
		return uServ.getAllUsers();
	}
}