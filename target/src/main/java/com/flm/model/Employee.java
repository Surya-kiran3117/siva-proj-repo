package com.flm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {

	private Long id;
	private String name;
	private String address;
	private Double salary;
	
	
	public Employee(String name, String address, Double salary) {
	    this.name = name;
		this.address = address;
		this.salary = salary;
	}

	
	
	
	
	
}
