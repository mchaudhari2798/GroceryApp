package com.groceryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Categories")               
public class CategoriesController {
	
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@PostMapping("/")
	public Categories SaveAll(@RequestBody Categories categories) {
		return categoriesRepository.save(categories);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Categories> listAllRegistration(Categories categories) {
		return categoriesRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public Categories Delete(@PathVariable("id") long id ) {
		return categoriesRepository.deleteById(id);
	}
	
	@PutMapping("{id}")
	public Categories Update(@PathVariable("id") long id, @RequestBody Categories categories) {
		return categoriesRepository.save(categories);
	}
	
}
