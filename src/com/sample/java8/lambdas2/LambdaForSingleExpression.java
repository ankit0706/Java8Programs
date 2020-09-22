package com.sample.java8.lambdas2;
/**
 * Here we create an example where we will use lambda
 * expression for the runnable interface which is a 
 * functional interface and inside the interface's run
 * method we have a single line of logic. 
 * @author AANU
 *
 */
public class LambdaForSingleExpression {
	public static void main(String[] args) {
		//execute runnable with anonymous class
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Hello World !");
//			}
//			
//		}).start();
		//execute runnable with lambda
		new Thread(() -> System.out.println("Hola Mundo !")).start();
	}
}
