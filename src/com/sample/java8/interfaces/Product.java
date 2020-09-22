package com.sample.java8.interfaces;

public class Product implements Tradable{
	
	double price;
	int quantity;
	String name;
	
	public static void main(String[] args) {
		Product product = new Product();
		product.setPrice(56.71);
		product.setQuantity(10);
		product.setName("Candles");
		System.out.println("Sell result = " + product.sell());
		String boughtProduct = product.buy();
		Tradable.printResult(boughtProduct);
		//calling interface's default method
		product.printTime();
		
		Product product2 = new Product();
		product2.setPrice(69.04);
		product2.setQuantity(15);
		product2.setName("Jazz");
		System.out.println("Sell result = " + product2.sell());
		String boughtProduct2 = product2.buy();
		//calling the interface's static method
		Tradable.printResult(boughtProduct2);
		//calling interface's default method
		product2.printTime();
	}
	
	@Override
	public double sell() {
		return price * quantity;
	}

	@Override
	public String buy() {
		return name;
	}
	
	private void setPrice(double d) {
		this.price = d;
	}
	
	private void setQuantity(int q) {
		this.quantity = q;
	}
	
	private void setName(String n) {
		this.name = n;
	}
	
	/*Optional override
	 * It's override is not enforced
	 * We call the default implementation used in interface
	 * (non-Javadoc)
	 * @see com.sample.java8.interfaces.Tradable#printTime()
	 */
	@Override
	public void printTime() {
		System.out.println("Current time is:");
		Tradable.super.printTime();
	}
}
