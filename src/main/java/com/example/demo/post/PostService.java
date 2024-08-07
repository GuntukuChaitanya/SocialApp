package com.example.demo.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.location.Location;
import com.example.demo.user.User;

@Service
public class PostService {
	User user1 = new User("u1","Chaitanya", "Guntuku","cg123@gmail.com", new Location("l1","Texas"));
	Post post1 = new Post("p1","08/07/2024","This is my first post",user1);
	User user2 = new User("u2","C2", "G2","cg2123@gmail.com", new Location("l2","New York"));
	Post post2 = new Post("p2","08/06/2024","This is my first post",user2);
	List <Post> posts = Arrays.asList(post1, post2);
	
	public List<Post> getAllPosts(){
		return posts;
	}
}
