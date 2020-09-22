package com.sample.java8.interfaces;

import java.util.Date;
/**
 * New Java8 interface with its static and default methods.
 *
 * @author AANU
 *
 */
public interface Tradable {
	//the usual public abstract methods
	double sell();
	String buy();
	//static method
	static void printResult(String result) {
		System.out.println(result);
	}
	//default method
	default void printTime() {
		Date time = new Date();
		System.out.println(time);
	}
	//a constant
	static final String NAME = "Tradable Interface";
}
