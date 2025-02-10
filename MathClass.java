package com.list.programs;

public class MathClass {

	public static void main(String[] args) {
		System.out.println(Math.addExact(5, 5)); // addition
		System.out.println(Math.subtractExact(10, 4)); // subtraction
		System.out.println(Math.max(10, 4)); // max int
		System.out.println(Math.max(45, 109874273)); // max long
		System.out.println(Math.max(47797985, 109874273)); //max double
		System.out.println(Math.max(45.7, 9.01)); // max float
		System.out.println(Math.min(45, 109874273)); //min int
		System.out.println(Math.min(409890895, 874273)); //min long
		System.out.println(Math.min(98798789, 899874273)); // min double
		System.out.println(Math.min(7.9, 1.1)); // min float
		
	}

}
