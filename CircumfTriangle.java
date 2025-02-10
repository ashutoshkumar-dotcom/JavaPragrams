package com.list.programs;

import java.util.Scanner;

public class CircumfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a=sc.nextDouble();
		
		System.out.println("Enter the value of b :");
		double b=sc.nextDouble();
		
		System.out.println("Enter the value of c :");
		double c=sc.nextDouble();
		
		double triangle = a+b+c;
				
		System.out.println("Circumference of Triangle :" +triangle);
		sc.close();

	}

}
