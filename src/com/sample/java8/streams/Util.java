package com.sample.java8.streams;

import java.util.Arrays;
import java.util.List;
/**
 * Utility class
 * @author AANU
 *
 */
public class Util {
	static List<Fund> getFundList() {
		Fund f1 = new Fund();
		f1.setFundHouse("BlackRock");
		f1.setFundName("BR Money Market");
		f1.setNav(148.69);
		//
		Fund f2 = new Fund();
		f2.setFundHouse("Vanguard");
		f2.setFundName("VG Index equity");
		f2.setNav(52.12);
		//
		Fund f3 = new Fund();
		f3.setFundHouse("Charles Schwab");
		f3.setFundName("CS Treasury Bills");
		f3.setNav(172.18);
		//
		Fund f4 = new Fund();
		f4.setFundHouse("Fidelity funds");
		f4.setFundName("Blue Chip");
		f4.setNav(90.28);
		// Direct creation of List from objects
		List<Fund> funds = Arrays.asList(f1, f2, f3, f4);
		
		return funds;
	}
}
