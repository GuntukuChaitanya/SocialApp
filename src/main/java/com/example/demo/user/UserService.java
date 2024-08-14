package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepo;

	//Fetch All user in Stored Data
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
	//Get User Data by Id
	public Optional<User> getUserById(String id) {
		return userRepo.findById(id);
	}
	
	
	// Add User to Stored Data
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	// Update an User by Id
	public void updateUser(String id, User user) {
		userRepo.save(user);
	}
	
	///Delete User by Id from Stored Data
	public void deleteUser(String id) {
		userRepo.deleteById(id);
	}
	
	//Get User By LocationId
	public List<User> getUserByLocation(String locId){
		List<User> userAtLoc = new ArrayList<>();
		userRepo.findByLocationId(locId).forEach(userAtLoc::add);
		return userAtLoc;
	}
}
