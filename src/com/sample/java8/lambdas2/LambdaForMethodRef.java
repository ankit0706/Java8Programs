package com.sample.java8.lambdas2;

public class LambdaForMethodRef {

	public static void main(String[] args) {
		//=== STYLE 1 using class's static method ===
		//MethodRefInterface methodRefInterface = LambdaForMethodRef::printInEnglish;
		//methodRefInterface.printName("Ankit");
		//=== STYLE 2 using instance method ===
		LambdaForMethodRef classObject = new LambdaForMethodRef();
		MethodRefInterface methodRefInterface = classObject::printLetters;
		methodRefInterface.printName("Ankit");
	}
	
	private static void printInEnglish(String name) {
		System.out.println("Hello " + name);
	}
	
	void printLetters(String name) {
		int size = name.length();
		int i = 0;
		while(i < size) {
			char c = name.charAt(i);
			System.out.println(c);
			i++;
		}
	}
}
