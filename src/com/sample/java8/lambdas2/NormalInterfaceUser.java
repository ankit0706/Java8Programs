package com.sample.java8.lambdas2;

import java.util.Date;

public class NormalInterfaceUser implements NormalInterface{

	public static void main(String[] args) {
		NormalInterfaceUser user = new NormalInterfaceUser();
		user.sayHelloInLanguage("spanish", "Ankit");
		user.getTime();
	}

	@Override
	public void sayHelloInLanguage(String language, String name) {
		switch(language) {
		case "german":
			System.out.println("Hallo " + name);
			break;
		case "spanish":
			System.out.println("Hola " + name);
			break;
		default:
			System.out.println("Hello" + name);
			break;
		}
	}

	@Override
	public void getTime() {
		System.out.println(new Date());
	}

}
