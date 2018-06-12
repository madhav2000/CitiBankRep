package com.nt.java;

public class Product {
	private int prodid;
	private String name;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", name=" + name + "]";
	}
	
	

}
