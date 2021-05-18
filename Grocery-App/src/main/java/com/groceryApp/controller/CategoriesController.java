package com.groceryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.Categories;
import com.groceryApp.repository.CategoriesRepository;

@RestController
@RequestMapping("/Categories")               
public class CategoriesController {
	
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@PostMapping("/")
	public Categories SaveAll(Categories categories) {
		return categoriesRepository.save(categories);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Categories> listAllRegistration(Categories categories) {
		return categoriesRepository.findAll();
	}
	
	@DeleteMapping("/{cat_Id}")
	public Categories Delete(@PathVariable("cat_Id") long cat_Id ) {
		return categoriesRepository.deleteById(cat_Id);
	}
	
	@PutMapping("{cat_Id}")
	public Categories Update(@PathVariable("cat_Id") long cat_Id, @RequestBody Categories categories) {
		return categoriesRepository.saveAndFlush(categories);
	}
	
}
