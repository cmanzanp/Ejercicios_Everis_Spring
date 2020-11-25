package com.everis.spring.repository;

public class EverisPerson {
	
	private String name;
	private String last_name_one;
	private String last_name_two;
	
	public EverisPerson(String name, String last_name_one, String last_name_two) {
		super();
		this.name = name;
		this.last_name_one = last_name_one;
		this.last_name_two = last_name_two;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name_one() {
		return last_name_one;
	}

	public void setLast_name_one(String last_name_one) {
		this.last_name_one = last_name_one;
	}

	public String getLast_name_two() {
		return last_name_two;
	}

	public void setLast_name_two(String last_name_two) {
		this.last_name_two = last_name_two;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", last_name_one=" + last_name_one + ", last_name_two=" + last_name_two + "]";
	}
	
	
	
}
