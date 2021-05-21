package com.groceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groceryApp.entities.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
	Categories deleteById(long id);

}
