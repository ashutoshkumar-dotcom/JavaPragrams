package com.list.programs;

import java.util.Scanner;

public class AreaTrangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base :");
		int b=sc.nextInt();
		System.out.println("Enter the value of height :");
		int h=sc.nextInt();
		
		double Areatriangle = .5*b*h;
		
		System.out.println("Area of Triangle :" +Areatriangle);
		
		sc.close();


	}

}
