package com.ji.isa2;

public class Product {
	
	String name;
	int price;
	
	public Product(String name, int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	public void printInfo() {
		
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price);
		
	}
	
	

}
