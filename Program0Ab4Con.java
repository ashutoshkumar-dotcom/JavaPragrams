package com.list.programs;

abstract class Dmart{
	
	void egg() {
		System.out.println("egg");
	}
	void bread() {
		System.out.println("bread");
	}
	void milk() {
		System.out.println("milk");
	}
	void biscuit() {
		System.out.println("biscuit");
	}
}

public class Program0Ab4Con extends Dmart{

	public static void main(String[] args) {
		
		Dmart obj = new Program0Ab4Con();
		obj.egg();
		obj.bread();
		obj.milk();
		obj.biscuit();
	}

}
