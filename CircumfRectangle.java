package com.list.programs;

import java.util.Scanner;

public class CircumfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a=sc.nextDouble();
		
		System.out.println("Enter the value of b :");
		double b=sc.nextDouble();
		
		double rectangle = 2*(a+b);
				
		System.out.println("Circumference of Rectangle :" +rectangle);
		sc.close();


	}

}
