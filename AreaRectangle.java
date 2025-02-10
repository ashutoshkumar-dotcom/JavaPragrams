package com.list.programs;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Length :");
		int l=sc.nextInt();
		System.out.println("Enter the value of Width :");
		int w=sc.nextInt();
		
		double rectangle = l*w;
		
		System.out.println("Area of Rectangle :" +rectangle);
		sc.close();

	}

}
