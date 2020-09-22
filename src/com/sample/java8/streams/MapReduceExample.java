package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Map Reduce functionality implemented using 
 * Java 8's Streams API with Lambda expressions.
 * @author AANU
 *
 */
public class MapReduceExample {
	public static void main(String[] args) {
		computeAndPrint();
	}
	
	/*
	 *Map Reduce function
	 *Get the nav of all funds and print their sum 
	 */
	private static void computeAndPrint() {
		//conversion of List into arrayList
		ArrayList<Fund> fundList = new ArrayList<>();
		fundList.addAll(Util.getFundsList());
		//1. create stream
		Stream<Fund> fundStream = fundList.stream();
		//2. map
		Stream<Double> navStream = fundStream.map(f -> f.getNav());
		//3. reduce
		Double navSum = navStream.reduce(0.0d, (f1, f2) -> f1 + f2);
		//4. print
		System.out.println(navSum.doubleValue());
	}
}
