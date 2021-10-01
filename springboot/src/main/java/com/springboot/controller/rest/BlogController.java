package com.springboot.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Post;
import com.springboot.service.impl.IPostService;

@RestController
@RequestMapping("/api/v1/blog")
public class BlogController {
	
	@Autowired
	private IPostService service;
	
	@PostMapping("/create")
	public List<Post> createPost(@RequestBody Post post) {
		return (List<Post>) service.findAll();	
	}
}
