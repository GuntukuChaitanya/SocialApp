package com.example.demo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private PostService postServ;
	
	@GetMapping("/getPosts")
	public List<Post> getPosts(){
		return postServ.getAllPosts();
	}
	
	@GetMapping("/post/{id}")
	public Post getPostById(@PathVariable String id) {
		return postServ.getPostById(id);
	}
	
	@PostMapping("/post/new")
	public List<Post> addPost(@RequestBody Post post) {
		 postServ.addPost(post);
		 return postServ.getAllPosts();
	}
	
	@PutMapping("/post/update/{id}")
	public List<Post> updatePost(@PathVariable String id,@RequestBody Post post){
		postServ.updatePost(id, post);
		return postServ.getAllPosts();
	}
	
	@DeleteMapping("/post/{id}")
	public List<Post> deletePost(@PathVariable String id){
		postServ.deletePost(id);
		return postServ.getAllPosts();
	}
}
