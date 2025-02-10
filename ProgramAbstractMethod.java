package com.list.programs;

abstract class Amazon_API // abstract class
{
	abstract void login(); // abstract method
	abstract void registration();
}
  
public class ProgramAbstractMethod extends Amazon_API
{  
public static void main(String args[])
{  
	Amazon_API obj = new ProgramAbstractMethod();
	obj.login();
	obj.registration();
}

@Override
void login() {
	// TODO Auto-generated method stub
	System.out.println("hi");
}

@Override
void registration() {
	// TODO Auto-generated method stub
	System.out.println("hello");
}
}
