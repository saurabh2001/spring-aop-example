package com.springaop.model;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void throwException(){
		throw new RuntimeException("Exception thrown for test purpose .");
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
}
