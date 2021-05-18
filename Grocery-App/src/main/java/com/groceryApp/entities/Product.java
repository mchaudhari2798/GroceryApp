//package com.groceryApp.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Product {
//	
//	private String productName;
//	private long pid;
//	private int price;
//	
//	@OneToOne(targetEntity = Categories.class , fetch = FetchType.EAGER )
//	@JoinColumn(nullable = false, name = "catid")
//	private Categories categories;
//	
//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Product(String productName, long pid, int price) {
//		super();
//		this.productName = productName;
//		this.pid = pid;
//		this.price = price;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public long getPid() {
//		return pid;
//	}
//	public void setPid(long pid) {
//		this.pid = pid;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
//	
//	
//}
