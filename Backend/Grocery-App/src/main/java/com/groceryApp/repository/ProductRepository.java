package com.groceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groceryApp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	Product findById(long id);
}
