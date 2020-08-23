package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	Integer id;
	String name;
	transient String salary;// now it will not be serialized

	public Employee(Integer id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
