package com.list.programs;

import java.util.Scanner;

public class SwitchProgam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Input :");
		
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("Welcome to case 1 ");
			break;
		case 2:
			System.out.println("Welcome to case 2 ");
			break;
		default:
			System.out.println("Wrong Input..");
			break;
		
		}
		sc.close();
	}

}
