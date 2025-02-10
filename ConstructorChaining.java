package com.list.programs;

public class ConstructorChaining {

	ConstructorChaining(){
		this("Ashutosh");
		System.out.println("first constructor");
	}
	ConstructorChaining(String b){
		this(555);
		System.out.println("second constructor");
	}
	ConstructorChaining(int c){
		
		System.out.println("third constructor");
	}
	
	public static void main(String[] args) {
		
		new ConstructorChaining();

	}

}
