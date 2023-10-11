package com.ji.isa3;

public class IMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name="홍길동";
		s1.age=12;
		s1.location="강서초등학교";
		s1.classes=5;
		s1.printInfo();
		
		People p = new People("칼리스타","강남초등학교",13);
		Student s2 = new Student(p,6);
		s2.printInfo();
		
		Army a = new Army("김군인","백골부대",23,"병장");
		a.printInfo();

	}

}
