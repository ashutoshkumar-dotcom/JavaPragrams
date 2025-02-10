package com.list.programs;

import java.util.Scanner;

public class AreaSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a1 :");
		int a1=sc.nextInt();
		System.out.println("Enter the value of a2 :");
		int a2=sc.nextInt();
		
		double square = a1*a2;
		
		System.out.println("Area of Rectangle :" +square);
		sc.close();
	}

}
