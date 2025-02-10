package com.list.programs;

import java.util.Scanner;

public class CircumfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of pi :");
		double pi=sc.nextDouble();
		
		System.out.println("Enter the value of r :");
		double r=sc.nextDouble();
		
		double circle = 2*pi*r;
				
		System.out.println("Circumference of Circle :" +circle);
		sc.close();

	}

}
