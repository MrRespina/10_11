package com.ji.isa1;

public class Animal {

	String sort;
	String name;
	int age;
	
	public Animal(String sort, String name, int age) {
		
		this.sort = sort;
		this.name = name;
		this.age = age;
		
	}
	
	
	public void printInfo() {
		
		System.out.println("종 : "+sort);
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
		
	}
	
	
	
}
