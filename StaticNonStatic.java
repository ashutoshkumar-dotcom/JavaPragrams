package com.list.programs;

public class StaticNonStatic {
	
	static void Test1(int a, int b) {	
		int sum = a + b;
		System.out.println("Sum :"+sum);
	}
	static void Test1(double c, double d) {
		double sub = c - d;
		System.out.println("Sub :"+sub);
	}
	
	void Test2(int e, int f) {
		int mul = e*f;
		System.out.println("Mul :"+mul);
	}
	void Test2(double g, double h) {
		double div = g/h;
		System.out.println("Div :"+div);
	}

	public static void main(String[] args) {
		
		Test1(2,4);
		Test1(1.1,1.1);
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.Test2(3, 5);
		obj.Test2(4.2, 2.1);

	}

}
