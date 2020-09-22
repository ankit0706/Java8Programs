package com.sample.java8.lambdas2;

import java.util.ArrayList;
import java.util.List;

/**
 * User class of annotated functional interface
 * @author AANU
 *
 */
public class LambdaForAnnotatedFuncInterface{
	public static void main(String[] args) {
		//use of static method
		AnnotatedFuctionalInterface.printHello();
		
		//use of abstract method
		AnnotatedFuctionalInterface example = k -> {
			ArrayList<Integer> table = new ArrayList<>();
			int i = 1;
			while(i < 11) {
				int item = k * i;
				table.add(item);
				i++;
			}
			return table;
		};
			
		System.out.println(example.getTable(15));
		//use of default method
		//AnnotatedFuctionalInterface example =  (k) -> {return null;};
		example.printName("Ankit");
	}
	
	
}
