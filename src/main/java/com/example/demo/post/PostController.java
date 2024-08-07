package com.example.demo.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;
import com.example.demo.user.User;

@RestController
public class PostController {
	
	@RequestMapping(value="/getPosts")
	public List<Post> getAllPosts(){
		System.out.println("We are at posts");
		User user1 = new User("u1","Chaitanya", "Guntuku","cg123@gmail.com", new Location("l1","Texas"));
		Post post1 = new Post("p1","08/07/2024","This is my first post",user1);
		User user2 = new User("u2","C2", "G2","cg2123@gmail.com", new Location("l2","New York"));
		Post post2 = new Post("p2","08/06/2024","This is my first post",user2);
		return Arrays.asList(post1, post2);
	}

}
