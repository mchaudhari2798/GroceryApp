package com.groceryApp.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Categories {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private long id;
	private String category_name;
	private int catType;
	private String categoryImage;
	
//	@OneToMany(mappedBy = "categories" )
//	@JoinColumn(name = "productid")
//	private Product product;
//	
//    public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public Categories(long id, String category_name, Product product) {
//		super();
//		this.id = id;
//		this.category_name = category_name;
//		this.product = product;
//	}
	
	public Categories() {
	
	}

	
	public Categories(long id, String category_name, int catType,String categoryImage) {
	super();
	this.id = id;
	this.category_name = category_name;
	this.catType = catType;
	this.categoryImage=categoryImage;
}

	public long getid(){
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public int getCatType() {
		return catType;
	}


	public void setCatType(int catType) {
		this.catType = catType;
	}


	public String getCategoryImage() {
		return categoryImage;
	}


	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
    
    
 
}
