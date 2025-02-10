package com.list.programs;

public class MultipleMethods {
	
	static void stmethod1() {
		
		System.out.println("static method 1");
	}
	
	static void stmethod2() {
		
		System.out.println("static method 2");
	}
	
	static void stmethod3() {
		
		System.out.println("static method 3");
	}
	
	void nonstmethod1() {
		
		System.out.println("non-static method 1");
		
	}
    void nonstmethod2() {
		
    	System.out.println("non-static method 2");
	}

	public static void main(String[] args) {
			
		// static method calling
		
		stmethod1();
		stmethod2();
		stmethod3();
		
		// None-static method calling
		
		MultipleMethods obj1 = new MultipleMethods();
		obj1.nonstmethod1();
		obj1.nonstmethod2();
		
		
	}

}
