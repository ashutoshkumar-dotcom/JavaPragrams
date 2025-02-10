package com.list.programs;

public class ConsOverloading {

	ConsOverloading(int a, int b){
		
		int mul = a*b;
		
		System.out.println("mul :"+mul);
	}
	ConsOverloading(double c, double d){
		
		double div = c/d;
		System.out.println("div :"+div);
	}
	
	public static void main(String[] args) {
		
		new ConsOverloading(2,4);
		new ConsOverloading(8.4,4.2);
	}

}
