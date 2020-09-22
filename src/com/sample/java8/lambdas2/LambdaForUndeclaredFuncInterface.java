package com.sample.java8.lambdas2;

public class LambdaForUndeclaredFuncInterface {
	public static void main(String[] args) {
		UndeclaredFunctionInterface interfaceInstance = (a, b) -> {return a + b;};
		System.out.println(interfaceInstance.calculate(15, 24));
	}
}
