package com.list.programs;

public class ContinueKeySkipPro {

	public static void main(String[] args) {
		
		for(int i =1; i<=31; i++) {
			
			if(i==4 || i==17 || i==28) {
				
				continue;
			}
			
			System.out.println(i);
		}


	}

}
