package com.sample.java8.streams;

import java.util.List;

/**
 * We can define a condition and check whether any, all or none of
 * the elements in the stream match this condition
 * @author AANU
 *
 */
public class MatchConditions {

	public static void main(String[] args) {
		List<Fund> fundsList = Util.getFundsList();
		//match any
		boolean isAnyMatch = fundsList.stream().anyMatch(f -> f.getFundName().contains("Market"));
		System.out.println("isAnyMatch = "  + isAnyMatch);
		//match all
		boolean isAllMatch = fundsList.stream().allMatch(f -> f.getFundName().contains("Market")); 
		System.out.println("isAllMatch = "  + isAllMatch);
		//match none
		boolean isMatchNone = fundsList.stream().noneMatch(f -> f.getFundName().contains("funds"));
		System.out.println("isMatchNone = "  + isMatchNone);
	}

}
