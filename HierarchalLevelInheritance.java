package com.list.programs;

class Bike{
	void test1() {
		System.out.println("Bike categories ..");
	}
	
}

class City100 extends Bike{
	void test2() {
		System.out.println("City100 mileage");
	}
	
}

class Honda extends Bike{
	void test3() {
		System.out.println("Honda mileage");
	}
}

class Sound extends Bike{
	void test4() {
		System.out.println("Loud sound");
	}
	
}

public class HierarchalLevelInheritance extends Sound {

	public static void main(String[] args) {
		
		HierarchalLevelInheritance obj = new HierarchalLevelInheritance();
		obj.test1();
	//	obj.test2();
	//	obj.test3();
		obj.test4();

	}

}
