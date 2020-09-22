package com.sample.java8.lambdas2;

import java.util.List;
/**
 * Here we annotated our interface with @Func....
 * This enforces the condition on interface 
 * to have a single abstract method
 * @author AANU
 *
 */
@FunctionalInterface
public interface AnnotatedFuctionalInterface {
	List<Integer> getTable(int k);
	
	default void printName(String name) {
		System.out.println(name);
	}
	
	static void printHello() {
		System.out.println("Hello");
	}
}
