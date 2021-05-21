package com.groceryApp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product{
	
	/**
	 * 
	 */
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private long id;
	
	private int categoryType;
	private String productName;
	private String productUrl;
	private String description;
	private int price;
	
	@ManyToOne
    @JoinColumn(name = "categoryType", referencedColumnName = "catType", insertable = false, updatable = false)
	private Categories categories;
	
	public Product(long id, String productName, String description, int price,String productUrl ,Categories categories ) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.productUrl=productUrl;
		this.categories = categories;
	}
	

	public Categories getCategories() {
		return categories;
	}


	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	// actual class
	public Product() {

	}

	
	public Product(long id, int categoryType, String productName, String description, int price,
			Categories categories) {
		super();
		this.id = id;
		this.categoryType = categoryType;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.categories = categories;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getCategoryType() {
		return categoryType;
	}


	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}


	public String getProductUrl() {
		return productUrl;
	}


	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	
	
	

	
}



