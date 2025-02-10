package com.list.programs;

abstract class Vmart{
	abstract void login();
	abstract void registration();
	abstract void logout();
	void forgotpass(){
		System.out.println("Forgot password");
	}
}
public class Program3Ab1Con extends Vmart {

	public static void main(String[] args) {
		Vmart obj = new Program3Ab1Con();
		obj.login();
		obj.registration();
		obj.forgotpass();
		obj.logout();

	}

	@Override
	void login() {
		System.out.println("Welcome to Vmart");
		
	}

	@Override
	void registration() {
		System.out.println("Registration Page");
		
	}

	@Override
	void logout() {
		System.out.println("Bye bye!");
		
	}

}
