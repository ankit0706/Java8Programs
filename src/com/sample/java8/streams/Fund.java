package com.sample.java8.streams;
/**
 * Plain old java class or Bean class for fund
 * @author AANU
 *
 */
public class Fund {
	private String fundName;
	private String fundHouse;
	private double nav;
	
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getFundHouse() {
		return fundHouse;
	}
	public void setFundHouse(String fundHouse) {
		this.fundHouse = fundHouse;
	}
	public double getNav() {
		return nav;
	}
	public void setNav(double nav) {
		this.nav = nav;
	}
}
