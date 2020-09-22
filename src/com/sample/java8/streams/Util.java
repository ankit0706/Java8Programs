package com.sample.java8.streams;

import java.util.Arrays;
import java.util.List;
/**
 * Utility class
 * @author AANU
 *
 */
public class Util {
	/**
	 * creates a list of funds
	 * @return list of created funds
	 */
	static List<Fund> getFundsList() {
		Fund f1 = new Fund();
		f1.setFundHouse("BlackRock");
		f1.setFundName("BR Money Market");
		f1.setNav(148.69);
		
		Fund f2 = new Fund();
		f2.setFundHouse("Vanguard");
		f2.setFundName("VG Index equity");
		f2.setNav(52.12);
		
		Fund f3 = new Fund();
		f3.setFundHouse("Charles Schwab");
		f3.setFundName("CS Treasury Bills");
		f3.setNav(172.18);
		
		Fund f4 = new Fund();
		f4.setFundHouse("Fidelity funds");
		f4.setFundName("Blue Chip");
		f4.setNav(90.28);
		
		Fund f5 = new Fund();
		f5.setFundHouse("Franklin Templaton");
		f5.setFundName("FT precious metals fund");
		f5.setNav(124.30);
		
		Fund f6 = new Fund();
		f6.setFundHouse("Citi funds");
		f6.setFundName("Citi Commodities fund");
		f6.setNav(234.19);
		
		Fund f7 = new Fund();
		f7.setFundHouse("Allianz funds");
		f7.setFundName("Allianz Green Energy fund");
		f7.setNav(113.05);
		
		Fund f8 = new Fund();
		f8.setFundHouse("Metlife funds");
		f8.setFundName("Metlife Infra fund");
		f8.setNav(92.35);
		// Direct creation of List from objects
		List<Fund> fundList = Arrays.asList(f1, f2, f3, f4, f5, f6, f7, f8);
		
		return fundList;
	}
}
