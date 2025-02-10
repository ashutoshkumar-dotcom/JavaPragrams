package com.list.programs;

class Parent01{
	
	void test() {
		
		System.out.println("Parent mehod ");
	}
}

public class MethodOverriding extends Parent01{
	void test() {
		System.out.println("Child mehod ");
		}

	public static void main(String[] args) {
		
		Parent01 obj = new Parent01();
		obj.test();
	}

}
