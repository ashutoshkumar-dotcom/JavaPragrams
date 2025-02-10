package com.list.programs;

class Test1{
	
	void t1() {
		System.out.println("class 1");
	}
	
}
class Test2 extends Test1{
	void t2() {
		System.out.println("class 2");
	}
}
class Test3 extends Test2{
	void t3() {
		System.out.println("class 3");
	}
}

public class MultiLevelInheritance extends Test3{
	
	void t4() {
		System.out.println("class 4");
	}

	public static void main(String[] args) {
		
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.t1();
		obj.t2();
		obj.t3();
		obj.t4();
		

	}

}
