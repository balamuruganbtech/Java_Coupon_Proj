package com.collection.compare;

import java.util.ArrayList;
import java.util.Collections;

/*
 * class EmpIdCompare implements Comparable<Employee>{
 * @Override
 * public int compareTo(Employee o) {
 * // TODO Auto-generated method stub
 * return 0;
 * }
 * }
 */
class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Employee o) {
		// -1, 0 , 1
		// System.out.println(this.id - o.id);
		if (this.name.compareTo(o.name) == 0) {
			return 0;
		}
		else if (this.name.compareTo(o.name) > 0) {
			return 1;
		}
		return -1;
	}

}

public class ComparableApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setId(2);
		e1.setName("sajuu");

		e2.setId(1);
		e2.setName("jebin");

		e3.setId(3);
		e3.setName("bala");

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		System.out.println(al);

		/*
		 * You cannot do like this for comparable, which is only for comparator
		 * Collections.sort(al, new EmpIdCompare());
		 */
		Collections.sort(al);

		System.out.println(al);

	}

}
