package com.categoriesProduct.categoriesProduct.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	private String p_name;
	private int p_price;
	
	
	public  Products() {
		
	}


	public Products(int p_id, String p_name, int p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}


	public void setP_price(int p_price) {
		this.p_price = p_price;
	}


	@Override
	public String toString() {
		return "Products [p_id=" + p_id + ", p_name=" + p_name +  ", p_price=" + p_price + "]";
	}
	
	
}
