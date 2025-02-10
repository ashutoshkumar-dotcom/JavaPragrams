package com.list.programs;

import java.util.Scanner;

public class MathScanner {
	
	static void valueInt(int a, int b) {
		
		System.out.println(Math.addExact(a, b)); // addition
		System.out.println(Math.subtractExact(a, b)); // subtraction
		System.out.println(Math.max(a, b)); // max int
		System.out.println(Math.min(a, b)); //min int
	}
	
	static void valueLong(long c, long d) {
		System.out.println(Math.max(c, d)); // max long
		System.out.println(Math.min(c, d)); //min long
	}
	
	static void valueDouble(double e, double f) {
		System.out.println(Math.max(e, f)); //max double
		System.out.println(Math.min(e, f)); // min double
	}
	
	static void valueFloat(float g, float h) {
		System.out.println(Math.max(g,h)); // max float
		System.out.println(Math.min(g, h)); // min float
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first int value :");
		int a = sc.nextInt();
		
		System.out.println("Enter second int value :");
		int b = sc.nextInt();
		
		System.out.println("Enter first long value :");
		long c = sc.nextLong();
		
		System.out.println("Enter second long value :");
		long d = sc.nextLong();
		
		System.out.println("Enter first double value :");
		double e = sc.nextDouble();
		
		System.out.println("Enter second double value :");
		double f = sc.nextDouble();
		
		System.out.println("Enter first float value :");
		float g = sc.nextFloat();
		
		System.out.println("Enter second float value :");
		float h = sc.nextFloat();
		
		valueInt(a,b);
		valueLong(c,d);
		valueDouble(e,f);
		valueFloat(g,h);
		
		sc.close();
	

	}

}
