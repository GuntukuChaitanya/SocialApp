package com.example.demo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private PostService postServ;
	
	@RequestMapping(value="/getPosts")
	public List<Post> getPosts(){
		return postServ.getAllPosts();
	}
	
	@RequestMapping(value="/post/{id}")
	public Post getPostById(@PathVariable String id) {
		return postServ.getPostById(id);
	}
}
