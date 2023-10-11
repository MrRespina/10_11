package com.ji.isa2;

public class Shoes extends Product {

	int size;

	public Shoes(String name, int price, int size) {
		super(name, price);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("사이즈 : " + size);
	}

}
