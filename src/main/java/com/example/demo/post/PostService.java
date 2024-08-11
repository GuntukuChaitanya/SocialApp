package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepo;
	
	
	//Store Data Here
	List<Post> posts = new ArrayList<>();
	
	//Fetch all posts from Stored Data
	public List<Post> getAllPosts(){
		postRepo.findAll().forEach(posts::add);
		return posts;
	}
	
	//Gets Post by Id
	public Optional<Post> getPostById(String id) {
		return postRepo.findById(id);	
	}
	
	// Add New Post to Stored Data
	public void addPost(Post post) {
		postRepo.save(post);
	}
	
	//Update a Post by Id
	public void updatePost(String id, Post post) {
		postRepo.save(post);
	}
	
	//Delete a Post by Id from Stored Data
	public void deletePost(String id) {
		postRepo.deleteById(id);
	}
}
