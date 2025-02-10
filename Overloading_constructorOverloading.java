package com.list.programs;

public class Overloading_constructorOverloading
{
 static void add( int a,int b)
 {
	 System.out.println("static method"+a);
	 System.out.println("static method"+b);
 }
 
 
// void add(String name,char gender)
// {
//	 System.out.println("nonstatic method"+name);
//   System.out.println("nonstatic method"+gender);
//  }
// 
// Overloading_constructorOverloading( boolean b,double d)
// {
//	 System.out.println("constructor method1"+b);
//	 System.out.println("constructor method1"+d);
// }
// Overloading_constructorOverloading( int a,int b)
// {
//	 System.out.println("constructor method2"+a);
//	 System.out.println("constructor method2"+b);
// }
	public static void main(String[] args)
	{
   add(20,30);
//   Overloading_constructorOverloading h2 = new Overloading_constructorOverloading(true, 1.4);
  // h2.add("Shragvi",'M');
 //  Overloading_constructorOverloading h3 = new Overloading_constructorOverloading(2,3);
//   new Overloading_constructorOverloading(true,20.5);
//   new Overloading_constructorOverloading(1234,3652);
	}

}