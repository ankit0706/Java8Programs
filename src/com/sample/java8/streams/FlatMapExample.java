package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list1 = random.ints(10, 0, 10).boxed().collect(Collectors.toList());
		System.out.println(list1);
		List<Integer> list2 = random.ints(10, 0, 10).boxed().collect(Collectors.toList());
		System.out.println(list2);
		List<Integer> list3 = random.ints(10, 0, 10).boxed().collect(Collectors.toList());
		System.out.println(list3);
		List<Integer> list4 = random.ints(10, 0, 10).boxed().collect(Collectors.toList());
		System.out.println(list4);
		List<List<Integer>> denseList = new ArrayList<>();
		denseList.add(list1);
		denseList.add(list2);
		denseList.add(list3);
		denseList.add(list4);
		System.out.println(denseList);
		Stream<Integer> flattenedList = denseList.stream().flatMap(list -> list.stream());
		int total = flattenedList.map(i -> i.intValue()).reduce(0, (i1, i2) -> i1 + i2);
		System.out.println("total = " + total);
	}

}
