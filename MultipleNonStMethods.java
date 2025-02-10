package com.list.programs;

public class MultipleNonStMethods {

	 void nonstmethod1() {
		
		System.out.println("None static method 1");
	}
	
	 void nonstmethod2() {
		
		System.out.println("None static method 2");
	}
	
	 void nonstmethod3() {
		
		System.out.println("None static method 3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleNonStMethods obj1 = new MultipleNonStMethods();
		obj1.nonstmethod1();
		
		MultipleNonStMethods obj2 = new MultipleNonStMethods();
		obj2.nonstmethod2();
		
		MultipleNonStMethods obj3 = new MultipleNonStMethods();
		obj3.nonstmethod3();

	}

}
