package com.categoriesProduct.categoriesProduct.Entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	
	
	@OneToMany(targetEntity = Products.class,cascade = CascadeType.ALL)
	private List<Products> products;
	
	public Categories() {
		
	}

	public Categories(int c_id, String c_name, List<Products> products) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.products = products;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customers [c_id=" + c_id + ", c_name=" + c_name +", products=" + products + "]";
			
	}

	
}	