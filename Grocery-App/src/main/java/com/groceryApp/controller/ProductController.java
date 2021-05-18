package com.groceryApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.Product;
import com.groceryApp.repository.ProductRepository;

@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/")
	public Product SavePayment(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping("/pid")
	public String delete(@PathVariable long pid) {
		productRepository.deleteById(pid);
		return pid +": id deleted";
	} 
}
