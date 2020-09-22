package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterSortAndMap {
	
	public static void main(String[] args) {
		ArrayList<Fund> fundList = new ArrayList<>();
		fundList.addAll(Util.getFundsList());
		//filter out funds below 100
		Stream<Fund> fundStream = fundList.stream();
		Stream<Fund> filteredStream = fundStream.filter(f -> f.getNav() > 100.00d);
		//sort
		Stream<Fund> sortedStream = filteredStream.sorted((f1, f2) -> f1.getFundHouse().compareTo(f2.getFundHouse()));
		//map
		Stream<String> mappedStream = sortedStream.map(f -> f.getFundName());
		//collect
		List<String> collectedItemsList = mappedStream.collect(Collectors.toList());
		//print
		System.out.println(collectedItemsList);
	}

	
}

