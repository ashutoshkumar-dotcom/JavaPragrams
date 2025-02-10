package com.list.programs;

abstract class Flipkart{
	abstract void login();
	abstract void logout();
	static void registration() {
		System.out.println("calling from registration");
	}
}
public class ProgramAbstractstaticmethod extends Flipkart{

	public static void main(String[] args) {
		Flipkart ref = new ProgramAbstractstaticmethod();
		ref.login();
		ref.logout();
		Flipkart.registration();
	}

	@Override
	void login() {
		System.out.println("Welcome");
		
	}

	@Override
	void logout() {
		System.out.println("Bye bye!");
		
	}

}
