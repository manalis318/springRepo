package com.zensar.entities;

/*
 * Author: Manali Sharma
 * Creation Date: 25th Jul 2019 5.55PM IST
 * Modified Date: 30th Jul 2019 3:10PM IST
 * Version: 3.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product.
 * It is a value object of application,
 * domain or application object.
 * It is also POJO.
 * */



public class Product {
	
	
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	
	public Product(){
		
	}

	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
