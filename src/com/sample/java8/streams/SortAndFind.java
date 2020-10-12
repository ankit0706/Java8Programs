package com.sample.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
/**
 * 1. When items can be sorted according to their natural ordering, passing a comparator is not necessary
 * 2. The items can also be sorted in reverse order using Comparator.reversed() method
 * 3. forEach() methods can be used to call an action on each element of stream like printing on console
 * 4. findAny or findFirst return an Optional object from stream. We can check if there are any such
 *    item is present. If not present, it means the stream was empty, else we can get the value of item.
 *
 * @author AANU
 *
 */
public class SortAndFind {

	public static void main(String[] args) {
		ArrayList<Fund> fundList = new ArrayList<>();
		fundList.addAll(Util.getFundsList());
		//sort fund house names
		fundList.stream().map(f -> f.getFundHouse()).sorted().forEach(e -> System.out.println(e));
		//sort in reverse order
		fundList.stream().map(f -> f.getFundHouse()).sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
		//find First
		Stream<String> fundHouseStream = fundList.stream().map(f -> f.getFundHouse());
		Optional<String> optional = fundHouseStream.findFirst();
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		//find Any, no match condition
		Stream<String> filteredFundHouseStream = fundList.stream().map(f -> f.getFundHouse()).filter(name -> name.contains("Bull"));
		Optional<String> filteredElement = filteredFundHouseStream.findAny();//optional may contain a null value
		if(filteredElement.isPresent()) {
			System.out.println(filteredElement.get());
		}else {
			System.out.println("Stream is empty. No elements matched");
		}
		//find Any, multiple match condition
		Stream<String> multiMatchStream = fundList.stream().map(f -> f.getFundHouse()).filter(name -> name.contains(" "));
		Optional<String> filteredElement1 = multiMatchStream.findAny();
		if(!filteredElement1.isPresent()) {
			System.out.println("Stream is empty. No elements matched");
		}else {
			System.out.println(filteredElement1.get());
		}
	}

}
