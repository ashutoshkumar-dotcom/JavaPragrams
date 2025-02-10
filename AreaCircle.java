package com.list.programs;

import java.util.Scanner;

public class AreaCircle {

		public static void main(String[] args) {
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle :");
		double r = sc.nextDouble();
		double Area = pi*r*r;
		System.out.println("Area of Circle :" +Area);
		sc.close();
		
	}

}
