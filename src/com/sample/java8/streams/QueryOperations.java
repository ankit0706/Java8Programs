package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 * Use of query aggregate operations like
 * SUM, AVG, COUNT, MAX and MIN
 * @author AANU
 *
 */
public class QueryOperations {

	public static void main(String[] args) {
		ArrayList<Fund> fundList = new ArrayList<>();
		fundList.addAll(Util.getFundsList());
		//1. SUM
		double sum = fundList.stream().mapToDouble(f -> f.getNav()).sum();
		System.out.println("sum = " + sum);
		//2. AVG
		OptionalDouble avg = fundList.stream().mapToDouble(f -> f.getNav()).average();
		System.out.println("avg = " + avg.getAsDouble());
		//3. COUNT
		long count = fundList.stream().mapToDouble(f -> f.getNav()).count();
		System.out.println("count = " + count);
		//4. MAX
		OptionalDouble max = fundList.stream().mapToDouble(f -> f.getNav()).max();
		System.out.println("max = " + max.getAsDouble());
		//5. MIN
		OptionalDouble min = fundList.stream().mapToDouble(f -> f.getNav()).min();
		System.out.println("min = " + min.getAsDouble());
	}

}
