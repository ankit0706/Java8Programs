package com.sample.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using streams we can leverage the power of TOP clause in SQL.
 * We will get a list of items, then we will print the top 2 and 
 * the bottom 2 using stream's limit and skip methods
 * @author AANU
 *
 */
public class TopAndBottom {

	public static void main(String[] args) {
		List<Fund> fundsList = Util.getFundsList();
		//sort in alphabetical order
		Stream<String> fundStream = fundsList.stream()
											  .map(f -> f.getFundHouse())
											  .sorted();
		//get top 2
		List<String> top2Items = fundStream.limit(2)
				    						.collect(Collectors.toList());
		System.out.println(top2Items);
		//get bottom 2
		int streamSize  = (int)fundsList.stream().map(f -> f.getFundHouse()).sorted().count();
		Stream<String> fundStream2 = fundsList.stream().map(f -> f.getFundHouse()).sorted();
		List<String> last2Items = fundStream2.skip(streamSize - 2).collect(Collectors.toList());
		System.out.println(last2Items);
	}

}
