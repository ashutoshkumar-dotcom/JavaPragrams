package com.list.programs;

public class ChainingConstructor {
	
	ChainingConstructor(){
		this(123);
		System.out.println("chaining starts");
	}
	
	ChainingConstructor(int a){
		this("ABC", "TAK");
		System.out.println(a);
	}
	ChainingConstructor(String a, String b){
	
		System.out.println(a);
		System.out.println(b);
}
	

	public static void main(String[] args) {
		
		new ChainingConstructor();
	}

}
