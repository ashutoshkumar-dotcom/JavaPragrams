package com.list.programs;

interface Animal3{ // interface
	void domestic();
}
abstract class Animal4 implements Animal3{ // abstract class
	abstract void wild();
}
public class RelationshipClassAbClssInterface extends Animal4{ // class

	public static void main(String[] args) {
		
		Animal3 a1 = new RelationshipClassAbClssInterface();
		a1.domestic();
		Animal4 a2 = new RelationshipClassAbClssInterface();
		a2.wild();
		
	}

	@Override
	public void domestic() {
		System.out.println("wild");
		
	}

	@Override
	void wild() {
		System.out.println("domestic");
		
	}

	
}
