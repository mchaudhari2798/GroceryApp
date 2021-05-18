package com.groceryApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="category_id")
	private long cat_Id;
	private String category_name;
	
    public Categories() {
	
	}

	public Categories(long cat_Id, String category_name) {
		super();
		this.cat_Id = cat_Id;
		this.category_name = category_name;
	}

	public long getCat_Id() {
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
