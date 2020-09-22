package com.sample.java8.lambdas2;

public class Employee {
	
	private String employeeName;

	public static void main(String[] args) {
		ConstructorInterface example = Employee::new;
		Employee e = example.getEmployee("John");
		System.out.println(e.getName());
	}
	
	Employee(String name){
		this.employeeName = name;
	}
	
	private String getName() {
		return employeeName;
	}

}
