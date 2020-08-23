package com.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeComparator {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeComparator [id=" + id + ", name=" + name + "]";
	}

}

class EmployeeNameComparator implements Comparator<EmployeeComparator> {
	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		if (o1.getName().compareTo(o2.getName()) > 0)
			return 1;
		else if (o1.getName().compareTo(o2.getName()) < 0)
			return -1;
		return 0;
	}
}

class EmployeeIdComparator implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		if (o1.getId() == o2.getId()) {
			return 0;
		}
		else if (o1.getId() > o2.getId()) {
			return 1;
		}
		return -1;
	}

}

public class ComparatorApp {

	public static void main(String[] args) {
		EmployeeComparator e1 = new EmployeeComparator();
		EmployeeComparator e2 = new EmployeeComparator();
		EmployeeComparator e3 = new EmployeeComparator();

		e1.setId(1);
		e1.setName("Jebin");

		e2.setId(2);
		e2.setName("Sajuu");

		e3.setId(3);
		e3.setName("Bala");

		ArrayList<EmployeeComparator> al = new ArrayList<EmployeeComparator>();
		al.add(e1);
		al.add(e3);
		al.add(e2);

		System.out.println("=============== As-usual preserved order ===============");
		System.out.println(al);
		System.out.println();

		Collections.sort(al, new EmployeeNameComparator());
		System.out.println("=============== Sort By Name ===============");
		System.out.println(al);
		System.out.println();

		Collections.sort(al, new EmployeeIdComparator());
		System.out.println("=============== Sort By Id ===============");
		System.out.println(al);
		System.out.println();

	}

}
