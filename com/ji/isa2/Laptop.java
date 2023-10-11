package com.ji.isa2;

public class Laptop extends Computer {

	double weight;
	double battery;

	public Laptop(double weight,double battery, Computer p) {
		
		super(p.name,p.cpu,p.hdd,p.ram,p.price);
		this.weight = weight;
		this.battery = battery;
		
	}
	
	public Laptop(String name, String cpu, int hdd, int ram, int price, double weight, double battery) {
		super(name, cpu, hdd, ram, price);
		this.weight = weight;
		this.battery = battery;
	}

	public void printInfo() {
		
		super.printInfo();
		System.out.println("무게 : "+weight);
		System.out.println("배터리 : "+battery);
		
	}

}
