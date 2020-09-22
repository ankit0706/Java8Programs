package com.sample.java8.lambdas2;
/**
 * Here we go one step further than Single expression.
 * We want to execute a whole block of code and not just a 
 * single line inside our functional interface's method.
 * We will take the runnable interface again, but this 
 * time instead of printing a single line, we will have a
 * whole block of code.
 * @author AANU
 *
 */
public class LambdaForBlockOfCode {
	public static void main(String[] args) {
		new Thread(() -> {
			int i = 1;
			while(i < 11) {
				int square = i * i;
				System.out.println(square);
				i++;
			}
		}).start(); 
	}	
}
