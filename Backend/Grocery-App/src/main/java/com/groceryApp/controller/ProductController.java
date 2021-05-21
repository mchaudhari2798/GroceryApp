package com.groceryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.Product;
import com.groceryApp.repository.ProductRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/")
	public Product SaveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public List<Product> listAllProduct(Product product) {
		return productRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id") long id){
		return productRepository.findById(id);
	}

	
	@DeleteMapping("/id")
	public String delete(@PathVariable long id) {
		productRepository.deleteById(id);
		return id +": id deleted";
	} 
}
