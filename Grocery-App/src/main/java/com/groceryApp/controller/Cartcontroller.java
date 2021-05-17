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

import com.groceryApp.entities.Cart;
import com.groceryApp.service.CartService;

@RestController
@RequestMapping("/Cart")
public class Cartcontroller {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/")
	public Cart saveRegistration(@RequestBody Cart cart ) {
		return cartService.saveAll(cart);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Cart> listAllRegistration(Cart cart) {
		return cartService.findAllinCart(cart);
	}
	
	
	@DeleteMapping("/{id}")
	public Cart DeleteEmployee(@PathVariable("id") int id) {
		return cartService.DeleteById(id);
	}
	
	@PutMapping("/{id}")
	public Cart UpdateCart(@PathVariable("id") int id,@RequestBody Cart cart) {
		return cartService.update(cart);
	}
	
}

