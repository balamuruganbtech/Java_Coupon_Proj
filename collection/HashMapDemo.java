package com.collection;

import java.util.HashMap;

class Movie {
	String name, actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public boolean equals(Object obj) {
		 Movie m = (Movie) obj;
		 return m.actor.equals(this.actor) && m.name.equals(this.name);
	}

	public int hashCode() {
		return this.name.hashCode()+this.actor.hashCode();

	}
}

public class HashMapDemo {
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie m4 = new Movie();

		m1.setActor("Ajith");
		m1.setName("Vivevagam");

		m2.setActor("Vijay");
		m2.setName("Mersal");

		m3.setActor("Ajith");
		m3.setName("Vivevagam");
		
		m4.setActor("Sethupathi");
		m4.setName("Vickram vedha");
		
		System.out.println("Object name\t Address");
		System.out.println("============\t============");
		System.out.println("m1"+"\t"+m1.hashCode());
		System.out.println("m2"+"\t"+m2.hashCode());
		System.out.println("m3"+"\t"+m3.hashCode());
		System.out.println("m4"+"\t"+m4.hashCode());
		
		
		HashMap<Movie, String> hm = new HashMap<Movie, String>();
		hm.put(m1, "ajith");
		hm.put(m2, "vijay");
		hm.put(m3, "duplicate ajith");
		hm.put(m4, "vickram vedha");
		
		System.out.println("Name\tHashcode");
		System.out.println("======\t======");
		for(Movie m : hm.keySet()){
			System.out.println(hm.get(m)+" \t"+hm.get(m).hashCode());
		}
	}
}
