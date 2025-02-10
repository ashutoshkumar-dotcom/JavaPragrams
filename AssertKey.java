package com.list.programs;

import java.util.Scanner;

public class AssertKey {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age in number :");
		int age = sc.nextInt();
		
		assert age>=18:"Age must be greater than 18";
		
		System.out.println("Welcome -- ");
		
		sc.close();

	}

}
