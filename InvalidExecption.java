package com.list.programs;

import java.util.Scanner;

public class InvalidExecption {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number only:");
		
		int num = sc.nextInt();
		
		System.out.println("Entered Number is :" +num);
			
		sc.close();

	}

}
