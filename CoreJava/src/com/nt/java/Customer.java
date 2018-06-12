
package com.nt.java;

public class Customer {
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
		return "Customer [prodid=" + prodid + ", name=" + name + "]";
	}
	
	private void sys() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	public static void main(String args[]) {
		System.out.println("Hi");
	}
}
