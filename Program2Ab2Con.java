package com.list.programs;

abstract class Misho{
	abstract void login();
	abstract void logout();
	void registration() {
		
		System.out.println("call from registration");
	}
	void forgotpass() {
		System.out.println("call from forgotpass");
	}
}
public class Program2Ab2Con extends Misho {

	public static void main(String[] args) {
		Misho ref = new Program2Ab2Con();
		ref.login();
		ref.registration();
		ref.forgotpass();
		ref.logout();

	}

	@Override
	void login() {
		System.out.println("Welcome to Misho");
		
	}

	@Override
	void logout() {
		System.out.println("Bye bye!");
		
	}

}
