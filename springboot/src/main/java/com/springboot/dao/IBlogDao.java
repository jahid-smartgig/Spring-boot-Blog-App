package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.model.Post;

public interface IBlogDao extends CrudRepository<Post, Integer>{

}
