package com.company;

public class Human {
	private String name = "Max";
	private short age;
	
	void printHello() {
		System.out.println("Hello " + name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		if (name.isEmpty()) {
			System.out.println("Name cannot be empty!");
		}
		else {
			this.name = name;
		}
	}
	
	public short getAge() {
		return this.age;
	}
	
	public void setAge(final short age) {
		if (age >= 0 && age < 200) {
			this.age = age;
		}else {
			System.out.println("Age cannot be less than 0 or more than 200 years");
		}
	}
}
