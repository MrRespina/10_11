package com.ji.isa3;

public class Student extends People{
	
	int classes;

	public Student(People p, int classes) {
		super(p.name, p.location, p.age);
		this.classes = classes;
	}

	public Student(int classes) {
		super();
		this.classes = classes;
	}
	
	public Student() {
		
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("학년 : "+classes+"학년");
		System.out.println("==========");
	}
	

}
