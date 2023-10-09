package com.example.Cozentus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Cozentus.model.category;

@Repository
public class categorycontroller {
	
	
	@Autowired
	private categorycontroller categorycontro;
	
	
	@GetMapping("")
	public List<category>createcategory(category){
		
	return categorycontro.save(category);
		
	}
	
	
	
	
	
	
	

}
