package com.ji.isa3;

public class Army extends People{

	String classes;

	public Army(String name, String location, int age, String classes) {
		super(name, location, age);
		this.classes = classes;
	}

	public Army(String classes) {
		super();
		this.classes = classes;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("계급 : "+classes);
		System.out.println("==========");
	}
	
	
}
