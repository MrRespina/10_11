package com.ji.isa1;

public class Dog extends Animal {

	public Dog(String sort, String name, int age) {
		super(sort, name, age);
		
	}
	
	public void bark() {
		
		System.out.println(name+"가 bark!");
		
	}
	
	public void printInfo() {	super.printInfo();	}

}
