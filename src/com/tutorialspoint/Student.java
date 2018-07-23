package com.tutorialspoint;

public class Student {
	private Integer age;
	private String name;
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
	
	

}
