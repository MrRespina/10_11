package com.ji.isa2;

public class Computer extends Product{

	String cpu;
	int hdd;
	int ram;
	
	public Computer(String name,String cpu,int hdd, int ram, int price) {
		super(name, price);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	public void printInfo() {
		
		super.printInfo();
		System.out.println("CPU : "+cpu);
		System.out.println("RAM : "+ram+"GB");
		System.out.println("HDD : "+hdd+"GB");
		
	}

	
	
}
