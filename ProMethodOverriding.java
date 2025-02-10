package com.list.programs;

class Parentclass{
	
	void test() {
		System.out.println("Hello parent class method");
	}
}

public class ProMethodOverriding extends Parentclass {
	
	void test() {
		super.test();
		System.out.println("Hello child class method");
	}	

	public static void main(String[] args) {
		
		ProMethodOverriding obj = new ProMethodOverriding();
		obj.test();

	}

}
