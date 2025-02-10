package com.list.programs;

import java.util.Scanner;

public class ArithmeticOperationScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A :");
		int a = sc.nextInt();
		
		System.out.println("Enter value of B :");		
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Addition of two numbers :" +sum);
		
		int sub = a - b;
		System.out.println("Subtraction of two numbers :" +sub);
		
		int mul = a*b;
		System.out.println("Multiplication of two numbers :" +mul);
		
		int div = a/b;
		System.out.println("Division of two numbers :" +div);
		
		int mod = a%b;
		System.out.println("Modulus of two numbers :" +mod);
		
		sc.close();
		
		

	}

}
