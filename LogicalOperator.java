package com.list.programs;

public class LogicalOperator {

 static void Test1() {
	 int a=5, b=10;
	 
	 if(b>a && a<b) {
			
			System.out.println("AND operator");
		}
 }
 
 static void Test2() {
	 int a=3, b=6;
	 if(b>a || a<b) {
			
			System.out.println("OR operator");
		}
 }
 
 static void Test3() {
	 int a= 8, b=9;
	 if(a != b) {
			
			System.out.println("NOT Operator");
			
		}
 }
	
	public static void main(String[] args) {
		
		Test1();
		Test2();
		Test3();
			
				
	}

}
