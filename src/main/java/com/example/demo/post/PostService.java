package com.example.demo.post;

import java.util.ArrayList;
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
	
	//Store Data Here
	List<Post> posts = new ArrayList<>(Arrays.asList(post1, post2));
	
	//Fetch all posts from Stored Data
	public List<Post> getAllPosts(){
		return posts;
	}
	
	//Gets Post by Id
	public Post getPostById(String id) {
		Post requestedPost = posts.stream().filter(post->id.equals(post.getId())).findFirst().orElse(null);	
		return requestedPost;
	}
	
	// Add New Post to Stored Data
	public void addPost(Post post) {
		posts.add(post);
	}
	
	//Update a Post by Id
	public void updatePost(String id, Post post) {
		for(int i=0;i<posts.size();i++) {
			Post p = posts.get(i);
			if(p.getId().equals(id)) {
				posts.set(i, post);
			}
		}
	}
	
	//Delete a Post by Id from Stored Data
	public void deletePost(String id) {
		posts.removeIf(post -> post.getId().equals(id));
	}
}
