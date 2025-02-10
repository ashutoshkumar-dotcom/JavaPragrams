package com.list.programs;

interface Company{
	void name();
}

public class RelationshipClassInterface implements Company{

	public static void main(String[] args) {
		
		Company obj = new RelationshipClassInterface();
		obj.name();
	}

	@Override
	public void name() {
		
		System.out.println("RelationshipClassInterface");
		
	}

}
