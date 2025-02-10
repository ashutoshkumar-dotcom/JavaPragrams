package com.list.programs;

import java.util.Scanner;

public class CircumfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of l :");
		double l=sc.nextDouble();
			
		double square = 4*l;
				
		System.out.println("Circumference of Rectangle :" +square);
		sc.close();

	}

}
