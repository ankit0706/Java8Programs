package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/**
 * This class demonstrates the use to mapTo...
 * methods provided in the stream API. These methods
 * are provided for operations that involve primitive
 * values like double, long and int. Without the use
 * of these specific methods like mapToInt, mapToLong
 * and mapToDouble, we will get Integer, Double and Long
 * objects as result of our reduce operations. These objects
 * further invoke intValue(), doubleValue and longValue methods
 * on them to get the primitive values. Hence by use of these 
 * specialized streams for primitives we skip some additional
 * code and get the job done, faster.
 * @author AANU
 *
 */
public class MapToPrimitives {

	public static void main(String[] args) {
		ArrayList<Fund> fundList = new ArrayList<>();
		fundList.addAll(Util.getFundsList());
		//double
		DoubleStream stream1 = fundList.stream().mapToDouble(f -> f.getNav());
		double result1 = stream1.reduce(0.0d, (d1, d2) -> d1+d2);
		System.out.println(result1);
		//int
		IntStream stream2 = fundList.stream().mapToInt(f -> (int)f.getNav());
		int result2 = stream2.reduce(0, (i1, i2) -> i1+i2);
		System.out.println(result2);
		//long
		LongStream stream3 = fundList.stream().mapToLong(f -> (long)f.getNav());
		long result3 = stream3.reduce(0, (l1, l2) -> l1 + l2);
		System.out.println(result3);
	}

}
