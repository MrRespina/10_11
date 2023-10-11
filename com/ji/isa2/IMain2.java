package com.ji.isa2;

public class IMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product("NEWB",18000);
		p.printInfo();
		
		Shoes s = new Shoes(p.name,p.price,275);
		s.printInfo();
		
		Computer c = new Computer("내컴퓨터","3600X",500,32,1000000);
		c.printInfo();
		
		Laptop l = new Laptop(20.8,1.2,c);
		l.printInfo();
		
		Laptop l2 = new Laptop("내노트북","3200G",500,16,850000,20.8,1.2);
		l2.printInfo();
		

	}

}
