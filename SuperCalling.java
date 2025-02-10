package com.list.programs;

class Parent{
	
	Parent() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	 Child() {
		super();
		System.out.println("Child class");
	}
}

public class SuperCalling extends Child {
	
	SuperCalling(){
		super();
		System.out.println("Super calling ");
	}

	public static void main(String[] args) {
		
		new SuperCalling();
	

	}

}
