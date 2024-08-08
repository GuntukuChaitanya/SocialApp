package com.example.demo.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.location.Location;

@Service
public class UserService {
	
	User user1 = new User("u1","Chaitanya", "Guntuku","cg123@gmail.com", new Location("l1","Texas"));
	User user2 = new User("u2","C2", "G2","cg2123@gmail.com", new Location("l2","New York"));
	
	//Store Data Here
	List<User> users = new ArrayList<>(Arrays.asList(user1,user2));
	
	//Fetch All user in Stored Data
	public List<User> getAllUsers(){
		System.out.println("We are at UserService");
		return users;
	}
	
	//Get User Data by Id
	public User getUserById(String id) {
		User requestedUser = users.stream().filter(user -> id.equals(user.getId())).findFirst().orElse(null);
		return requestedUser;
	}
	
	
	// Add User to Stored Data
	public void addUser(User user) {
		users.add(user);
	}
	
	// Update an User by Id
	public void updateUser(String id, User user) {
		for(int i=0;i<users.size();i++) {
			User u = users.get(i);
			if(u.getId().equals(id)) {
				users.set(i, user);
			}
		}
	}
	
	///Delete User by Id from Stored Data
	public void deleteUser(String id) {
		users.removeIf(user -> user.getId().equals(id));
	}
}
