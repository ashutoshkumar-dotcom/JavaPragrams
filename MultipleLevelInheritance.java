package com.list.programs;

interface CompanyEmployee{
	void employeeName();
}
interface CompanyLocation{
	void Location();
}

public class MultipleLevelInheritance implements CompanyEmployee, CompanyLocation {

	public static void main(String[] args) {
		
		CompanyEmployee obj1 = new MultipleLevelInheritance();
		obj1.employeeName();
		CompanyLocation obj2 = new MultipleLevelInheritance();
		obj2.Location();
	}

	@Override
	public void Location() {
		System.out.println("Location is Bengaluru");
		
	}

	@Override
	public void employeeName() {
		System.out.println("Name of employee is Ashutosh");
		
	}

}
