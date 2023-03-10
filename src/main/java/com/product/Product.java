package com.product;

import javax.persistence.Entity;



@Entity
public class Product {
	private int id;
	private String name;
	private String descreption;
	private long price;
	public Product(int id, String name, String descreption, long price) {
		super();
		this.id = id;
		this.name = name;
		this.descreption = descreption;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descreption=" + descreption + ", price=" + price + "]";
	}
	
	

}
