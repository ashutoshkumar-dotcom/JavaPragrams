package com.list.programs;

public class NonStaticParam {

	void nonstaticparam(int a, int b) {
		int sum = a + b;
		System.out.println("Addition : " +sum);
	}
	
	public static void main(String[] args) {
		
		NonStaticParam obj = new NonStaticParam();
		obj.nonstaticparam(5,5);
		
	}
}
