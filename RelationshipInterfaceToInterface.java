package com.list.programs;
interface Animal1{ // interface
	void wildAnimal();
}
interface Animal2 extends Animal1{ // interface
	void domesticAnimal();
}
public class RelationshipInterfaceToInterface implements Animal2 { // class

	public static void main(String[] args) {
		
		Animal1 a1 = new RelationshipInterfaceToInterface();
		a1.wildAnimal();
		Animal2 a2 = new RelationshipInterfaceToInterface();
		a2.domesticAnimal();
	}

	@Override
	public void wildAnimal() {
		System.out.println("I am wild");
		
	}

	@Override
	public void domesticAnimal() {
		System.out.println("I am domestic");
		
	}

}
