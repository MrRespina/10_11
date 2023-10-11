package com.ji.isa1;

public class IMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat("샴고양이","미로",6);
		a.printInfo();
		Animal b = new Dog("말티즈","둥이",13);
		b.printInfo();
		Dog c = new Dog("푸들","후추",8);
		c.printInfo();
		c.bark();

	}

}
