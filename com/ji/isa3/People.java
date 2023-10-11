package com.ji.isa3;

public class People {
	
	String name;
	String location;
	int age;
	
	public People() {
		super();
	}

	public People(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}
	
	public void printInfo() {
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
		System.out.println("지역 : "+location);
		
	}
	
	
	
	
	

}
