package com.collection.hashCodeAndEquals;

import java.util.HashSet;

class Emp {

	private int age;

	public Emp(int age) {
		super();
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		return true;
	}

	public String toString() {
		return "Emp [age=" + age + "]";
	}

}

public class HashCodeAndEqualsTest {

	public static void main(String[] args) {
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);
		Emp emp3 = new Emp(25);
		Emp emp4 = new Emp(24);
		Emp emp5 = new Emp(24);

		System.out.println("emp1.hashCode()--->>> Override code= " + emp1.hashCode() + " Original hashcode= " + System.identityHashCode(emp1));
		System.out.println("emp2.hashCode()--->>> Override code= " + emp2.hashCode() + " Original hashcode= " + System.identityHashCode(emp2));
		System.out.println("emp3.hashCode()--->>> Override code= " + emp3.hashCode() + " Original hashcode= " + System.identityHashCode(emp3));
		System.out.println(emp1.equals(emp2));

		HashSet<Emp> hs = new HashSet<Emp>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);

		System.out.println(hs);
		/*
		 * System.out.println("hs.contains( new Emp(24))--->>>" +
		 * hs.contains(emp5));
		 * System.out.println("HashSet Size--->>>" + hs.size());
		 * System.out.println("hs.contains( new Emp(23))--->>>" +
		 * hs.contains(new Emp(23)));
		 * System.out.println("hs.remove( new Emp(24)--->>>" + hs.remove(new
		 * Emp(24)));
		 * System.out.println("Now HashSet Size--->>>" + hs.size());
		 */
	}

}
