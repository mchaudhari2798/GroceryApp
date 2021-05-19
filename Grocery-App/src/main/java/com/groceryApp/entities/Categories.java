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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="category_id")
	private long cat_Id;
	private String category_name;
	
	@OneToMany(targetEntity = Categories.class , fetch = FetchType.EAGER )
	@JoinColumn(nullable = false, name = "productid")
	private Product product;
	
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public Categories() {
	
	}

	public Categories(long cat_Id, String category_name) {
		super();
		this.cat_Id = cat_Id;
		this.category_name = category_name;
	}

	public long getCat_Id(){
		return cat_Id;
	}

	public void setCat_Id(long cat_Id) {
		this.cat_Id = cat_Id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
    
    
 
}
